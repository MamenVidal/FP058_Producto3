package TheBigDev.modelo.dao;

import TheBigDev.modelo.Articulo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ArticuloDao implements DaoInterface<Articulo, String> {

    final static String TABLE_NAME = "articulos";

    private static Connection getConnection() {
        return TheBigDevConnection.getConnection();
    }

    public void insert(Articulo articulo) {
        Connection conn = getConnection();
        if (conn != null) {
            try {
                // Deshabilitar el modo de confirmación automática
                conn.setAutoCommit(false);

                // template sql insert
                String query = "INSERT INTO $tableName (codigo, descripcion, precioVenta, gastoEnvio, tiempo) VALUES (?,?,?,?,?);"
                        .replace("$tableName", TABLE_NAME);
                // insert tablename from variable
                PreparedStatement stmt = conn.prepareStatement(query);
                stmt.setString(1, articulo.getCodigo());
                stmt.setString(2, articulo.getDescripcion());
                stmt.setFloat(3, articulo.getPrecioVenta());
                stmt.setFloat(4, articulo.getGastoEnvio());
                stmt.setInt(5, articulo.getTiempo());
                // And then do an executeUpdate
                stmt.executeUpdate();

                // Realizar el commit
                conn.commit();
            } catch (Exception e) {
                try {
                    // Realizar el rollback en caso de errores
                    conn.rollback();
                } catch (SQLException rollbackEx) {
                    rollbackEx.printStackTrace();
                }
                throw new RuntimeException(e);
            } finally {
                try {
                    // Reestablecer el modo de confirmación automática antes de cerrar la conexión
                    conn.setAutoCommit(true);
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void update(Articulo articulo) {
        Connection conn = getConnection();
        if (conn != null) {
            try {
                // Deshabilitar el modo de confirmación automática
                conn.setAutoCommit(false);

                // template sql update
                String query = "UPDATE $tableName SET descripcion = ?, precioVenta = ?, gastoEnvio = ?, tiempo = ? WHERE codigo = ?;"
                        .replace("$tableName", TABLE_NAME);
                // set variables
                PreparedStatement stmt = conn.prepareStatement(query);
                stmt.setString(1, articulo.getDescripcion());
                stmt.setFloat(2, articulo.getPrecioVenta());
                stmt.setFloat(3, articulo.getGastoEnvio());
                stmt.setInt(4, articulo.getTiempo());
                stmt.setString(5, articulo.getCodigo());
                // And then do an executeUpdate
                stmt.executeUpdate();

                // Realizar el commit
                conn.commit();
            } catch (Exception e) {
                try {
                    // Realizar el rollback en caso de errores
                    conn.rollback();
                } catch (SQLException rollbackEx) {
                    rollbackEx.printStackTrace();
                }
                throw new RuntimeException(e);
            } finally {
                try {
                    // Reestablecer el modo de confirmación automática antes de cerrar la conexión
                    conn.setAutoCommit(true);
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void delete(Articulo articulo) {
        Connection conn = getConnection();
        if (conn != null) {
            try {
                // template sql update
                String query = "DELETE FROM $tableName WHERE codigo = ?;".replace("$tableName", TABLE_NAME);
                // set variables
                PreparedStatement stmt = conn.prepareStatement(query);
                stmt.setString(1, articulo.getCodigo());
                // And then do an execute
                stmt.execute();
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public Articulo read(String codigo) {
        Connection conn = getConnection();
        if (conn != null) {
            try {
                // template sql update
                String query = "SELECT * FROM $tableName WHERE codigo = ?;".replace("$tableName", TABLE_NAME);
                // set variables
                PreparedStatement stmt = conn.prepareStatement(query);
                stmt.setString(1, codigo);
                // And then do an execute
                ResultSet rs = stmt.executeQuery();
                int columnCount = rs.getMetaData().getColumnCount();
                while (rs.next()) {
                    Articulo row = new Articulo(
                            rs.getString(1),
                            rs.getString(2),
                            rs.getFloat(3),
                            rs.getFloat(4),
                            rs.getInt(5));
                    return row;
                }
                return null;
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    public ArrayList<Articulo> list() {
        Connection conn = getConnection();
        if (conn != null) {
            try {
                // template sql update
                String query = "SELECT * FROM $tableName;".replace("$tableName", TABLE_NAME);
                // set variables
                PreparedStatement stmt = conn.prepareStatement(query);
                // And then do an execute
                ResultSet rs = stmt.executeQuery();
                int columnCount = rs.getMetaData().getColumnCount();
                ArrayList<Articulo> rows = new ArrayList<Articulo>();
                while (rs.next()) {
                    Articulo row = new Articulo(
                            rs.getString(1),
                            rs.getString(2),
                            rs.getFloat(3),
                            rs.getFloat(4),
                            rs.getInt(5));
                    rows.add(row);
                }
                return rows;
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

}

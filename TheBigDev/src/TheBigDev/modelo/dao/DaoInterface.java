package TheBigDev.modelo.dao;

import java.util.ArrayList;

public interface DaoInterface<T, R> {

    public void insert(T o);

    public ArrayList<T> list();

    public void update(T o);

    public void delete(T o);

    public T read(R o);
}

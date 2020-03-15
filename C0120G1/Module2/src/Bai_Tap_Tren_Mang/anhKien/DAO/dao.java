package Bai_Tap_Tren_Mang.anhKien.DAO;

import java.util.List;

public interface dao<T> {
    List<T> getAll();
    void addNew(T t);
    void delete(T t);
    void edit(T t);
}

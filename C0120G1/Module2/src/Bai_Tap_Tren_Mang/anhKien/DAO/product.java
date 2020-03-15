package Bai_Tap_Tren_Mang.anhKien.DAO;

import Bai_Tap_Tren_Mang.anhKien.Models.Product;

public interface product extends dao{
    Product findByID(int id);
}

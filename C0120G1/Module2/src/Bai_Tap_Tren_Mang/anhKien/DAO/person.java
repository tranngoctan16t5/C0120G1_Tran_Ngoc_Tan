package Bai_Tap_Tren_Mang.anhKien.DAO;

import Bai_Tap_Tren_Mang.anhKien.Models.Person;

public interface person extends dao {
    Person findByName(String name);
}

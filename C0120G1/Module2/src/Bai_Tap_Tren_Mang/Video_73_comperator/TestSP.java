package Bai_Tap_Tren_Mang.Video_73_comperator;

import java.util.ArrayList;
import java.util.Collections;

public class TestSP {
    public static void main(String[] args) {
        ArrayList<SanPham> list = new ArrayList<>();
        list.add(new SanPham(1, "B", 20));
        list.add(new SanPham(2, "C", 100));
        list.add(new SanPham(3, "A", 90));
        System.out.println("Danh sach san pham :");
        for (SanPham sp : list) {
            System.out.println(sp);
        }
        Collections.sort(list);
        System.out.println("Danh sach san pham sau khi sap xep:");
        for (SanPham sp : list) {
            System.out.println(sp);
        }
    }
}

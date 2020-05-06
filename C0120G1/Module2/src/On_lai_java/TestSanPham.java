package On_lai_java;

import java.util.ArrayList;
import java.util.Collections;

public class TestSanPham {
    public static void main(String[] args) {
        ArrayList<SanPham> dsSP = new ArrayList<>();
        dsSP.add(new SanPham(1, "coca", 25));
        dsSP.add(new SanPham(2, "pepsi", 15));
        dsSP.add(new SanPham(3, "sting", 20));
        System.out.println("Danh sach san pham:");
        for (SanPham sp : dsSP) {
            System.out.println(sp);
        }
            Collections.sort(dsSP);
            System.out.println("Danh sach san pham sau khi sort");
            for (SanPham sp : dsSP) {
                System.out.println(sp);
        }
    }

}

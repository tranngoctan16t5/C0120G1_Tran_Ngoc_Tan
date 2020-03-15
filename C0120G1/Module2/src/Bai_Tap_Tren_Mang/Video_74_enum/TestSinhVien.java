package Bai_Tap_Tren_Mang.Video_74_enum;

import java.util.ArrayList;

public class TestSinhVien {
    public static void main(String[] args) {
        ArrayList<SinhVien>list=new ArrayList<>();
        list.add(new SinhVien(1,"tan", (double) 10));
        list.add(new SinhVien(2,"hoa", (double) 1));
        list.add(new SinhVien(3,"linh", (double) 7));
        list.add(new SinhVien(4,"cuong", (double) 5));
        System.out.println("Danh sach sinh vien");
        for (SinhVien item:list){
            System.out.println(item);
        }
    }
}

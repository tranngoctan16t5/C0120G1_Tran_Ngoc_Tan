package Bai_Tap_Tren_Mang.Video_75_renluyen1;

import Bai_Tap_Tren_Mang.Video_74_enum.SinhVien;

import java.util.Scanner;

public class TestNhanVien {
    public static void main(String[] args) {
        NhanVien nv1,nv2;
        System.out.println("nhap thong tin nv1");
        System.out.println("Nhap ho");
        String ho1=new Scanner(System.in).nextLine();
        System.out.println("Nhap ten");
        String ten1=new Scanner(System.in).nextLine();
        System.out.println("So san pham");
        int soSp1=new Scanner(System.in).nextInt();
        nv1=new NhanVien(ho1,ten1,soSp1);

        System.out.println("nhap thong tin nv2");
        System.out.println("Nhap ho");
        String ho2=new Scanner(System.in).nextLine();
        System.out.println("Nhap ten");
        String ten2=new Scanner(System.in).nextLine();
        System.out.println("So san pham");
        int soSp2=new Scanner(System.in).nextInt();
        nv2=new NhanVien(ho2,ten2,soSp2);

        System.out.println("luong nhan vien 1="+nv1.getLuong());
        System.out.println("luong nhan vien 2="+nv2.getLuong());

        if(nv1.lonHon(nv2)){
            System.out.println("Nhan vien ["+nv1.getHo()+" "+nv1.getTen()+"] co nhieu san pham hon la");
            System.out.println(nv1.getSoSP()-nv2.getSoSP());
        }else {
            System.out.println("Nhan vien ["+nv2.getHo()+" "+nv2.getTen()+"] co nhieu san pham hon la");
            System.out.println(nv2.getSoSP()-nv1.getSoSP());
        }
    }
}

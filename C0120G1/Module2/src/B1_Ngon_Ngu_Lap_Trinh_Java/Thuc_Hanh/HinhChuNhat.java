package B1_Ngon_Ngu_Lap_Trinh_Java.Thuc_Hanh;

import java.util.Scanner;

public class HinhChuNhat {
    public static void main(String[] args) {
        float chieuDai;
        float chieuRong;

        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập vào chiều dài");
        chieuDai=sc.nextFloat();

        System.out.println("Nhập vào chiều rộng");
        chieuRong=sc.nextFloat();

        double area=chieuDai*chieuRong;
        System.out.println(area);
    }
}

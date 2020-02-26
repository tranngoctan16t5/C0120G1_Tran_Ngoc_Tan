package B2_Mang_Va_Phuong_Thuc_Trong_Java.Bai_Tap;

import java.util.Scanner;

public class DemSoLanXuatHienKiTu {

    public static void main(String[] args) {
        while (true) {
            String str = "Tranngoctan";
            char nhap;
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap vao ki tu can tim");
            nhap = sc.nextLine().charAt(0);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == nhap) {
                    count++;
                }
            }
            System.out.printf("so lan xuat hien cua ki tu %s trong chuoi la %d \n ", nhap, count);

        }
    }
}

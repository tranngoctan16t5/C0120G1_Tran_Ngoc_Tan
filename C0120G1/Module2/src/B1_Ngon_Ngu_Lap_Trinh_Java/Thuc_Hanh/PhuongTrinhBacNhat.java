package B1_Ngon_Ngu_Lap_Trinh_Java.Thuc_Hanh;

import java.util.Scanner;

public class PhuongTrinhBacNhat {
    public static void main(String[] args) {
        double a, b, x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào biến a");
        a = sc.nextFloat();
        System.out.println("Nhập vào biến b");
        b = sc.nextFloat();
        if (a == 0) {
            System.out.println("Phương trình vô nghiệm");
        }
        if (a != 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm");
            } else {
               x=-b/a;
                System.out.println("Phương trình có nghiệm là "+ x);
            }
        }
    }
}
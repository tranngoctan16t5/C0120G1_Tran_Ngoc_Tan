package B1_Ngon_Ngu_Lap_Trinh_Java.Thuc_Hanh;

import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        while (true) {
            int thang;
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập vào tháng cần kiểm tra\n");
            thang = sc.nextInt();
            switch (thang) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 11:
                    System.out.printf("tháng %d có 31 ngày\n", thang);
                    break;
                case 2:
                    System.out.printf("tháng %d có 28 hoặc 29 ngày\n", thang);
                    break;
                case 4:
                case 6:
                case 10:
                case 12:
                    System.out.printf("Tháng %d có 30 ngày \n", thang);
                    break;
            }
        }
    }
}

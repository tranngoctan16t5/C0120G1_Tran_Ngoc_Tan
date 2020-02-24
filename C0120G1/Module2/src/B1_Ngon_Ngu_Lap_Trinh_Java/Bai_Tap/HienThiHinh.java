package B1_Ngon_Ngu_Lap_Trinh_Java.Bai_Tap;

import java.util.Scanner;

public class HienThiHinh {
    public static void main(String[] args) {
        while (true) {
            int nhap;
            System.out.println("1.vẽ hình chữ nhật");
            System.out.println("2.vẽ hình tam giác top-left");
            System.out.println("3.vẽ hình tam giác top-right");
            System.out.println("4.vẽ hình tam giác bottom-left");
            System.out.println("5.vẽ hình tam giác bottom-right");
            System.out.println("6.vẽ hình tam giác cân");
            System.out.println("=====================================");
            Scanner input = new Scanner(System.in);
            nhap = input.nextInt();
            switch (nhap) {
                case 1:
                    hinhChuNhat();
                    break;
                case 2:
                    hinhTamGiacTraiBottom();
                    break;
                case 3:
                    hinhTamGiacRightTop();
                    break;
                case 4:
                    hinhTamGiacLeftTop();
                    break;
                case 6:
                    tamGiacCan();
                    break;

                default:
                    System.out.println("Faill");
                    break;
            }
        }
    }

    public static void hinhChuNhat() {
        int chieuDai;
        int chieuRong;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào chiều dài");
        chieuDai = input.nextInt();
        System.out.println("Nhập vào chiều rộng");
        chieuRong = input.nextInt();
        int num = 1;
        while (num <= chieuRong) {
            for (int i = 1; i <= chieuDai; i++) {
                System.out.print("*");
            }
            System.out.println();
            num++;
        }

    }

    public static void hinhTamGiacTraiBottom() {
        int num = 1;
        while (num < 10) {
            for (int i = 1; i <= num; i++) {
                System.out.print("* ");
            }
            System.out.println();
            num++;
        }
    }

    public static void hinhTamGiacLeftTop() {
        int num = 10;
        while (num >= 1) {
            for (int i = 1; i <= num; i++) {
                System.out.print("* ");
            }
            System.out.println();
            num--;
        }
    }

    public static void hinhTamGiacRightTop() {
        int num = 10;
        int temp = 1;
        while (num >= 1) {
            for (int i = 1; i <= num; i++) {
                System.out.print("*");
            }
            System.out.println();
            if (num != 1) {
                for (int j = 1; j <= temp; j++) {
                    System.out.print(" ");

                }
            }

            num--;
            temp++;
        }
    }

    public static void tamGiacCan() {
        final int HEIGHT = 4;
        int line = 1;
        String result = "";
        String space = "";
        String character = "";
        while (line <= HEIGHT) {
             space = "";
             character = "";
            for (int s=1;s<=HEIGHT-line;s++) space+="  ";
            for (int c=1;c<=2*line-1;c++) character+="* ";
            result += space+character+"\n";
            line++;
        }
        System.out.println(result);
    }
}

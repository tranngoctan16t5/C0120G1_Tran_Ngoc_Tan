package B1_Ngon_Ngu_Lap_Trinh_Java.Bai_Tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        while (true) {
            int nhap;
            Scanner sc = new Scanner(System.in);
            System.out.println("ỨNG DỤNG CHUYỂN ĐỔI TIỀN TỆ");
            System.out.println("1.Đổi VND sang USD");
            System.out.println("2.Đổi USD sang VND");
            System.out.println("=====================================");
            nhap = sc.nextInt();
            switch (nhap) {
                case 1:
                    System.out.println(doiVND() + "USD");
                    break;
                case 2:
                    System.out.println(doiUSD() + "VND");
                    break;
                default:
                    System.out.println("Faill");
                    break;
            }
        }
    }
    public static int doiVND(){
        int money;
        int result;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số tiền cần đổi:");
        money=sc.nextInt();

        return result=money/23000;
    }
    public static int doiUSD(){
        int money;
        int result;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số tiền cần đổi:");
        money=sc.nextInt();

        return result=money*23000;
    }



}

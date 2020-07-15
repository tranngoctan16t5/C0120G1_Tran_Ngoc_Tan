package B1_Ngon_Ngu_Lap_Trinh_Java.Bai_Tap;

import java.util.Scanner;

public class SoThuanNghich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so n can kiem tra: ");
        int n = sc.nextInt();
        System.out.println(n + "la so thuan nghich :" + isThuanNghich(n));

    }
    public static boolean isThuanNghich(int n){
        String str = String.valueOf(n);
        int size = str.length();
        for (int i = 0; i < (size/2) ; i++) {
            if(str.charAt(i) != str.charAt(size-i-1)){
                return false;
            }

        }
        return true;
    }
}

package B1_Ngon_Ngu_Lap_Trinh_Java.Bai_Tap;

import java.util.Scanner;

public class HienThiSNT100 {
    public static void main(String[] args) {
        int count = 0;
        int so = 2;
        while (count < 100 && so<100) {

            if (isSNT(so)) {
                System.out.println(so);
                count++;
            }
            so++;
        }
    }


    public static boolean isSNT(int number) {
        if (number < 2) {
            return false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                } else {
                    return true;
                }
            }
            return true;
        }
    }
}

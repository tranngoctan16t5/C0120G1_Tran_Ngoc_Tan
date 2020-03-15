package Bai_Tap_oop.Bai1.Commons;

import java.util.Scanner;

public class FuncValidate {
    private static Scanner sc = new Scanner(System.in);

    public static int checkNumberInteger(String content, String errMes) {
        while (true) {
            try {
                System.out.println(content);
                return sc.nextInt();
            } catch (Exception ex) {
                System.out.println(errMes);
            }

        }
    }

}

package CaseStudy_Module2.Commons;

import java.util.Scanner;

public class FuncValidation {
    public static String regex = "";
    private static Scanner sc;

    //Check Name Valid
    public static boolean checkNameService(String str) {
        regex = "^[A-Z][a-z]+$";
        return str.matches(regex);
    }

    //Check Number Double
    public static double checkValidNumberDouble(String content, String errMes) {
        while (true) {
            try {
                sc = new Scanner(System.in);
                System.out.println(content);
                return sc.nextDouble();
            } catch (Exception ex) {
                System.out.println(errMes);
            }
        }
    }
    //check number Integer
    public static Integer checkValidNumberInteger(String content, String errMes) {
        while (true) {
            try {
                sc = new Scanner(System.in);
                System.out.println(content);
                return sc.nextInt();
            } catch (Exception ex) {
                System.out.println(errMes);
            }
        }
    }
}

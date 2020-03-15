package CaseStudy.Common;

import CaseStudy.Controller.MainController;
import CaseStudy.Model.Service;

import java.util.Calendar;
import java.util.Scanner;

public class FuncValidation {
    public static String regex = "";
    private static Scanner sc;

    //Check Name Valid
    public static boolean checkIdService(String str, Service service) {
        if (service.equals(MainController.villa)) {
            regex = "SVVL-[0-9]{4}";
            return str.matches(regex);
        } else if (service.equals(MainController.house)) {
            regex = "SVHO-[0-9]{4}";
            return str.matches(regex);
        } else {
            regex = "SVRO-[0-9]{4}";
            return str.matches(regex);
        }
    }

    public static boolean checkNameServices(String str) {
        regex = "^[A-Z][a-z]*";
        return str.matches(regex);

    }

    public static boolean checkNameCustomer(String str) {
        regex = "^([A-Z][a-z]+)([A-Z][a-z]+)*$";
        return str.matches(regex);
    }

    public static boolean checkEmail(String str) {
        regex = "\\w+@gmail\\.[a-z]+$";
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

    //check birthday
    public static Boolean checkValidBirthday(String str) {
        regex = "(0[1-9]|1[0-9]|2[0-9]|3[01])\\/(0[1-9]|1[012])\\/([1-2]99[0-9]|20[0-2]0)";
        return str.matches(regex);
    }

    public static boolean GenderException(String str) {
        return str.equals("male") || str.equals("female") || str.equals("unknown");
    }
    public static Boolean IdCardException(String str) {
        regex = "\\d{3}\\s\\d{3}\\s\\d{3}";
        return str.matches(regex);
    }
}



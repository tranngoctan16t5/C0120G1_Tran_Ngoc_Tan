package B2_Mang_Va_Phuong_Thuc_Trong_Java.Thuc_Hanh;

import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        while (true) {
            int nhap;
            double fahrenheit;
            double celsius;
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit ");
            Scanner sc = new Scanner(System.in);
            nhap = sc.nextInt();
            switch (nhap) {
                case 1:
                    System.out.println("Enter fahrenheit: ");
                    fahrenheit = sc.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter Celsius: ");
                    celsius = sc.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
    public static double celsiusToFahrenheit(double celsius){

        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;

    }
    public static double fahrenheitToCelsius(double fahrenheit){

        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;

    }
}

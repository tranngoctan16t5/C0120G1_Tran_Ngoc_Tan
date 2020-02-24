package B1_Ngon_Ngu_Lap_Trinh_Java.Thuc_Hanh;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        while (true) {


            int number;
            Scanner sc = new Scanner(System.in);
            System.out.printf("Nhập vào số cần kiểm tra :\n");
            number = sc.nextInt();
            if (number < 2) {
                System.out.printf("không phải là số nguyên tố \n");
            } else {
                int i = 2;
                boolean check = true;
                while (i < number) {
                    if (number % i == 0) {
                        check = false;
                        break;
                    }
                    i++;
                }
                if (check) {
                    System.out.printf("Là số nguyên tố\n");
                } else {
                    System.out.printf("Không phải là số nguyên tố\n");
                }
            }


        }


    }
}










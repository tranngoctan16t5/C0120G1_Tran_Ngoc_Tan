package B1_Ngon_Ngu_Lap_Trinh_Java.Bai_Tap;

import java.util.Scanner;

public class HienThiLoiChao {
    public static void main(String[] args) {
        while (true) {
            String name;
            Scanner sc = new Scanner(System.in);
            System.out.printf("Nhập vào tên :\n");
            name=sc.nextLine();
            System.out.printf("%s\n",name);
            System.out.printf("Hello: %s\n",name);

        }
    }
}

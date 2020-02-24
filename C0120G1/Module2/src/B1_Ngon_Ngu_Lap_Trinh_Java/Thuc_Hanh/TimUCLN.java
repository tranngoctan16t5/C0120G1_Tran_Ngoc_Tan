package B1_Ngon_Ngu_Lap_Trinh_Java.Thuc_Hanh;

import java.util.Scanner;

public class TimUCLN {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập vào số a :");
        a=sc.nextInt();
        System.out.println("Nhập vào số b :");
        b=sc.nextInt();
        a=Math.abs(a);
        b=Math.abs(b);
        while (a!=b){
            if(a>b){
                a=a-b;
            }else {
                b=b-a;
            }
        }
        System.out.println("Vậy UCLN của a và b là :"+a);

    }
}

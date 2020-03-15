package B3_Ke_Thua.Bai_Tap.Thiet_ke_trien_khai_lop_triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double canh1;
        double canh2;
        double canh3;
        double chieuCao;
        canh1=nhap("Nhap do dai canh 1");
        canh2=nhap("Nhap do dai canh 2");
        canh3=nhap("Nhap do dai canh 2");
        chieuCao=nhap("Nhap chieu cao");

        Triangle tg=new Triangle("Green",false,chieuCao,canh1,canh2,canh3);
        System.out.println(tg);

    }
    public static double nhap(String input){
        Scanner sc=new Scanner(System.in);
        System.out.println(input);
        double canh=sc.nextDouble();
        return canh;


    }
}

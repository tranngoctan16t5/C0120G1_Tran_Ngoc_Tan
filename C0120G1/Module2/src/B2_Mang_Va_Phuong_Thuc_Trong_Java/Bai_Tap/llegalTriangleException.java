package B2_Mang_Va_Phuong_Thuc_Trong_Java.Bai_Tap;

import java.util.Scanner;

public class llegalTriangleException {
    public static int doDai(String a){
        Scanner sc=new Scanner(System.in);
        boolean check=false;
        int n=0;
        while (!check){
            try {
                System.out.println(a);
                 n = sc.nextInt();
                 check=true;
            }catch (Exception e){
                System.out.println("Ban can nhap so");
                sc.nextInt();

            }
            if(n<0){
                System.out.println("Nhap so lon hon 0");
                check=false;
            }
        }
        return n;
    }
    public static void main(String[] args) {
//        llegalTriangleException suDungLopIllegalTriangleException = new llegalTriangleException();
        int a;
        int b;
        int c;
        a = doDai("Nhap canh a");
        b = doDai("Nhap canh b");
        c = doDai("Nhap canh c");
        if (((a + b) < c) || ((a + c) < b) || ((c + b) < a)) {
            System.out.println("khong the la 3 canh cua 1 tam giac ");
        } else {
            System.out.println("Canh tam giac hop le");
        }
    }
}

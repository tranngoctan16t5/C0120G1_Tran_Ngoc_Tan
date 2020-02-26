package B2_Mang_Va_Phuong_Thuc_Trong_Java.Bai_Tap.PhuongTrinhBacHai;

import java.util.Scanner;

public class ThucThi {
    public static void main(String[] args) {
        while (true) {
            double a = nhap("nhap vao a:");
            double b = nhap("nhap vao b:");
            double c = nhap("nhap vao c:");

            QuadraticEquation ptb2 = new QuadraticEquation(a, b, c);
            if (ptb2.getA() == 0) {
                if (ptb2.getB() == 0) {
                    if (ptb2.getC() == 0) {
                        System.out.println("Phương trình có vô số nghiệm");
                    } else {
                        System.out.println("Phương trình vô nghiệm");
                    }
                } else {
                    System.out.println("Phương trình có nghiệm x =" + (-ptb2.getC() / b));
                }
            } else {

                if (ptb2.getDiscriminant() > 0) {
                    System.out.println("Phương trình có hai nghiệm :\n x1:" + ptb2.getRoot1() + "\nx2:" + ptb2.getRoot2());
                } else if (ptb2.getDiscriminant() == 0) {
                    System.out.println("Phương trình có nghiệm kép :" + ptb2.getRootDoble());
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            }
        }
    }
    public static double nhap(String chuoi){
        Scanner sc=new Scanner(System.in);
        System.out.println(chuoi);
        double n=sc.nextDouble();
        return n;
    }


}

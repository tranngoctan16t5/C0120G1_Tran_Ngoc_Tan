package B2_Mang_Va_Phuong_Thuc_Trong_Java.Bai_Tap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int nhap1;

        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang 1");
        nhap1=sc.nextInt();
        sc.nextLine();
         String[] arr1=new String[nhap1];
        for (int i=0;i<nhap1;i++){
            System.out.println("Nhap vao phan tu thu "+(i+1));
             arr1[i]=sc.nextLine();
        }
        System.out.println("Nhap so phan tu cua mang 2");
        int nhap2=sc.nextInt();
        sc.nextLine();
        String[] arr2=new String[nhap2];
        for (int i=0;i<arr2.length;i++){
            System.out.println("Nhap vao phan tu thu "+(i+1));
            arr2[i]=sc.nextLine();
        }
        String[] arr3=new String[nhap1+nhap2];
        for (int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        for (int i=0;i<arr2.length;i++){
            arr3[nhap1]=arr2[i];
            nhap1++;
        }
        String str="";
        for (String item:arr3){
            str+=item+" ";
        }
        System.out.println("array after join is:"+str);


    }


}

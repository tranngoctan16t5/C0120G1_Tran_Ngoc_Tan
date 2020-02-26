package B2_Mang_Va_Phuong_Thuc_Trong_Java.Bai_Tap;

import java.util.Scanner;

public class ChenPhanTuVaoMang {

    public static void main(String[] args) {
       int nhap;
       Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao so phan tu mang");
        nhap=sc.nextInt();
        int[] arr=new int[nhap+1];
        for (int i=0;i<nhap;i++){
            System.out.println("nhap vao phan tu thu"+(i+1));
            arr[i]=sc.nextInt();
        }
//        String str="";
//        for (int item:arr){
//            str+=item+" ";
//        }
        int index;
        int chen;
        System.out.println("moi ban nhap vao phan tu can chen");
        chen=sc.nextInt();
        System.out.println("nhap vao vi tri can chen");
        index=sc.nextInt();
        for (int j=arr.length-1;j>=index;j--){
            arr[j]=arr[j-1];
        }
        arr[index]=chen;
        String str="";
        for (int item:arr){
            str+=item+" ";
        }
        System.out.println(str);

    }
}

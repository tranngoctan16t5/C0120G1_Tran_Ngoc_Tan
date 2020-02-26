package B2_Mang_Va_Phuong_Thuc_Trong_Java.Bai_Tap;

import java.util.Scanner;

public class TimGiaTriMin {
    public static void main(String[] args) {
        int nhap;
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao so phan tu mang");
        nhap=sc.nextInt();
        int[] arr=new int[nhap];
        for(int i=0;i<nhap;i++){
            System.out.println("Nhap vao phan tu thu "+(i+1));
            arr[i]=sc.nextInt();
        }
        String str="";
        int min=arr[0];
        for (int item:arr){
            if(item<min){
                min=item;
            }
            str+=item+" ";
        }
        System.out.println("array vua duoc tao la :"+str);
        System.out.println("so nho nhat trong mang la:"+min);

    }

}

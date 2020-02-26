package B2_Mang_Va_Phuong_Thuc_Trong_Java.Bai_Tap;

import java.util.Scanner;

public class SumCotMaTran {
    public static void main(String[] args) {

        int dong;
        int cot;

        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao so dong");
        dong=sc.nextInt();
        System.out.println("Nhap vao so cot");
        cot=sc.nextInt();
        int[][] mang=new int[dong][cot];
        for (int i=0;i<dong;i++){
            for (int j = 0; j < cot; j++) {
                System.out.printf("A[%d][%d] :\n",i,j);
                mang[i][j]=sc.nextInt();
            }
        }
        System.out.println(tinhTongCot(mang));

    }
    public static int tinhTongCot(int arr[][]){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao cot muon tinh");
        int cot=sc.nextInt();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
                    sum += arr[i][cot];
                }
        return sum;
    }
}

package B1_Ngon_Ngu_Lap_Trinh_Java.Bai_Tap;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap vao so luong phan tu trong mang : ");
        int n  = sc.nextInt();
        int temp;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Moi ban nhap vao phan tu  " + i);
            arr[i] = sc.nextInt();
        }
        System.out.println("Mang dau vao la ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }

        for (int i = 0; i < n-1 ; i++) {
            for (int j = n-1; j > i; j--) {
                if(arr[j]<arr[j-1]){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        System.out.println("Mang sau khi sap xep la :");
        for (int i = 0; i <= arr.length -1 ; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}

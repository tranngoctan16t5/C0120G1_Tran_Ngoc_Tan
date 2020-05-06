package On_lai_java;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SapXepMang {
    public static void nhapMang(int M[]) {
        Random rd = new Random();
        for (int i = 0; i < M.length; i++) {
            M[i] = rd.nextInt(10);
        }
    }

    public static void xuatMang(int M[]) {
        for (int i = 0; i < M.length; i++) {
            System.out.print(M[i] + "\t");
        }
    }

    public static void sapXep(int M[]) {
//        for (int i=0;i<M.length-1;i++){
//            for (int j=i+1;j<M.length;j++)
//                if(M[i]>M[j]){
//                    int temp=M[i];
//                    M[i]=M[j];
//                    M[j]=temp;
//                }
//        }
        Arrays.sort(M);
    }

    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("mời bạn nhập số phần tử:");
//        int n=sc.nextInt();
//        int M[]=new int[n];
//        nhapMang(M);
//        System.out.println("mảng đc tạo là:");
//        xuatMang(M);
//        sapXep(M);
//        System.out.println("Mảng sau khi nhập ngẫu nhiên là:");
//        xuatMang(M);

                }



}

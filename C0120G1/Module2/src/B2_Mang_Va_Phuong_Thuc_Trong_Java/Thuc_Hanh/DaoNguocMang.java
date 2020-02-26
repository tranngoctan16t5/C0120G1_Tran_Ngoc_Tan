package B2_Mang_Va_Phuong_Thuc_Trong_Java.Thuc_Hanh;

import java.util.Scanner;

public class DaoNguocMang {
    public static void main(String[] args) {

        int size;
        String[] arr;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao kich thuoc mang");
        size=sc.nextInt();
        sc.nextLine();
        arr=new String[size];
        for (int i=0;i<size;i++){
            System.out.println("Nhap vao phan tu thu "+(i+1));
            arr[i]=sc.nextLine();
        }
        String str="";
        for (String item:arr){
            str+=item+" ";
        }
        str+="\n";
        String temp="";
        System.out.println(str);
        for (int i=0;i<arr.length/2;i++){
            temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        String result="";
        for(String item:arr){
            result+=item+" ";
        }
        System.out.println("array after :"+result);
    }

}

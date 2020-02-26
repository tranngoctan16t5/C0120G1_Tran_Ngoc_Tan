package B2_Mang_Va_Phuong_Thuc_Trong_Java.Thuc_Hanh;

import java.util.Scanner;

public class GiaTriLonNhat {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào kích thước mảng:");
        size = sc.nextInt();
        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập vào phần tử thứ " + (i + 1));
            array[i] = sc.nextInt();
        }
//        System.out.println("Danh sách mảng vừa tạo là :");
//        for (int item : array) {
//            System.out.print(item + ",");
//        }
//        int max = array[0];
//        int countMax = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] > max) {
//                max = array[i];
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == max) {
//                countMax++;
//            }
//
//        }
//        int[] arrMax = new int[countMax];
//        int index = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == max) {
//                arrMax[index] = i;
//                index++;
//            }
//
//        }
//        String str = "";
//        for (int item : arrMax) {
//            str += item + " ";
//        }
//        System.out.println("số lớn nhất trong mảng là " + max + " vi tri :" + str);


    }
}

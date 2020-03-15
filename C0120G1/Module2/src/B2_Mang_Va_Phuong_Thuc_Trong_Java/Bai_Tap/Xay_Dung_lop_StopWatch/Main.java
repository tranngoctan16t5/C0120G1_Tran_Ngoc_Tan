package B2_Mang_Va_Phuong_Thuc_Trong_Java.Bai_Tap.Xay_Dung_lop_StopWatch;

import java.util.Arrays;

public class Main {
    public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;

    }

    public static void selectionSort() {
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100000);
        }
        Arrays.sort(arr);
//        for (int i = 0; i < arr.length - 1; i++) {
//            int min = i;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[j] < arr[min]) {
//                    min = j;
//                }
//                swap(arr[min], arr[j]);
//            }
//        }
    }

    public static void main(String[] args) {
//          Main main=new Main();
        StopWatch stopWatch1 = new StopWatch();
        stopWatch1.setStartTime(stopWatch1.start());
        selectionSort();
        stopWatch1.setEndTime(stopWatch1.stop());
        System.out.println("Thoi gian thuc hien la : " + stopWatch1.getElapsedTime() + " mili giay");
    }
}

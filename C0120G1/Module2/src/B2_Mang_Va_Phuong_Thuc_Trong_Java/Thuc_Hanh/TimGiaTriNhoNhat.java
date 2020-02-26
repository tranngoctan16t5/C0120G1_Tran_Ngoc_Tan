package B2_Mang_Va_Phuong_Thuc_Trong_Java.Thuc_Hanh;

public class TimGiaTriNhoNhat {
    public static void main(String[] args) {
        int[] mang={0,1,2,3,4,5,6};
        System.out.println("so nho nhat trong mang la :"+timMin(mang));
    }
    public static int timMin(int[] arr){
        int min=arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}

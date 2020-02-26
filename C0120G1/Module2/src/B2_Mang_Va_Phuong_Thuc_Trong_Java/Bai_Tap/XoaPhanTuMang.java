package B2_Mang_Va_Phuong_Thuc_Trong_Java.Bai_Tap;

import java.util.Scanner;

public class XoaPhanTuMang {
    public static void main(String[] args) {
        int nhap;
        int index;
        int input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang ");
        nhap = sc.nextInt();

        int[] arr = new int[nhap];
        for (int i = 0; i < nhap; i++) {
            System.out.println("Nhap vao phan tu thu " + (i + 1));
            arr[i] = sc.nextInt();
        }
        System.out.println("Nhap vao phan tu muon xoa");
        input=sc.nextInt();
        int kichThuocThucTe=arr.length;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==input){
                for (int j=i;j<arr.length-1;j++){
                   arr[j]=arr[j+1];
                }
                kichThuocThucTe--;
                System.out.println("Phan tu xuat hien trong mang co index = :"+i);
            }

            }
        String str="";
        for(int i=0;i<kichThuocThucTe;i++){
            str+=arr[i]+" ";

        }
        System.out.println("Mang sau khi xoa phan tu la"+str);

    }
}

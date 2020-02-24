package B1_Ngon_Ngu_Lap_Trinh_Java.Bai_Tap;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        int nam;
        Scanner sc=new Scanner(System.in);
        System.out.printf("Nhập vào năm cần kiểm tra:");
        nam=sc.nextInt();
        boolean check=true;
        if(nam%4==0){
          if(nam%100==0){
              if(nam%400==0){
                  check=true;
              }else {
                  check=false;
              }
          }else {
              check=true;
          }
        }else {
            check=false;
        }
     if(check){
         System.out.printf("Là năm nhuận");
     }else {
         System.out.printf("Không phải");
     }
    }
}

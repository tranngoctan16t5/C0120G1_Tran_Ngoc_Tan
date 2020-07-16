package B1_Ngon_Ngu_Lap_Trinh_Java.Bai_Tap;

import java.util.Scanner;

public class SoNguyenToAgain {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so long so nguyen to can in: ");
       int nhap = sc.nextInt();
       int dem=0;
       int number=2;
       while(dem<nhap){
          if(isSNT(number)){
              System.out.print(number+ " ");
              dem++;
          }
          number++;
       }

    }
    public static boolean isSNT(int n){
        if(n<2){
            return false;
        }
        for (int i = 2; i <=(int)Math.sqrt(n) ; i++) {
            if(n % i ==0){
                return false;
            }
        }
        return true;
    }
}

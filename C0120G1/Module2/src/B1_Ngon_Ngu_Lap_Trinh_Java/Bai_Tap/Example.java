package B1_Ngon_Ngu_Lap_Trinh_Java.Bai_Tap;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao number can check phan tu: ");
        int n = sc.nextInt();
        for (int i = 2; i < n; i++) {
            if(isPrime(i)){
                System.out.print(i + " ");
            }

        }
    }
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n) ; i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}

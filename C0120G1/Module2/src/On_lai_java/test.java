package On_lai_java;

import java.util.Scanner;

public class test {
    public static void hinh1(int h){
       int number=1;
       while(number<=h){
           for (int i=number;i<=h;i++){
               System.out.print("* ");
           }
           System.out.println();
           number++;
       }
    }
    public static void hinh2(int h){
       int number=1;
       while(number<=h){
           for (int i=1;i<=number;i++){
               System.out.print("* ");
           }
           System.out.println();
           number++;
       }
    }
    public static void hinh3(int h){
        int number=1;
        while(number<=h){
            for (int i=1;i<=h-number;i++){
                System.out.print("  ");

                }
            for (int j=1;j<=number;j++){
                System.out.print("* ");
            }
            System.out.println();
            number++;
        }
    }
    public static void hinh5(int h){
        int number=1;
        while (number<=h){
            for (int i=1;i<number;i++){
                System.out.print("  ");
            }
            for (int j=number;j<=h;j++){
                System.out.print("* ");
            }
            System.out.println();
            number++;
        }
    }

        public static void main (String[]args){
         hinh3(6);
        }
    }

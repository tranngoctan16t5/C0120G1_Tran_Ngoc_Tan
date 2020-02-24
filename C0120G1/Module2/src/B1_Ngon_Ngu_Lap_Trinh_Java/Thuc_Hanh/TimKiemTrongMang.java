package B1_Ngon_Ngu_Lap_Trinh_Java.Thuc_Hanh;

import java.util.Scanner;

public class TimKiemTrongMang {
    public static void main(String[] args) {
        String[] student = {"tan", "linh"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên học sinh cần tìm :");
        String input_name = sc.nextLine();
        boolean isExist = false;
        for(int i=0;i<student.length;i++){
            if(student[i].equals(input_name)){
                isExist=true;
                System.out.println("Tên vừa nhập vào tồn tại trong mảng và nằm ở vị trí : "+ (i+1));
                break;
            }
        }
        if(!isExist){
            System.out.println("Tên không tồn tại !!!");
        }
    }
}

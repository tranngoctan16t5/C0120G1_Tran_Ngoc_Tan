package Bai_Tap_Tren_Mang.Video_80_doc_ghi_file;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
//        ArrayList<String>list=new ArrayList<String>();
//        list.add("Obama");
//        list.add("Putin");
//        list.add("tap can binh");
//        list.add("Donal trump");
//
//        boolean kq=FileFactory.luuFile(list,"E:/dulieutest.txt");
//        if (kq==true){
//            System.out.println("luu file thanh cong");
//        }else {
//            System.out.println("luu file that bai");
//        }
        ArrayList<String>list=FileFactory.docFile("E:/dulieutest.txt");
        for (String data:list){
            System.out.println(data);
        }


    }

}

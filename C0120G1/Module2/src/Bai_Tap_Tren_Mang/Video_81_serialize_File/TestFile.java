package Bai_Tap_Tren_Mang.Video_81_serialize_File;

import java.util.ArrayList;

public class TestFile {
    public static void main(String[] args) {
//        ArrayList<KhachHang>list=new ArrayList<>();
//        list.add(new KhachHang(1,"tun"));
//        list.add(new KhachHang(2,"ti"));
//        list.add(new KhachHang(3,"bo"));
//        boolean kq=SerializeFileFactory.luuFile(list,"E:/data_kh.dat");
//        if(kq==true){
//            System.out.println("luu file thanh cong");
//        }else {
//            System.out.println("luu file that bai");
//        }
        Object data=SerializeFileFactory.docFile("E:/data_kh.dat");
        ArrayList<KhachHang>list=(ArrayList<KhachHang>) data;
        for (KhachHang kh:list){
            System.out.println(kh.getMa()+kh.getTen());
        }
    }

}

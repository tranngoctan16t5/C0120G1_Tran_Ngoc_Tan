package On_lai_java;

public class TestNhanVien {
    public static void main(String[] args) {
        NhanVien nv1=new NhanVien(1,"Ngoc Tan");
        NhanVien nv2=new NhanVien(2,"My Linh");
        NhanVien nv3=new NhanVien(3,"Tran Nguyen Tan Linh");
        NhanVien nv4=new NhanVien(4,"Tran Hung");
        nv3=nv4.copy();

        System.out.println("Ten của nv3:"+nv3.getTen());
        System.out.println("Ten của nv3:"+nv4.getTen());
        nv4.setTen("huhu");

//        nv1=nv2;
//        nv2.setTen("kim Jong UN");
//        System.out.println("Tên của nhân viên 1 là:"+nv1.getTen());
//        nv1.setTen("Hồ cẩm đào");
//        System.out.println("Tên của nhân viên 2"+nv2.getTen());

    }
}

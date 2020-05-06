package On_lai_java;

public class TestSinhVien {
    public static void main(String[] args) {

        SinhVien sv2=new SinhVien("Ngoc Tan");
        System.out.println("Diem sv2:"+sv2.getDiem());
        System.out.println("Ten cua sv2:"+sv2.getHoTen());
//        sv1.setHoTen("My Linh");
//        System.out.println("Ten cua sv1:"+sv1.getHoTen());
////        sv1.setDiem(9);
//        System.out.println("Diem sv1:"+sv1.getDiem());
        System.out.println(sv2);
    }
}

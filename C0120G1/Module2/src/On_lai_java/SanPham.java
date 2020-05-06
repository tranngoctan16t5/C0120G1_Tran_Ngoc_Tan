package On_lai_java;

public class SanPham implements Comparable<SanPham> {
    private int ma;
    private String ten;
    private double gia;

    public SanPham() {
    }

    public SanPham(int ma, String ten, double gia) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
    }

    @Override
    public String toString() {
        return this.ma+"\t"+this.ten+"\t"+this.gia;
    }

    @Override
    public int compareTo(SanPham o) {
        return this.ten.compareToIgnoreCase(o.ten)*-1;
//        if(this.gia<o.gia)
//        return 1;
//        if(this.gia>o.gia)
//            return -1;
//        return 0;
    }
}

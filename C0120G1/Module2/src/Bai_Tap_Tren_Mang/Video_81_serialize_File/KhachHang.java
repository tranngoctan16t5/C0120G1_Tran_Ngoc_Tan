package Bai_Tap_Tren_Mang.Video_81_serialize_File;

import java.io.Serializable;

public class KhachHang implements Serializable {
    private int ma;
    private String ten;

    public KhachHang() {
    }

    public KhachHang(int ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}

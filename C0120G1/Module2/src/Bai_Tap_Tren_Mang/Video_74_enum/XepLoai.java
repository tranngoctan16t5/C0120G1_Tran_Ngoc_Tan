package Bai_Tap_Tren_Mang.Video_74_enum;

public enum  XepLoai {
    Gioi("Giỏi"),
    Kha("Khá"),
    TrungBinh("trung bình"),
    Yeu("yếu");
    private String msg;
    XepLoai(String msg){
        this.msg=msg;
    }
    public String getDescription(){
        return this.msg;
    }
}


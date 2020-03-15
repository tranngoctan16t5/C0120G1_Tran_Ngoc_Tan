package Bai_Tap_Tren_Mang.anhKien.Models;

public class Shoes extends Product{
    private String color;

    public Shoes(String color) {
        this.color = color;
    }

    public Shoes(int id, String name, double size, String color) {
        super(id, name, size);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}

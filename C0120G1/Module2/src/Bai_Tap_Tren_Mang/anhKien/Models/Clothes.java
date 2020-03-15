package Bai_Tap_Tren_Mang.anhKien.Models;

public class Clothes extends Product{
    private String brand;

    public Clothes(String color) {
        this.brand = color;
    }

    public Clothes(int id, String name, double size, String color) {
        super(id, name, size);
        this.brand = color;
    }

    public String getColor() {
        return brand;
    }

    public void setColor(String color) {
        this.brand = color;
    }


}

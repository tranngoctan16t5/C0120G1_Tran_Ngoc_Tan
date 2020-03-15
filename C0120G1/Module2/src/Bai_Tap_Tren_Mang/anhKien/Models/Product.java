package Bai_Tap_Tren_Mang.anhKien.Models;

public abstract class Product {
    private int id;
    private String name;
    private double size;

    public Product() {
    }

    public Product(int id, String name, double size) {
        this.id = id;
        this.name = name;
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}

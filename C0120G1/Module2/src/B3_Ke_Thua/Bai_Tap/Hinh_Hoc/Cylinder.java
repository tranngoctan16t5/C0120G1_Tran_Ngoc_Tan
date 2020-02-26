package B3_Ke_Thua.Bai_Tap.Hinh_Hoc;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {

    }
    public Cylinder(double height, String color, double radius) {
        super(radius, color);
        this.height=height;

    }
    public double theTich(){
        return Math.PI*getRadius()*getRadius()*height;
    }
    public double getHeight(){
        return this.height;
    }

    @Override
    public String toString() {
        return "hình trụ:\n"+super.toString()+"chiều cao:"+getHeight();
    }
}

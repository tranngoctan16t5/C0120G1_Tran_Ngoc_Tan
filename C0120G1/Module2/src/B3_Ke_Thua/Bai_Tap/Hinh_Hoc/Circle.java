package B3_Ke_Thua.Bai_Tap.Hinh_Hoc;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String  getColor() {
        return color;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }
    @Override
    public String toString(){
        return "Bán kính:"+this.getRadius()+"color:"+this.getColor();
    }
}

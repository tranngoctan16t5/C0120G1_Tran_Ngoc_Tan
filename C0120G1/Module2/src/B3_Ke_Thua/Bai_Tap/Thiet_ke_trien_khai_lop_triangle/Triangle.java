package B3_Ke_Thua.Bai_Tap.Thiet_ke_trien_khai_lop_triangle;

public class Triangle extends Shape{
    private double height;
    private double site1=1.0;
    private double site2=1.0;
    private double site3=1.0;

    public Triangle() {
    }

    public Triangle(String color,boolean filled,double height,double site1, double site2, double site3) {
        super(color,filled);
        this.site1 = site1;
        this.site2 = site2;
        this.site3 = site3;
        this.height=height;
    }

    public Triangle(String color, boolean filled, double height) {
        super(color, filled);
        this.height = height;
    }

    public double getSite1() {
        return site1;
    }

    public void setSite1(double site1) {
        this.site1 = site1;
    }

    public double getSite2() {
        return site2;
    }

    public void setSite2(double site2) {
        this.site2 = site2;
    }

    public double getSite3() {
        return site3;
    }

    public void setSite3(double site3) {
        this.site3 = site3;
    }
    public double getArea(){
        return ((1/2f)*height*site1);
    }
    public double getPerimeter(){
        return site1+site2+site3;
    }

    @Override
    public String toString() {
        return "Tam giac co:\n"+"canh 1="+site1+
                "\ncanh 2="+site2+"\ncanh 3:"+site3+"\n"+"Chieu cao="+height+
                "\nDien tich="+getArea()+"\nChu vi="+getPerimeter()+"\n"+super.toString();
    }
}

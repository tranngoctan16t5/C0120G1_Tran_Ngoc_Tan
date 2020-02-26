package B2_Mang_Va_Phuong_Thuc_Trong_Java.Bai_Tap.PhuongTrinhBacHai;

public class QuadraticEquation {
    private double a,b,c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant(){
       return (this.b*this.b)-(4*this.a*this.c);

    }
    public double getRoot1(){
        return ((-this.b)+(Math.pow((this.b*this.b-4*this.a*this.c)/(2*this.a),2)));

    }
    public double getRoot2(){
        return ((-this.b)-(Math.pow((this.b*this.b-4*this.a*this.c)/(2*this.a),2)));

    }
    public double getRootDoble(){
        return ((-this.b)/(2*this.a));
    }

}

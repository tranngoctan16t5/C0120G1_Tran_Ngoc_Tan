package B2_Mang_Va_Phuong_Thuc_Trong_Java.Bai_Tap.XayDungLopFan;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        if(this.on==true){
            return "speed:"+this.speed+"\ncolor:"+this.color+"\nRadius:"+this.radius+"Fan is on";
        }else {
            return "speed:"+this.speed+"\ncolor:"+this.color+"\nRadius:"+this.radius+"Fan is off";
        }
    }
}

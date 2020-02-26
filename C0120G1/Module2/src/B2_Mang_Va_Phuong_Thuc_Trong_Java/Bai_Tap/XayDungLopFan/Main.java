package B2_Mang_Va_Phuong_Thuc_Trong_Java.Bai_Tap.XayDungLopFan;

public class Main {
    public static void main(String[] args) {
        Fan fan1=new Fan();
         fan1.setSpeed(Fan.FAST);
         fan1.setRadius(10);
         fan1.setColor("yellow");
         fan1.setOn(true);
        System.out.println(fan1.toString());
        Fan fan2=new Fan();
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setRadius(5);
        fan1.setColor("blue");
        fan1.setOn(false);
        System.out.println(fan2.toString());
    }
}

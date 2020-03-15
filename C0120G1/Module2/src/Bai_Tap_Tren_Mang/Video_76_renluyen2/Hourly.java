package Bai_Tap_Tren_Mang.Video_76_renluyen2;

public class Hourly extends Employee {
    private int hourWorked;
    public void addHours(int hourWorked){
        this.hourWorked=hourWorked;
    }

    @Override
    public double pay() {
        return this.hourWorked*50;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

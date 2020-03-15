package Bai_Tap_Tren_Mang.Video_76_renluyen2;

public class Excutive extends Employee {
    private double bonus;
    public void awardBonus(double bonus){
        this.bonus=bonus;
        System.out.println("lanh bonus"+bonus);
    }

    @Override
    public double pay() {
        return super.pay()+bonus;
    }
}

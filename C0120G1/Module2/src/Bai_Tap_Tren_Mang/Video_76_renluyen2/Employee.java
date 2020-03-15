package Bai_Tap_Tren_Mang.Video_76_renluyen2;

public class Employee extends StaffMember {
    protected String socialSecurityNumber;
    protected double payRat;

    @Override
    public double pay() {
        return 500;
    }

    @Override
    public String toString() {
        return super.toString()+socialSecurityNumber+"-"+payRat;
    }
}

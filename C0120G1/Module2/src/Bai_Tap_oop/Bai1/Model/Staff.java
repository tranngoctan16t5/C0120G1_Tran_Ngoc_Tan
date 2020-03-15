package Bai_Tap_oop.Bai1.Model;

public class Staff extends Officials {
    private String work;

    public Staff() {
    }

    public Staff(String name, int age, String gender, String address, String work) {
        super(name, age, gender, address);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Work:"+getWork());
    }
}

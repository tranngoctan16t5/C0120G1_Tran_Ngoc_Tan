package Bai_Tap_oop.Bai1.Model;

public class Worker extends Officials{
    private int rank;

    public Worker() {
    }

    public Worker(String name, int age, String gender, String address, int rank) {
        super(name, age, gender, address);
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Rank :"+getRank());
    }
}

package Bai_Tap_oop.Bai1.Model;

public class Engineer extends Officials  {
    private String trainingSector;

    public Engineer() {
    }

    public Engineer(String name, int age, String gender, String address, String trainingSector) {
        super(name, age, gender, address);
        this.trainingSector = trainingSector;
    }

    public String getTrainingSector() {
        return trainingSector;
    }

    public void setTrainingSector(String trainingSector) {
        this.trainingSector = trainingSector;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("training sector :"+getTrainingSector());
    }

    @Override
    public String toString() {
        return super.toString()+"Training sector:"+getTrainingSector();
    }
}


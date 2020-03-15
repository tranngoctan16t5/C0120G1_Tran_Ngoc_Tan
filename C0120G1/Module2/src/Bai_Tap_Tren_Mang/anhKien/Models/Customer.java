package Bai_Tap_Tren_Mang.anhKien.Models;

public class Customer extends Person {
    private int age;

    public Customer() {
    }

    public Customer(int id, String name, String address, int age) {
        super(id, name, address);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString()+"age:"+getAge();
    }

}

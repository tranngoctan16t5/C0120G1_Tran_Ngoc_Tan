package Bai_Tap_oop.Bai1.Model;

public class Officials  {
    private String name;
    private int age;
    private String gender;
    private String address;

    public Officials() {
    }

    public Officials(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void showInfo() {
        System.out.println("name : " + this.getName() +
                "\nage : " + this.getAge() +
                "\ngender : " + this.getGender() +
                "\naddress : " + this.getAddress());
    }


//    @Override
//    public int compareTo(Officials o) {
//        return this.getName().compareTo(o.getName());
//    }

    @Override
    public String toString() {
        return "Name :"+this.getName()+"Tuoi:"+getAge()+"Gender:"+getGender()+"Address"+getAddress();
    }
    //    @Override
//    public int compareTo(Object o) {
//        String name1 = name;
//        String name2 = o.name;
//        return 0;
//    }
}

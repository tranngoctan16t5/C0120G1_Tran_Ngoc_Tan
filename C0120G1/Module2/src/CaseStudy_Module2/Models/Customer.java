package CaseStudy_Module2.Models;

public class Customer {
    private String nameCustomer;
    private String gender;
    private String birthday;
    private int idCard;
    private int phoneNumber;
    private String email;
    private String typeCustomer;
    private String address;
    private Service service;

    public Customer() {
    }

    public Customer(String nameCustomer, String gender, String birthday, int idCard, int phoneNumber, String email, String typeCustomer, String address) {
        this.nameCustomer = nameCustomer;
        this.gender = gender;
        this.birthday = birthday;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String showInfo(){
        return "Name customer : "+this.getNameCustomer()+
                "\nGender : "+this.getGender()+
                "\nBirthday :" +this.getBirthday()+
                "\nId Card : "+this.getBirthday()+
                "\nPhone Number : "+this.getPhoneNumber()+
                "\nEmail : "+this.getEmail()+
                "\nType Customer : "+this.getTypeCustomer()+
                "\nAddress : "+this.getAddress();
    }
}

package TSP_va_JSTL.Thuc_hanh.Hien_thi_DS_Khach_hang;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {
    private String name;
    private String hireDate;
    private String address;
    private String image;
    private static final DateFormat df=new SimpleDateFormat("MM/dd/yyyy");

    public Customer() {
    }

    public Customer(String name, String address, String image, String hireDate) {
        this.name = name;
        this.address = address;
        this.image = image;
        this.hireDate = hireDate;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

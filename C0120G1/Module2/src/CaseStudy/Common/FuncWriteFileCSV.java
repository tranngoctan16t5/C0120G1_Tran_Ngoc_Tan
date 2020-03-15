package CaseStudy.Common;

import CaseStudy.Model.*;

import java.io.FileWriter;
import java.util.ArrayList;

public class FuncWriteFileCSV {
    private static final String COMMA_DELIMITER=",";
    private static final String NEW_LINE_SEPARATOR="\n";
    public static final String fileNameVilla="src/CaseStudy/Data/Villa.csv";
    public static final String fileNameHouse="src/CaseStudy/Data/House.csv";
    public static final String fileNameRoom="src/CaseStudy/Data/Room.csv";
    public static final String fileNameCustomer="src/CaseStudy/Data/Customer.csv";
    public static final String fileNameBooking="src/CaseStudy/Data/Booking.csv";
    public static final String fileNameEmployee="src/CaseStudy/Data/Employee.csv";

    //header file CSV
    private static final String FILE_HEADER_VILLA="id,nameService,areaUsed,rentalCosts,maxNumberOfPeople,typeRent,roomStandard,convenientDescription,areaPool,numberOfFloors";
    private static final String FILE_HEADER_HOUSE="id,nameService,areaUsed,rentalCosts,maxNumberOfPeople,typeRent,roomStandard,convenientDescription,numberOfFloors";
    private static final String FILE_HEADER_ROOM="id,nameService,areaUsed,rentalCosts,maxNumberOfPeople,typeRent,freeService";
    private static final String FILE_HEADER_CUSTOMER="nameCustomer,gender,birthday,idCard,phoneNumber,email,typeCustomer,address";
    private static final String FILE_HEADER_BOOKING="nameCustomer,gender,idCard,phoneNumber,email,birthday,typeCustomer,address,id,nameService,areaUsed,rentalCosts,maxNumberOfPeople,typeRent";
    private static final String FILE_HEADER_EMPLOYEE="name,age,address";
    public static void writeVillaToCSV(ArrayList<Villa> listVilla){
        FileWriter fileWriter=null;
        try{
            fileWriter=new FileWriter(fileNameVilla);
            fileWriter.append(FILE_HEADER_VILLA);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Villa villa:listVilla){
                fileWriter.append(villa.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getNameService());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getAreaUsed()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getRentalCosts()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getMaxNumberOfPeople()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getTypeRent());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getRoomStandard());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(villa.getConvenientDescription());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getAreaPool()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(villa.getNumberOfFloors()));
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
        }catch (Exception ex){
            System.out.println("Error in CsvFileWriter !!!");
        }finally {
            try{
                //xoa bo nho dem
                  fileWriter.flush();
                  fileWriter.close();
            }catch (Exception ex){
                System.out.println("Error when flush or close");
            }
        }
    }
    public static void writeEmployeeToCSV(ArrayList<Employee> listEmployee){
        FileWriter fileWriter=null;
        try{
            fileWriter=new FileWriter(fileNameEmployee);
            fileWriter.append(FILE_HEADER_EMPLOYEE);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Employee employee:listEmployee){
                fileWriter.append(employee.getName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(employee.getAge()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(employee.getAddress()));
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
        }catch (Exception ex){
            System.out.println("Error in CsvFileWriter !!!");
        }finally {
            try{
                //xoa bo nho dem
                fileWriter.flush();
                fileWriter.close();
            }catch (Exception ex){
                System.out.println("Error when flush or close");
            }
        }
    }
    public static void writeBookingToCSV(ArrayList<Customer> listBooking){
        FileWriter fileWriter=null;
        try{
            fileWriter=new FileWriter(fileNameBooking);
            fileWriter.append(FILE_HEADER_BOOKING);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Customer customer:listBooking){
                fileWriter.append(customer.getNameCustomer());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getGender());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(customer.getIdCard()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(customer.getPhoneNumber()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getEmail());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(customer.getBirthday()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getTypeCustomer());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getAddress());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getService().getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getService().getNameService());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(customer.getService().getAreaUsed()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(customer.getService().getRentalCosts()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(customer.getService().getMaxNumberOfPeople()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(customer.getService().getTypeRent()));
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
        }catch (Exception ex){
            System.out.println("Error in CsvFileWriter !!!");
        }finally {
            try{
                //xoa bo nho dem
                fileWriter.flush();
                fileWriter.close();
            }catch (Exception ex){
                System.out.println("Error when flush or close");
            }
        }
    }
    public static void writeHouseToCSV(ArrayList<House> listHouse){
        FileWriter fileWriter=null;
        try{
            fileWriter=new FileWriter(fileNameHouse);
            fileWriter.append(FILE_HEADER_HOUSE);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (House house:listHouse){
                fileWriter.append(house.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getNameService());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getAreaUsed()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getRentalCosts()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getMaxNumberOfPeople()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getTypeRent());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getRoomStandard());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(house.getConvenientDescription());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(house.getNumberOfFloor()));
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
        }catch (Exception ex){
            System.out.println("Error in CsvFileWriter !!!");
        }finally {
            try{
                //xoa bo nho dem
                fileWriter.flush();
                fileWriter.close();
            }catch (Exception ex){
                System.out.println("Error when flush or close");
            }
        }
    }

    public static void writeRoomToCSV(ArrayList<Room> listRoom){
        FileWriter fileWriter=null;
        try{
            fileWriter=new FileWriter(fileNameRoom);
            fileWriter.append(FILE_HEADER_ROOM);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Room room:listRoom){
                fileWriter.append(room.getId());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(room.getNameService());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(room.getAreaUsed()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(room.getRentalCosts()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(room.getMaxNumberOfPeople()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(room.getTypeRent());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(room.getFreeService());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
        }catch (Exception ex){
            System.out.println("Error in CsvFileWriter !!!");
        }finally {
            try{
                //xoa bo nho dem
                fileWriter.flush();
                fileWriter.close();
            }catch (Exception ex){
                System.out.println("Error when flush or close");
            }
        }
    }
    public static void writeCustomerToCSV(ArrayList<Customer> listCustomer){
        FileWriter fileWriter=null;
        try{
            fileWriter=new FileWriter(fileNameCustomer);
            fileWriter.append(FILE_HEADER_CUSTOMER);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Customer customer:listCustomer){
                fileWriter.append(customer.getNameCustomer());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getGender());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getBirthday());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(customer.getIdCard()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(customer.getPhoneNumber()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getEmail());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getTypeCustomer());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(customer.getAddress());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
        }catch (Exception ex){
            System.out.println("Error in CsvFileWriter !!!");
        }finally {
            try{
                //xoa bo nho dem
                fileWriter.flush();
                fileWriter.close();
            }catch (Exception ex){
                System.out.println("Error when flush or close");
            }
        }
    }
}

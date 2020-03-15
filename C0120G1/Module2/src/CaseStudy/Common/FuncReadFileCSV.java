package CaseStudy.Common;

import CaseStudy.Model.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FuncReadFileCSV {
    public static ArrayList<Employee> getFileCSVToListEmployee() {
        BufferedReader br = null;
        ArrayList<Employee> listEmployee = new ArrayList<Employee>();
        Path path = Paths.get(FuncWriteFileCSV.fileNameEmployee);
        if (!Files.exists(path)) {

            try {
                Writer writer = new FileWriter(FuncWriteFileCSV.fileNameEmployee);

            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        try {
            String line;
            br = new BufferedReader(new FileReader(FuncWriteFileCSV.fileNameEmployee));
            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("name")) {
                    continue;
                }
                Employee employee = new Employee();
                employee.setName(splitData[0]);
                employee.setAge(Integer.parseInt(splitData[1]));
                employee.setAddress(splitData[2]);

                listEmployee.add(employee);

            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        return listEmployee;
    }

    public static ArrayList<Villa> getFileCSVToListVilla() {
        BufferedReader br = null;
        ArrayList<Villa> listVilla = new ArrayList<Villa>();
        Path path = Paths.get(FuncWriteFileCSV.fileNameVilla);
        if (!Files.exists(path)) {

            try {
                Writer writer = new FileWriter(FuncWriteFileCSV.fileNameVilla);

            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        try {
            String line;
            br = new BufferedReader(new FileReader(FuncWriteFileCSV.fileNameVilla));
            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("id")) {
                    continue;
                }
                Villa villa = new Villa();
                villa.setId(splitData[0]);
                villa.setNameService(splitData[1]);
                villa.setAreaUsed(Double.parseDouble(splitData[2]));
                villa.setRentalCosts(Double.parseDouble(splitData[3]));
                villa.setMaxNumberOfPeople(Integer.parseInt(splitData[4]));
                villa.setTypeRent(splitData[5]);
                villa.setRoomStandard(splitData[6]);
                villa.setConvenientDescription(splitData[7]);
                villa.setAreaPool(Double.parseDouble(splitData[8]));
                villa.setNumberOfFloors(Integer.parseInt(splitData[9]));
                listVilla.add(villa);

            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        return listVilla;
    }


    public static ArrayList<House> getFileCSVToListHouse() {
        BufferedReader br = null;
        ArrayList<House> listHouse = new ArrayList<House>();
        Path path = Paths.get(FuncWriteFileCSV.fileNameHouse);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(FuncWriteFileCSV.fileNameHouse);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        try {
            String line;
            br = new BufferedReader(new FileReader(FuncWriteFileCSV.fileNameHouse));
            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("id")) {
                    continue;
                }
                House house = new House();
                house.setId(splitData[0]);
                house.setNameService(splitData[1]);
                house.setAreaUsed(Double.parseDouble(splitData[2]));
                house.setRentalCosts(Double.parseDouble(splitData[3]));
                house.setMaxNumberOfPeople(Integer.parseInt(splitData[4]));
                house.setTypeRent(splitData[5]);
                house.setRoomStandard(splitData[6]);
                house.setConvenientDescription(splitData[7]);
                house.setNumberOfFloor(Integer.parseInt(splitData[8]));
                listHouse.add(house);

            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        return listHouse;
    }

    public static ArrayList<Room> getFileCSVToListRoom() {
        BufferedReader br = null;
        ArrayList<Room> listRoom = new ArrayList<Room>();
        Path path = Paths.get(FuncWriteFileCSV.fileNameRoom);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(FuncWriteFileCSV.fileNameRoom);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        try {
            String line;
            br = new BufferedReader(new FileReader(FuncWriteFileCSV.fileNameRoom));
            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("id")) {
                    continue;
                }
                Room room = new Room();
                room.setId(splitData[0]);
                room.setNameService(splitData[1]);
                room.setAreaUsed(Double.parseDouble(splitData[2]));
                room.setRentalCosts(Double.parseDouble(splitData[3]));
                room.setMaxNumberOfPeople(Integer.parseInt(splitData[4]));
                room.setTypeRent(splitData[5]);
                room.setFreeService(splitData[6]);
                listRoom.add(room);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        return listRoom;
    }

    public static ArrayList<Customer> getFileCSVToListCustomer() {
        BufferedReader br = null;
        ArrayList<Customer> listCustomer = new ArrayList<Customer>();
        Path path = Paths.get(FuncWriteFileCSV.fileNameCustomer);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(FuncWriteFileCSV.fileNameCustomer);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        try {
            String line;
            br = new BufferedReader(new FileReader(FuncWriteFileCSV.fileNameCustomer));
            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("nameCustomer")) {
                    continue;
                }
                Customer customer = new Customer();
                customer.setNameCustomer(splitData[0]);
                customer.setGender(splitData[1]);
                customer.setBirthday(splitData[2]);
                customer.setIdCard(Integer.parseInt(splitData[3]));
                customer.setPhoneNumber(Integer.parseInt(splitData[4]));
                customer.setEmail(splitData[5]);
                customer.setTypeCustomer(splitData[6]);
                customer.setAddress(splitData[7]);
                listCustomer.add(customer);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        return listCustomer;
    }

    public static ArrayList<Customer> getFileCSVToListBooking() {
        BufferedReader br = null;
        ArrayList<Customer> listBooking = new ArrayList<Customer>();
        Path path = Paths.get(FuncWriteFileCSV.fileNameBooking);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(FuncWriteFileCSV.fileNameBooking);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        try {
            String line;
            br = new BufferedReader(new FileReader(FuncWriteFileCSV.fileNameBooking));
            while ((line = br.readLine()) != null) {
                String[] splitData = line.split(",");
                if (splitData[0].equals("nameCustomer")) {
                    continue;
                }
                Customer customer = new Customer();
                customer.setNameCustomer(splitData[0]);
                customer.setGender(splitData[1]);
                customer.setIdCard(Integer.parseInt(splitData[2]));
                customer.setPhoneNumber(Integer.parseInt(splitData[3]));
                customer.setEmail(splitData[4]);
                customer.setBirthday((splitData[5]));
                customer.setTypeCustomer(splitData[6]);
                customer.setAddress(splitData[7]);


                Villa villa = new Villa();
                villa.setId((splitData[8]));
                villa.setNameService(splitData[9]);
                villa.setAreaUsed(Double.parseDouble(splitData[10]));
                villa.setRentalCosts(Double.parseDouble(splitData[11]));
                villa.setMaxNumberOfPeople(Integer.parseInt(splitData[12]));
                villa.setTypeRent(splitData[13]);
                customer.setService(villa);


                listBooking.add(customer);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        return listBooking;
    }
}

//    public static ArrayList<Customer> getFileCSVToListBooking() {
//        BufferedReader br = null;
//        ArrayList<Customer> listBooking = new ArrayList<Customer>();
//        Path path = Paths.get(FuncWriteFileCSV.fileNameBooking);
//        if (!Files.exists(path)) {
//            try {
//                Writer writer = new FileWriter(FuncWriteFileCSV.fileNameBooking);
//            } catch (Exception ex) {
//                System.out.println(ex.getMessage());
//            }
//        }
//        try {
//            String line;
//            br = new BufferedReader(new FileReader(FuncWriteFileCSV.fileNameBooking));
//            while ((line = br.readLine()) != null) {
//                String[] splitData = line.split(",");
//                if (splitData[0].equals("nameCustomer")) {
//                    continue;
//                }
//                Customer customer = new Customer();
//                customer.setNameCustomer(splitData[0]);
//                customer.setGender(splitData[1]);
//                customer.setIdCard(Integer.parseInt(splitData[2]));
//                customer.setPhoneNumber(Integer.parseInt(splitData[3]));
//                customer.setEmail(splitData[4]);
//                customer.setBirthday((splitData[5]));
//                customer.setTypeCustomer(splitData[6]);
//                customer.setAddress(splitData[7]);
//
//
//                Villa villa = new Villa();
//                villa.setId((splitData[8]));
//                villa.setNameService(splitData[9]);
//                villa.setAreaUsed(Double.parseDouble(splitData[10]));
//                villa.setRentalCosts(Double.parseDouble(splitData[11]));
//                villa.setMaxNumberOfPeople(Integer.parseInt(splitData[12]));
//                villa.setTypeRent(splitData[13]);
//                customer.setService(villa);
//
////                customer.getService().setId((splitData[8]));
////                customer.getService().setNameService(splitData[9]);
////                customer.getService().setAreaUsed(Double.parseDouble(splitData[10]));
////                customer.getService().setRentalCosts(Double.parseDouble(splitData[11]));
////                customer.getService().setMaxNumberOfPeople(Integer.parseInt(splitData[12]));
////                customer.getService().setTypeRent(splitData[13]);
//
//
//                listBooking.add(customer);
//            }
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        } finally {
//            try {
//                br.close();
//            } catch (Exception ex) {
//                System.out.println(ex.getMessage());
//            }
//        }
//        return listBooking;
//    }
//}

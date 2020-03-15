package CaseStudy_Module2.Controller;

import CaseStudy_Module2.Commons.FuncValidation;
import CaseStudy_Module2.Commons.FuncWriteAndReadFileCSV;
import CaseStudy_Module2.Models.*;

import java.util.*;

public class MainController {
    private static Scanner sc = new Scanner(System.in);

    public static void displayMainMenu() {
        System.out.println("\n1.Add new Service." +
                "\n2.Show Services." +
                "\n3.Add new Customer." +
                "\n4.Show information Customer." +
                "\n5.Add new booking resort." +
                "\n6.Add new employee." +
                "\n7.Show information employee." +
                "\n8.Show information of customer bought ticket." +
                "\n9.Exit" +
                "\nPlease select one function below: "
        );
        switch (sc.nextInt()) {
            case 1:
                addNewServices();
                break;
            case 2:
                showServices();
                break;
            case 3:
                addNewCustomer();
                displayMainMenu();
                break;
            case 4:
                showInformationCustomers();
                displayMainMenu();
                break;
            case 5:
                addNewBookingResort();
                displayMainMenu();
                break;
            case 6:
                addNewEmployee();
                displayMainMenu();
                break;
            case 7:
                showInfomationEmployee();
                displayMainMenu();
                break;
            case 8:
                showInfomationOfCustomerBoughtTicket();
                displayMainMenu();
                break;
            case 9:
                System.exit(0);
            default:
                System.out.println("\n Error.Back to menu");
                backMainMenu();
        }
    }

    private static void backMainMenu() {
        System.out.println("\nEnter to continue....");
        sc.nextLine();
        System.out.println("\n-------------------------");
        displayMainMenu();
    }

    private static void addNewEmployee() {
        Employee employee = new Employee();
        sc.nextLine();
        System.out.println("enter name employee");
        employee.setName(sc.nextLine());
        System.out.println("enter age :");
        employee.setAge(sc.nextInt());
        sc.nextLine();
        System.out.println("enter address");
        employee.setAddress(sc.nextLine());
        ArrayList<Employee> listEmployee = FuncWriteAndReadFileCSV.getEmployeeFromCSV();
        listEmployee.add(employee);
        FuncWriteAndReadFileCSV.writeEmployeeToFileCSV(listEmployee);
        System.out.println("\nAdd booking for: " + employee.getName() + "Successfully!!");
        sc.nextLine();
        backMainMenu();
    }

    private static void addNewBookingResort() {
        ArrayList<Customer> listCustomer = FuncWriteAndReadFileCSV.getCustomerFromCSV();
        Collections.sort(listCustomer, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getNameCustomer().compareTo(o2.getNameCustomer());
            }
        });
        int i = 1;
        for (Customer cus : listCustomer) {
            System.out.println("\n----------------------------------");
            System.out.println("no: " + i);
            System.out.println(cus.showInfo());
            System.out.println("\n----------------------------------");
            i++;
        }
        System.out.println("Choose Customer Booking");
        Customer customer = listCustomer.get(sc.nextInt() - 1);
        System.out.println("\n1.Booking Villa." +
                "\n2.Booking House" +
                "\n3.Booking Room");
        System.out.println("Choose Services booking");
        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                i = 1;
                ArrayList<Villa> listVilla = FuncWriteAndReadFileCSV.getVillaFromCSV();
                for (Villa villa : listVilla) {
                    System.out.println("\n---------------------------------");
                    System.out.println("No: " + i);
                    System.out.println(villa.showInfo());
                    System.out.println("\n---------------------------------");
                    i++;

                }
                System.out.println("Choose villa Booking ");
                Villa villa = listVilla.get(sc.nextInt() - 1);
                customer.setService(villa);
                break;
            case 2:
                i = 1;
                ArrayList<House> listHouse = FuncWriteAndReadFileCSV.getHouseFromCSV();
                for (House house : listHouse) {
                    System.out.println("\n---------------------------------");
                    System.out.println("No: " + i);
                    System.out.println(house.showInfo());
                    System.out.println("\n---------------------------------");
                    i++;

                }
                System.out.println("Choose house Booking ");
                House house = listHouse.get(sc.nextInt() - 1);
                customer.setService(house);
                break;

            default:
                backMainMenu();
                break;

        }
        ArrayList<Customer> listBooking = FuncWriteAndReadFileCSV.getBookingFromCSV();
        listBooking.add(customer);
        FuncWriteAndReadFileCSV.writeBookingToFileCSV(listBooking);
        System.out.println("\nAdd booking for: " + customer.getNameCustomer() + "Successfully!!");
        sc.nextLine();
        backMainMenu();
    }

    private static void addNewServices() {
        System.out.println("\n-------------------------");
        System.out.println("\n1.Add new Villa." +
                "\n2.Add new House" +
                "\n3.Add new Room" +
                "\n4.Back to menu" +
                "\n5.Exit" +
                "\nPlease select one function below: "
        );
        switch (sc.nextInt()) {
            case 1:
                addNewVilla();
                break;
            case 2:
                addNewHouse();
                break;
            case 3:
                addNewRoom();
                break;
            case 4:
                displayMainMenu();
                System.out.println("\n------------------");
            case 5:
                System.exit(0);
            default:
                System.out.println("\nError.Back to menu.");
                backMainMenu();

        }
    }

    private static void showServices() {
        System.out.println("\n--------------------------" +
                "\n1.Show All Villa." +
                "\n2.Show All House." +
                "\n3.Show All Room." +
                "\n4.Show All Name Villa Not Duplicate" +
                "\n5.Show All Name House Not Duplicate" +
                "\n6.Show All Name Room Not Duplicate" +
                "\n7.Back to menu." +
                "\n8.Exit" +
                "\nPlease select one function below:");
        switch (sc.nextInt()) {
            case 1:
                showAllVilla();
                displayMainMenu();
                break;
            case 2:
                showAllHouse();
                displayMainMenu();
                break;
            case 3:
                showAllRoom();
                displayMainMenu();
                break;
            case 4:
                getNameVillaNotDuplicate();
                displayMainMenu();
                break;
            case 5:
                getNameHouseNotDuplicate();
                displayMainMenu();
                break;
            case 8:
                System.exit(0);
            default:
                System.out.println("\n Error.Back to menu");
                backMainMenu();
        }
    }

    private static void showInformationCustomers() {
        ArrayList<Customer> listCustomer = FuncWriteAndReadFileCSV.getCustomerFromCSV();
        Collections.sort(listCustomer, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                if (o1.getNameCustomer().equals(o2.getNameCustomer())) {
                    return o1.getBirthday().compareTo(o2.getBirthday());
                } else {
                    return o1.getNameCustomer().compareTo(o2.getNameCustomer());
                }

            }
        });
        for (Customer customer : listCustomer) {
            System.out.println("\n-----------------------");
            System.out.println(customer.showInfo());
            System.out.println("\n-----------------------");
        }
        sc.nextLine();
        backMainMenu();
    }

    private static void showAllVilla() {
        ArrayList<Villa> listVilla = FuncWriteAndReadFileCSV.getVillaFromCSV();
        for (Villa villa : listVilla) {
            System.out.println("\n-----------------------");
            System.out.println(villa.showInfo());
            System.out.println("\n-----------------------");
        }
        sc.nextLine();
        backMainMenu();
    }

    private static void showAllHouse() {
        ArrayList<House> listHouse = FuncWriteAndReadFileCSV.getHouseFromCSV();
        for (House house : listHouse) {
            System.out.println("\n-----------------------");
            System.out.println(house.showInfo());
            System.out.println("\n-----------------------");
        }
        sc.nextLine();
        backMainMenu();
    }

    private static void showAllRoom() {
        ArrayList<Room> listRoom = FuncWriteAndReadFileCSV.getRoomFromCSV();
        for (Room room : listRoom) {
            System.out.println("\n-----------------------");
            System.out.println(room.showInfo());
            System.out.println("\n-----------------------");
        }
        sc.nextLine();
        backMainMenu();
    }

    private static void addNewCustomer() {
        Customer customer = new Customer();
        sc.nextLine();
        System.out.println("Enter name customer :");
        customer.setNameCustomer(sc.nextLine());
        System.out.println("Enter Gender:");
        customer.setGender(sc.nextLine());
        System.out.println("Enter Birthday : ");
        customer.setBirthday(sc.nextLine());
        System.out.println("Enter id Card :");
        customer.setIdCard(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter phone Number: ");
        customer.setPhoneNumber(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter email :");
        customer.setEmail(sc.nextLine());
        System.out.println("Enter type Customer :");
        customer.setTypeCustomer(sc.nextLine());
        System.out.println("Enter address");
        customer.setAddress(sc.nextLine());

        ArrayList<Customer> listCustomer = FuncWriteAndReadFileCSV.getCustomerFromCSV();
        listCustomer.add(customer);
        FuncWriteAndReadFileCSV.writeCustomerToFileCSV(listCustomer);
        System.out.println("\nAdd Customer Successfully?!");
        backMainMenu();
    }

    private static Service addNewService(Service service) {
        String content = "";
        String errMes = "";
        service.setId(UUID.randomUUID().toString().replace("-", ""));
        sc.nextLine();
        //enter name Services
        System.out.println("Enter name Services");
        service.setNameService(sc.nextLine());
        while (!FuncValidation.checkNameService(service.getNameService())) {
            System.out.println("Name Service is invalid .Please try again !!!");
            System.out.println("Enter Name Service: ");
            service.setNameService(sc.nextLine());
        }
        //enter Area Used
        content = "Enter Area Used :";
        errMes = "Area Used Is Invalid (area >30 and Area must be a Double .Please try again !!";
        service.setAreaUsed(FuncValidation.checkValidNumberDouble(content, errMes));
        while (service.getAreaUsed() <= 30) {
            System.out.println(errMes);
            service.setAreaUsed(FuncValidation.checkValidNumberDouble(content, errMes));
        }

        //enter rental Cost
        content = "Enter rental costs :";
        errMes = "Rental costs is Invalid (Costs > 30, rental costs must be a Double .Please try again !!";
        service.setRentalCosts(FuncValidation.checkValidNumberDouble(content, errMes));
        while (service.getRentalCosts() <= 0) {
            System.out.println(errMes);
            service.setRentalCosts(FuncValidation.checkValidNumberDouble(content, errMes));
        }
        //enter max number of people
        content = "Enter max number of people :";
        errMes = "Max number of peoples is Invalid (Number people  > 0 and Number people <20 , is a Integer .Please try again !!";
        service.setMaxNumberOfPeople(FuncValidation.checkValidNumberInteger(content, errMes));
        while (service.getMaxNumberOfPeople() <= 0 || service.getMaxNumberOfPeople() >= 20) {
            System.out.println(errMes);
            service.setMaxNumberOfPeople(FuncValidation.checkValidNumberInteger(content, errMes));
        }

        //enter Type Rent
        System.out.println("Enter Type Rent");
        service.setTypeRent(sc.nextLine());
        while (!FuncValidation.checkNameService(service.getTypeRent())) {
            System.out.println("Type rent invalid .Please try again !!!");
            System.out.println("Enter type rent: ");
            service.setTypeRent(sc.nextLine());
        }
        return service;
    }

    private static void addNewVilla() {
        String content = "";
        String errMes = "";
        Service villa = new Villa();
        addNewService(villa);
        //enter room standard
        System.out.println("enter room standard:");
        ((Villa) villa).setRoomStandard(sc.nextLine());
        //enter Decription
        System.out.println("enter convenient Description");
        ((Villa) villa).setConvenientDescription(sc.nextLine());
        //enter area pool
        System.out.println("enter area pool");
        ((Villa) villa).setAreaPool(sc.nextDouble());
        System.out.println("enter number of floor");
        ((Villa) villa).setNumberOfFloors(sc.nextInt());

        ArrayList<Villa> listVilla = FuncWriteAndReadFileCSV.getVillaFromCSV();
        listVilla.add((Villa) villa);
        FuncWriteAndReadFileCSV.writeVillaToFileCSV(listVilla);
        System.out.println("\nAdd Villa: " + villa.getNameService() + "Sucessfully?!");
        backMainMenu();
    }

    private static void addNewHouse() {
        Service house = new House();
        addNewService(house);
        //enter room standard
        System.out.println("enter room standard:");
        ((House) house).setRoomStandard(sc.nextLine());
        //enter Decription
        System.out.println("enter convenient Description");
        ((House) house).setConvenientDescription(sc.nextLine());
        System.out.println("enter number of floor");
        ((House) house).setNumberOfFloor(sc.nextInt());
        ArrayList<House> listHouse = FuncWriteAndReadFileCSV.getHouseFromCSV();
        listHouse.add((House) house);
        FuncWriteAndReadFileCSV.writeHouseToFileCSV(listHouse);
        System.out.println("\nAdd House: " + house.getNameService() + "Sucessfully?!");
        sc.nextLine();
        backMainMenu();
    }

    private static void addNewRoom() {
        Service room = new Room();
        addNewService(room);
        //enter free services
        System.out.println("enter free service:");
        ((Room) room).setFreeService(sc.nextLine());
        //thuc hien them vao file chung ta phai lay toan bo danh sach cac Room trong file Room ra list Room
        ArrayList<Room> listRoom = FuncWriteAndReadFileCSV.getRoomFromCSV();
        //Sau khi thuc hien xong thi thuc hien them vao danh sach list Room do
        listRoom.add((Room) room);
        //sau do luu listRoom vao file Room.csv

        FuncWriteAndReadFileCSV.writeRoomToFileCSV(listRoom);
        System.out.println("\nAdd Room: " + room.getNameService() + "Sucessfully?!");
        sc.nextLine();
        backMainMenu();
    }

    // lay ra danh sach ten vila khong trung nhau
    private static void getNameVillaNotDuplicate() {
        TreeSet<String> listVillaTreeSet = new TreeSet<>();
        ArrayList<Villa> listVilla = FuncWriteAndReadFileCSV.getVillaFromCSV();
        for (Villa item : listVilla) {
            listVillaTreeSet.add(item.getNameService());
        }
        System.out.println("name service villa khong trung nhau la");
        for (String item : listVillaTreeSet) {
            System.out.println(item);
        }
    }

    private static void getNameHouseNotDuplicate() {
        TreeSet<String> listHouseTreeSet = new TreeSet<>();
        ArrayList<House> listHouse = FuncWriteAndReadFileCSV.getHouseFromCSV();
        for (House item : listHouse) {
            listHouseTreeSet.add(item.getNameService());
        }
        System.out.println("name service House khong trung nhau la");
        for (String item : listHouseTreeSet) {
            System.out.println(item);
        }
    }

    private static void showInfomationEmployee() {
        ArrayList<Employee> listEmployee = FuncWriteAndReadFileCSV.getEmployeeFromCSV();

//        for (Employee employee : listEmployee) {
        System.out.println("\n-----------------------");
        Map<String, Employee> map = new HashMap<>();
        map.put("001", listEmployee.get(0));
        map.put("002", listEmployee.get(1));
        map.put("003", listEmployee.get(2));
        map.put("004", listEmployee.get(3));
        map.put("005", listEmployee.get(4));
        map.put("006", listEmployee.get(5));
        map.put("007", listEmployee.get(6));
        map.put("008", listEmployee.get(7));
        map.put("009", listEmployee.get(8));
        map.put("010", listEmployee.get(9));
        Set<String> set = map.keySet();
        for (String key : set) {
            System.out.println("\n-----------------------");
            System.out.println("id:" + key + "\n" + map.get(key));
            System.out.println("\n-----------------------");
        }
        System.out.println("\n-----------------------");
        sc.nextLine();
        backMainMenu();
    }

    private static void showInfomationOfCustomerBoughtTicket() {
        ArrayList<Customer> listCustomer = FuncWriteAndReadFileCSV.getCustomerFromCSV();
        int i = 1;
        for (Customer cus : listCustomer) {
            System.out.println("\n----------------------------------");
            System.out.println("no: " + i);
            System.out.println(cus.showInfo());
            System.out.println("\n----------------------------------");
            i++;
        }
        System.out.println("Choose Customer Booking");
        int count = listCustomer.size();
        Queue<Customer> queue = new LinkedList<>();
        do {
            int nhap = sc.nextInt();
            while (true){
                    if((listCustomer.get(sc.nextInt()-1)).equals(queue.poll())){
                        System.out.println("The customer has been selected ");
                            nhap = sc.nextInt();
                    }else {
                        break;
                    }
                }
            count--;
            queue.add(listCustomer.get(nhap-1));
        } while (count != 0);
        System.out.println("-------------------------------------");
        System.out.println("show information of Customer bought ticket");
        for (Customer item : queue) {
            System.out.println(item.showInfo());
            System.out.println("----------------------------------------");
        }
    }
}




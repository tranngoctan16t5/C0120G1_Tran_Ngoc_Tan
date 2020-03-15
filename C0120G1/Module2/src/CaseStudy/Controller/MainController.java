package CaseStudy.Controller;

import CaseStudy.Common.FileCabinet;
import CaseStudy.Common.FuncReadFileCSV;
import CaseStudy.Common.FuncWriteFileCSV;
import CaseStudy.Common.FuncValidation;
import CaseStudy.Model.House;
import CaseStudy.Model.Room;
import CaseStudy.Model.Service;
import CaseStudy.Model.Villa;
import CaseStudy.Model.Customer;

import CaseStudy.Model.Employee;



import java.util.*;

public class MainController {
    public static Calendar rightNow = Calendar.getInstance();
    public static Service villa = new Villa();
    public static Service house = new House();
    public static Service room = new Room();
    public static Customer customer = new Customer();

    private static ArrayList<Villa> listVilla = new ArrayList<Villa>();
    private static ArrayList<House> listHouse = new ArrayList<House>();
    private static ArrayList<Room> listRoom = new ArrayList<Room>();
    public static ArrayList<Customer> listCustomer = new ArrayList<Customer>();
    public static ArrayList<Customer> listBooking = new ArrayList<Customer>();
    private static String content = "";
    private static String errMes = "";
    private static Scanner sc = new Scanner(System.in);

    public static void displayMainMenu() {
        System.out.println("Please choose you want :\n" +
                "1.Add new Service." +
                "\n2.Show Services." +
                "\n3.Add new Customer." +
                "\n4.Show information Customer." +
                "\n5.Add new booking resort." +
                "\n6.Add new employee." +
                "\n7.Show information employee." +
                "\n8.Show information of customer bought ticket." +
                "\n9.Search file of customer in Cabinet." +
                "\n10.Exit" +
                "\nPlease select one function below: "
        );
        String choose = sc.nextLine();
        switch (choose) {
            case "1":
                addNewService();
                break;
            case "2":
                showServices();
                backMainMenu();
                break;
            case "3":
                addNewCustomer();
                backMainMenu();
                break;
            case "4":
                showInformationCustomers();
                backMainMenu();
                break;
            case "5":
                addNewBooking();
                backMainMenu();
                break;
            case "6":
                addNewEmployee();
                backMainMenu();
                break;
            case "7":
                showInfomationEmployee();
                backMainMenu();
                break;
            case "8":
                showInformationOfCustomerBoughtTicket();
                backMainMenu();
                break;

            case "10":
                System.exit(0);
            default:
                System.out.println("Fail!! Please choose again ! Enter Continue.....");
                sc.nextLine();
                displayMainMenu();
        }
    }
    private static void showInfomationEmployee() {
        ArrayList<Employee> listEmployee = FuncReadFileCSV.getFileCSVToListEmployee();

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
        ArrayList<Employee> listEmployee = FuncReadFileCSV.getFileCSVToListEmployee();
        listEmployee.add(employee);
        FuncWriteFileCSV.writeEmployeeToCSV(listEmployee);
        System.out.println("\nAdd Employee for: " + employee.getName() + "Successfully!!");
        sc.nextLine();
        backMainMenu();
    }

    private static void addNewBooking() {
        listBooking = FuncReadFileCSV.getFileCSVToListBooking();
        listCustomer = FuncReadFileCSV.getFileCSVToListCustomer();
        Collections.sort(listCustomer, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getNameCustomer().compareToIgnoreCase(o2.getNameCustomer());
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
                listVilla = FuncReadFileCSV.getFileCSVToListVilla();
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
                listHouse = FuncReadFileCSV.getFileCSVToListHouse();
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
            case 3:
                i = 1;
                listRoom = FuncReadFileCSV.getFileCSVToListRoom();
                for (Room room : listRoom) {
                    System.out.println("\n---------------------------------");
                    System.out.println("No: " + i);
                    System.out.println(room.showInfo());
                    System.out.println("\n---------------------------------");
                    i++;
                }
                System.out.println("Choose room Booking ");
                Room room = listRoom.get(sc.nextInt() - 1);
                customer.setService(room);

                break;
            default:
                backMainMenu();
                break;
        }
//        listBooking=FuncReadFileCSV.getFileCSVToListBooking();
        listBooking.add(customer);
        FuncWriteFileCSV.writeBookingToCSV(listBooking);
    }

    private static void showInformationCustomers() {
        listCustomer = FuncReadFileCSV.getFileCSVToListCustomer();
        Collections.sort(listCustomer, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                if (o1.getNameCustomer().equals(o2.getNameCustomer())) {
                    return o1.getBirthday().compareTo(o2.getBirthday());
                } else {
                    return o1.getNameCustomer().compareToIgnoreCase(o2.getNameCustomer());
                }
            }
        });
        for (Customer customer : listCustomer) {
            System.out.println("\n-----------------------");
            System.out.println(customer.showInfo());
            System.out.println("\n-----------------------");
        }
    }

    private static void backMainMenu() {
        System.out.println("\nEnter to continue....");
        sc.nextLine();
        System.out.println("\n-------------------------");
        displayMainMenu();
    }
    private static void addNewCustomer() {
        Customer customer = new Customer();
        System.out.println("Enter name customer :");
        customer.setNameCustomer(sc.nextLine());
        while (!FuncValidation.checkNameCustomer(customer.getNameCustomer())){
            System.out.println("Name is invalid !!! Please try again");
            System.out.println("Enter name Customer");
            customer.setNameCustomer(sc.nextLine());
        }
        //enter Gender
        content="Enter Gender:";
        errMes="Gender is invalid !!! please try again";
        System.out.println("Enter Gender:");
        customer.setGender(sc.nextLine().toLowerCase());
        while (!FuncValidation.GenderException(customer.getGender().toLowerCase())){
            System.out.println(errMes);
            System.out.println(content);
            customer.setGender(sc.nextLine());
        }

//enter birthday
        content="enter birthday :";
        errMes="Birthday is invalid!!!! day now-birthday >18  Please try again";
        System.out.println(content);
        customer.setBirthday(sc.nextLine());
        while (!FuncValidation.checkValidBirthday(customer.getBirthday())) {
            System.out.println(errMes);
            System.out.println(content);
            customer.setBirthday(sc.nextLine());
        }
        String[] arr = customer.getBirthday().split("\\/");
        int y = rightNow.get(Calendar.YEAR);
        while (y - (Integer.parseInt(arr[2])) < 18) {
            System.out.println(errMes);
            System.out.println(content);
            customer.setBirthday(sc.nextLine());
        }

        content="enter ID card";
        errMes="Id card is invalid!!!! id card format is XXX XXX XXX  Please try again ";
        System.out.println(content);
        customer.setIdCard(sc.nextInt());
        while (!FuncValidation.IdCardException(String.valueOf(customer.getIdCard()))){
            System.out.println(content);
            System.out.println(errMes);
            customer.setIdCard(sc.nextInt());
        }
        sc.nextLine();
        System.out.println("Enter phone Number: ");
        customer.setPhoneNumber(sc.nextInt());
        sc.nextLine();

        //enter email
        System.out.println("Enter email :");
        customer.setEmail(sc.nextLine().toLowerCase());
        while (!FuncValidation.checkEmail(customer.getEmail())){
            System.out.println("email is invalid!!! please try again");
            System.out.println("Enter email :");
            customer.setEmail(sc.nextLine().toLowerCase());
        }

        System.out.println("Enter type Customer :");
        customer.setTypeCustomer(sc.nextLine());
        System.out.println("Enter address");
        customer.setAddress(sc.nextLine());

        listCustomer = FuncReadFileCSV.getFileCSVToListCustomer();
        listCustomer.add(customer);
        FuncWriteFileCSV.writeCustomerToCSV(listCustomer);
        System.out.println("\nAdd Customer Successfully?!");
        backMainMenu();
    }

    public static void addNewService() {
        System.out.println("\n-------------------------");
        System.out.println("\n1.Add new Villa." +
                "\n2.Add new House" +
                "\n3.Add new Room" +
                "\n4.Back to menu" +
                "\n5.Exit" +
                "\nPlease select one function below: "
        );
        String input = sc.nextLine();
        switch (input) {
            case "1":
                addNewVilla();
                backMainMenu();
                break;
            case "2":
                addNewHouse();
                backMainMenu();
                break;
            case "3":
                addNewRoom();
                backMainMenu();
                break;
            case "4":
                displayMainMenu();
                System.out.println("\n------------------");
            case "5":
                System.exit(0);
            default:
                System.out.println("\nError.Back to menu.");
                backMainMenu();

        }
    }

    private static void addNewService(Service service) {
        //enter id service
        System.out.println("enter id service");
        service.setId(sc.nextLine());
        while (!FuncValidation.checkIdService(service.getId(), service)) {
            System.out.println("Id Service is invalid .Please try again !!!");
            System.out.println("Enter ID Service: ");
            service.setId(sc.nextLine());
        }
        //enter name Services
        System.out.println("Enter name Services");
        service.setNameService(sc.nextLine());
        while (!FuncValidation.checkNameServices(service.getNameService())) {
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
        while (FuncValidation.checkNameServices(service.getTypeRent())) {
            System.out.println("Type rent invalid .Please try again !!!");
            System.out.println("Enter type rent: ");
            service.setTypeRent(sc.nextLine());
        }
    }

    private static void addNewVilla() {
        listVilla = FuncReadFileCSV.getFileCSVToListVilla();
        addNewService(villa);
        //enter room standard
        System.out.println("enter room standard:");
        ((Villa) villa).setRoomStandard(sc.nextLine());

        //enter Decription
        System.out.println("enter convenient Description");
        ((Villa) villa).setConvenientDescription(sc.nextLine());

        //enter area pool
        content = "Enter area pool :";
        errMes = "Area pool is Invalid (Area > 30, Area must be a Double .Please try again !!";
        ((Villa) villa).setAreaPool(FuncValidation.checkValidNumberDouble(content, errMes));
        while (((Villa) villa).getAreaPool() < 30) {
            System.out.println(errMes);
            ((Villa) villa).setAreaPool(FuncValidation.checkValidNumberDouble(content, errMes));
        }

        //enter number of floor
        content = "Enter number of floor :";
        errMes = "Number of floor is Invalid ( Number of floor must be a Double .Please try again !!";
        ((Villa) villa).setNumberOfFloors(FuncValidation.checkValidNumberInteger(content, errMes));

        listVilla.add((Villa) villa);
        FuncWriteFileCSV.writeVillaToCSV(listVilla);
        System.out.println("Add new villa complete ! Enter to continue....");
        sc.nextLine();
        displayMainMenu();

    }

    private static void addNewHouse() {
        listHouse = FuncReadFileCSV.getFileCSVToListHouse();
        addNewService(house);
        //enter room standard
        System.out.println("enter room standard:");
        ((House) house).setRoomStandard(sc.nextLine());
        //enter Decription
        System.out.println("enter convenient Description");
        ((House) house).setConvenientDescription(sc.nextLine());
        System.out.println("enter number of floor");
        ((House) house).setNumberOfFloor(sc.nextInt());
        listHouse.add((House) house);
        FuncWriteFileCSV.writeHouseToCSV(listHouse);
        System.out.println("Add new villa complete ! Enter to continue....");
        sc.nextLine();
        displayMainMenu();

    }

    private static void addNewRoom() {
        listRoom = FuncReadFileCSV.getFileCSVToListRoom();
        addNewService(room);
        //enter room standard
        System.out.println("enter free services");
        ((Room) room).setFreeService(sc.nextLine());
        listRoom.add((Room) room);
        FuncWriteFileCSV.writeRoomToCSV(listRoom);
        System.out.println("Add new Room complete ! Enter to continue....");
        sc.nextLine();
        displayMainMenu();

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
        String input = sc.nextLine();
        switch (input) {
            case "1":
                showAllVilla();
                displayMainMenu();
                break;
            case "2":
                showAllHouse();
                displayMainMenu();
                break;
            case "3":
                showAllRoom();
                displayMainMenu();
                break;
            case "4":
                getNameVillaNotDuplicate();
                displayMainMenu();
                break;
            case "5":
                getNameHouseNotDuplicate();
                displayMainMenu();
                break;
            case "6":
                getNameRoomNotDuplicate();
                displayMainMenu();
                break;
            case "8":
                System.exit(0);
            default:
                System.out.println("\n Error.Back to menu");
                backMainMenu();
        }

    }


    private static void showAllVilla() {
        listVilla = FuncReadFileCSV.getFileCSVToListVilla();
        for (Villa villa : listVilla) {
            System.out.println("-------------------------------");
            System.out.println(villa.showInfo());
            System.out.println("-------------------------------");
        }
    }

    private static void showAllHouse() {
        listHouse = FuncReadFileCSV.getFileCSVToListHouse();
        for (House house : listHouse) {
            System.out.println("-------------------------------");
            System.out.println(house.showInfo());
            System.out.println("-------------------------------");
        }
    }

    private static void showAllRoom() {
        listRoom = FuncReadFileCSV.getFileCSVToListRoom();
        for (Room room : listRoom) {
            System.out.println("-------------------------------");
            System.out.println(room.showInfo());
            System.out.println("-------------------------------");
        }
    }

    private static void getNameVillaNotDuplicate() {
        TreeSet<String> listVillaTreeSet = new TreeSet<>();
        ArrayList<Villa> listVilla = FuncReadFileCSV.getFileCSVToListVilla();
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
        ArrayList<House> listHouse = FuncReadFileCSV.getFileCSVToListHouse();
        for (House item : listHouse) {
            listHouseTreeSet.add(item.getNameService());
        }
        System.out.println("name service villa khong trung nhau la");
        for (String item : listHouseTreeSet) {
            System.out.println(item);
        }
    }

    private static void getNameRoomNotDuplicate() {
        TreeSet<String> listRoomTreeSet = new TreeSet<>();
        ArrayList<Room> listVilla = FuncReadFileCSV.getFileCSVToListRoom();
        for (Room item : listRoom) {
            listRoomTreeSet.add(item.getNameService());
        }
        System.out.println("name service villa khong trung nhau la");
        for (String item : listRoomTreeSet) {
            System.out.println(item);
        }
    }
    public static void showInformationOfCustomerBoughtTicket(){
        ArrayList<Customer> listCustomer = FuncReadFileCSV.getFileCSVToListCustomer();
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
                count--;
                queue.add(listCustomer.get(nhap-1));
            System.out.println("choose Customer continue  ");
        } while (count != 0);
        System.out.println("-------------------------------------");
        System.out.println("show information of Customer bought ticket");
        for (Customer item : queue) {
            System.out.println(item.showInfo());
            System.out.println("----------------------------------------");
        }
    }

}

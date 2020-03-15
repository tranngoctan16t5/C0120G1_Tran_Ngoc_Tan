package Bai_Tap_oop.Bai1.Controller;

import Bai_Tap_oop.Bai1.Commons.FuncValidate;
import Bai_Tap_oop.Bai1.Model.Engineer;
import Bai_Tap_oop.Bai1.Model.Officials;
import Bai_Tap_oop.Bai1.Model.Staff;
import Bai_Tap_oop.Bai1.Model.Worker;
import CaseStudy_Module2.Commons.FuncValidation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class MainController {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Officials> listEngineer = new ArrayList<>();
    private static ArrayList<Officials> listStaff = new ArrayList<>();
    private static ArrayList<Officials> listWorker = new ArrayList<>();

    public static void displayMainMenu() {

        System.out.println("1.Add new officials" +
                "\n2.Show infomation official" +
                "\n3.Search official by name" +
                "\n4.Sort By Name" +
                "\n5.Exit");
        switch (sc.nextInt()) {
            case 1:
                addNewOfficial();
                break;
            case 2:
                showInfoOfficial();
                break;
            case 3:
                searchName();
                displayMainMenu();
                break;
            case 4:
                sortByName();
                displayMainMenu();
                break;
            case 5:
                System.exit(0);
            default:
                System.out.println("faill !!!");
                displayMainMenu();
        }

    }

    public static void addNewOfficial() {

        System.out.println("1.Add new Engineer" +
                "\n2.Add new Staff" +
                "\n3.Add new worker" +
                "\n4.Back to menu");
        System.out.println("---------------------------");
        switch (sc.nextInt()) {
            case 1:
                addNewEngineer();
                displayMainMenu();
                break;
            case 2:
                addNewStaff();
                displayMainMenu();
                break;
            case 3:
                addNewWorker();
                displayMainMenu();
                break;
            default:
                System.out.println("Faill !!");
                addNewOfficial();
        }
    }

    public static void showInfoOfficial() {
        System.out.println("1.show info Engineer" +
                "\n2.show info Staff" +
                "\n3.show info Worker" +
                "\n4.back to menu");
        switch (sc.nextInt()) {
            case 1:
                showInfoEngineer();
                displayMainMenu();
                break;
            case 2:
                showInfoStaff();
                displayMainMenu();
                break;
            case 3:
                showInfoWorker();
                displayMainMenu();
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("Faill !!");
                showInfoOfficial();
        }
    }

    public static void showInfoEngineer() {
        for (Officials e : listEngineer) {
            e.showInfo();
        }
    }

    public static void showInfoStaff() {
        for (Officials e : listStaff) {
            e.showInfo();
        }
    }

    public static void showInfoWorker() {
        for (Officials e : listWorker) {
            e.showInfo();
        }
    }

    public static void addNewOfficial(Officials officials) {
        sc.nextLine();
        System.out.println("Enter name :");
        officials.setName(sc.nextLine());
        String content = "enter age :";
        String errMess = "age is invalid!! please try again";
        officials.setAge(FuncValidate.checkNumberInteger(content, errMess));
        System.out.println("Enter Gender:");
        officials.setGender(sc.nextLine());
        System.out.println("Enter Address:");
        officials.setAddress(sc.nextLine());

    }

    public static void addNewEngineer() {
        Officials engineer = new Engineer();
        addNewOfficial(engineer);
        System.out.println("enter training sector");
        ((Engineer) engineer).setTrainingSector(sc.nextLine());
        listEngineer.add(engineer);
    }

    public static void addNewStaff() {
        Officials staff = new Staff();
        addNewOfficial(staff);
        System.out.println("enter Work");
        ((Staff) staff).setWork(sc.nextLine());
        listStaff.add(staff);
    }

    public static void addNewWorker() {
        Officials worker = new Worker();
        addNewOfficial(worker);
        String content = "enter Rank";
        String errMess = "Rank is invalid !! rank between 1 to 10 ";
        ((Worker) worker).setRank((FuncValidate.checkNumberInteger(content, errMess)));
        while (((Worker) worker).getRank() < 1 || ((Worker) worker).getRank() > 10) {
            System.out.println(errMess);
            ((Worker) worker).setRank(FuncValidate.checkNumberInteger(content, errMess));

        }
        listWorker.add(worker);
    }

    public static void searchName() {
        sc.nextLine();
        System.out.println("Enter name need check :");
        String input = sc.nextLine();
        searchArray(listEngineer, input);
        searchArray(listStaff, input);
        searchArray(listWorker, input);
    }

    public static void searchArray(ArrayList<Officials> arr, String str) {
        for (Officials e : arr) {
            if (e.getName().equals(str)) {
                e.showInfo();
            }
        }
    }

    public static void sortByName() {
        System.out.println("1.Sort engineer" +
                "\n2.Sort Staff" +
                "\n3.Sort Worker");
        switch (sc.nextInt()){
            case 1:
                sortByNameEngineer();
                break;
//            case 2:
//                sortByNameStaff();
//                break;
//            case 3:
//                sortByNameWorker();
//                break;
            default:
                displayMainMenu();

        }

    }
    public static void sortByNameEngineer(){
        Collections.sort(listEngineer, new Comparator<Officials>() {
            @Override
            public int compare(Officials o1, Officials o2) {
//                if(o1.getName()>o2.getName()){
//                    return 1;
//                }else if(o1.getAge()<o2.getAge()){
//                    return -1;
//                }else
//                    return 0;
//            }
                return o1.getName().compareTo(o2.getName())*-1;
            }

        });
        for (Officials item:listEngineer){
            System.out.println(item);
        }

    }

}

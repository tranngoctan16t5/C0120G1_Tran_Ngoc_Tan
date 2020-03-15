package CaseStudy_Module2.Commons;

import CaseStudy_Module2.Models.*;
import com.opencsv.CSVWriter;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FuncWriteAndReadFileCSV {
    private static final char DEFAULT_SEPARATOR = ',';
    private static final char DEFAULT_QUOTE = '"';
    private static final String pathVilla = "src/Data/Villa.csv";
    private static final String pathHouse = "src/Data/House.csv";
    private static final String pathRoom = "src/Data/Room.csv";
    private static final String pathCustomer = "src/Data/Customer.csv";
    private static final String pathBooking = "src/Data/Booking.csv";
    private static final String pathEmployee = "src/Data/Employee.csv";
    private static String[] headerRecordVilla = new String[]{"id", "nameService", "areaUsed", "rentalCosts", "maxNumberOfPeople", "typeRent",
            "roomStandard", "convenientDescription", "areaPool", "numberOfFloors"};
    private static String[] headerRecordHouse = new String[]{"id", "nameService", "areaUsed", "rentalCosts", "maxNumberOfPeople", "typeRent",
            "roomStandard", "convenientDescription", "numberOfFloors"};
    private static String[] headerRecordRoom = new String[]{"id", "nameService", "areaUsed", "rentalCosts", "maxNumberOfPeople", "typeRent",
            "freeService"};
    private static String[] headerRecordCustomer = new String[]{"nameCustomer", "gender", "idCard", "phoneNumber", "email", "birthday","typeCustomer",
            "address"};
    private static String[] headerRecordBooking = new String[]{"nameCustomer", "gender", "idCard", "phoneNumber", "email","birthday","typeCustomer",
            "address","id", "nameService", "areaUsed", "rentalCosts", "maxNumberOfPeople", "typeRent"};
    private static String[] headerRecordEmployee = new String[]{"name", "age", "address"};


    //the line number to skip for start reading
    private static final int NUM_OF_LINE_SKIP = 1;

    //function write  Villa to File CSV
    public static void writeVillaToFileCSV(ArrayList<Villa> arrayList) {
        try (Writer writer = new FileWriter(pathVilla);
             CSVWriter csvWriter = new CSVWriter(writer, CSVWriter.DEFAULT_SEPARATOR, CSVWriter.NO_QUOTE_CHARACTER
                     , CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordVilla);
            for (Villa villa : arrayList) {
                csvWriter.writeNext(new String[]{
                        villa.getId(), villa.getNameService(), String.valueOf(villa.getAreaUsed()), String.valueOf(villa.getRentalCosts()),
                        String.valueOf(villa.getMaxNumberOfPeople()), villa.getTypeRent(), villa.getRoomStandard(), villa.getConvenientDescription(),
                        String.valueOf(villa.getAreaPool()), String.valueOf(villa.getNumberOfFloors())
                });
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    //function write House to File CSV
    public static void writeHouseToFileCSV(ArrayList<House> arrayList) {
        try (Writer writer = new FileWriter(pathHouse);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.NO_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END
             )) {
            csvWriter.writeNext(headerRecordHouse);
            for (House house : arrayList) {
                csvWriter.writeNext(new String[]{
                        house.getId(), house.getNameService(),
                        String.valueOf(house.getAreaUsed()),
                        String.valueOf(house.getRentalCosts()),
                        String.valueOf(house.getMaxNumberOfPeople()),
                        house.getTypeRent(),
                        house.getRoomStandard(),
                        String.valueOf(house.getConvenientDescription()),
                        String.valueOf(house.getNumberOfFloor())

                });
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    //function write Room to File CSV
    public static void writeRoomToFileCSV(ArrayList<Room> arrayList) {
        try (Writer writer = new FileWriter(pathRoom);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.NO_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END
             )) {
            csvWriter.writeNext(headerRecordRoom);
            for (Room room : arrayList) {
                csvWriter.writeNext(new String[]{
                        room.getId(), room.getNameService(),
                        String.valueOf(room.getAreaUsed()),
                        String.valueOf(room.getRentalCosts()),
                        String.valueOf(room.getMaxNumberOfPeople()),
                        room.getTypeRent(),
                        room.getFreeService()
                });
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    //function write list customer from CSV
    public static void writeCustomerToFileCSV(ArrayList<Customer> arrayList) {
        try (Writer writer = new FileWriter(pathCustomer);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.NO_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordCustomer);
//            {"nameCustomer", "gender", "idCard", "phoneNumber", "email", "typeCustomer",
//                    "address"};
            for (Customer customer : arrayList) {
                csvWriter.writeNext(new String[]{
                        customer.getNameCustomer(),
                        customer.getGender(),
                        String.valueOf(customer.getIdCard()),
                        String.valueOf(customer.getPhoneNumber()),
                        customer.getEmail(),
                        customer.getBirthday(),
                        customer.getTypeCustomer(),
                        customer.getAddress()
                });
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
}
    //function write list employee from CSV
    public static void writeEmployeeToFileCSV(ArrayList<Employee>arrayList) {
        try (Writer writer = new FileWriter(pathEmployee);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.NO_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordEmployee);
//            {"nameCustomer", "gender", "idCard", "phoneNumber", "email", "typeCustomer",
//                    "address"};
            for (Employee employee : arrayList) {
                csvWriter.writeNext(new String[]{
                        employee.getName(),
                        String.valueOf(employee.getAge()),
                        employee.getAddress(),

                });
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    //get list employee
    public static ArrayList<Employee> getEmployeeFromCSV() {
        Path path = Paths.get(pathEmployee);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathEmployee);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Employee> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Employee.class);
        strategy.setColumnMapping(headerRecordEmployee);

        CsvToBean<Employee> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<Employee>(new FileReader(pathEmployee))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return (ArrayList<Employee>) csvToBean.parse();
    }

    //function write list Booking from CSV
    public static void writeBookingToFileCSV(ArrayList<Customer> arrayList) {
        try (Writer writer = new FileWriter(pathBooking);
             CSVWriter csvWriter = new CSVWriter(writer,
                     CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.NO_QUOTE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordBooking);
            for (Customer customer : arrayList) {
                csvWriter.writeNext(new String[]{
//                        {"nameCustomer", "gender", "idCard", "phoneNumber", "email", "typeCustomer",
//                                "address","id", "nameService", "areaUsed", "rentalCosts", "maxNumberOfPeople", "typeRent"};
                        customer.getNameCustomer(),
                        customer.getGender(),
                        String.valueOf(customer.getIdCard()),
                        String.valueOf(customer.getPhoneNumber()),
                        customer.getEmail(),
                        customer.getBirthday(),
                        customer.getTypeCustomer(),
                        customer.getAddress(),

                        customer.getService().getId(),
                        customer.getService().getNameService(),
                        String.valueOf(customer.getService().getAreaUsed()),
                        String.valueOf(customer.getService().getRentalCosts()),
                        String.valueOf(customer.getService().getMaxNumberOfPeople()),
                        customer.getService().getTypeRent()

                });
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    //function get list customer from CSV
    public static ArrayList<Customer> getCustomerFromCSV() {
        Path path = Paths.get(pathCustomer);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathCustomer);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Customer> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Customer.class);
        strategy.setColumnMapping(headerRecordCustomer);

        CsvToBean<Customer> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<Customer>(new FileReader(pathCustomer))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return (ArrayList<Customer>) csvToBean.parse();
    }
//    //function get list Booking from CSV
    public static ArrayList<Customer> getBookingFromCSV() {
        Path path = Paths.get(pathBooking);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathBooking);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Customer> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Customer.class);
        strategy.setColumnMapping(headerRecordBooking);

        CsvToBean<Customer> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<Customer>(new FileReader(pathBooking))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return (ArrayList<Customer>) csvToBean.parse();
    }
    //function get list villa from CSV
    public static ArrayList<Villa> getVillaFromCSV() {
        Path path = Paths.get(pathVilla);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathVilla);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Villa> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Villa.class);
        strategy.setColumnMapping(headerRecordVilla);

        CsvToBean<Villa> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<Villa>(new FileReader(pathVilla))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return (ArrayList<Villa>) csvToBean.parse();
    }

    //function get list house from CSV
    public static ArrayList<House> getHouseFromCSV() {
        Path path = Paths.get(pathHouse);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathHouse);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<House> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(House.class);
        strategy.setColumnMapping(headerRecordHouse);

        CsvToBean<House> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<House>(new FileReader(pathHouse))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return (ArrayList<House>) csvToBean.parse();
    }

    //function get list room from CSV
    public static ArrayList<Room> getRoomFromCSV() {
        Path path = Paths.get(pathRoom);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathRoom);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Room> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Room.class);
        strategy.setColumnMapping(headerRecordRoom);

        CsvToBean<Room> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<Room>(new FileReader(pathRoom))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return (ArrayList<Room>) csvToBean.parse();
    }


}

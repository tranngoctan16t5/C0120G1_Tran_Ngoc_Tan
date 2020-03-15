package CaseStudy.Model;

public class Room extends Service {
    private String freeService;

    public Room() {
    }

    public Room(String id, String nameService, double areaUsed, double rentalCosts, int maxNumberOfPeople, String typeRent, String freeService) {
        super(id, nameService, areaUsed, rentalCosts, maxNumberOfPeople, typeRent);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String showInfo() {
        return "\nId Services: " + super.getId() +
                "\nName Services:" + super.getNameService() +
                "\nArea Used:" + super.getAreaUsed() +
                "\nRental Costs:" + super.getRentalCosts() +
                "\nMax Number Of People:" + super.getMaxNumberOfPeople() +
                "\nType Rent:" + super.getTypeRent() +
                "\nRoom Standard:" + getFreeService();

    }
}

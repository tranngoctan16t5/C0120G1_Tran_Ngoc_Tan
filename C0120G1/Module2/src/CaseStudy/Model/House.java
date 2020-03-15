package CaseStudy.Model;

public class House extends Service {
    private String roomStandard;
    private String convenientDescription;
    private int numberOfFloors;

    public House() {
    }

    public House(String id, String nameService, double areaUsed, double rentalCosts, int maxNumberOfPeople, String typeRent, String roomStandard, String convenientDescription, int numberOfFloors) {
        super(id, nameService, areaUsed, rentalCosts, maxNumberOfPeople, typeRent);
        this.roomStandard = roomStandard;
        this.convenientDescription = convenientDescription;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getConvenientDescription() {
        return convenientDescription;
    }

    public void setConvenientDescription(String convenientDescription) {
        this.convenientDescription = convenientDescription;
    }

    public int getNumberOfFloor() {
        return numberOfFloors;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloors = numberOfFloor;
    }

    @Override
    public String showInfo() {
        return "\nId Services: " + super.getId() +
                "\nName Services:" + super.getNameService() +
                "\nArea Used:" + super.getAreaUsed() +
                "\nRental Costs:" + super.getRentalCosts() +
                "\nMax Number Of People:" + super.getMaxNumberOfPeople() +
                "\nType Rent:" + super.getTypeRent() +
                "\nRoom Standard:" + this.roomStandard +
                "\nconvenient Description:" + this.convenientDescription +
                "\nNumber Of Floors" + this.numberOfFloors;
    }
}

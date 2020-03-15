package B4_Advanced_Object_Oriented_Design.Thuc_Hanh.Lop_Animal_va_interface_Edible;

public class Chicken extends Animal implements Edible{

    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "ga an bang mo";
    }
}

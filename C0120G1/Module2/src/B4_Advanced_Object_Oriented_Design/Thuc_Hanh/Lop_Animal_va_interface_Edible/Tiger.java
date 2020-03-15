package B4_Advanced_Object_Oriented_Design.Thuc_Hanh.Lop_Animal_va_interface_Edible;

public class Tiger extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Tiger: roarrrrr!";
    }

    @Override
    public String howToEat() {
        return "Ho an bang rang";
    }
}

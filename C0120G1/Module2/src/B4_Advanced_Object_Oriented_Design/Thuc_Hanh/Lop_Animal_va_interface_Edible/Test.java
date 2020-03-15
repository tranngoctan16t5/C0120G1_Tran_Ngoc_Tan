package B4_Advanced_Object_Oriented_Design.Thuc_Hanh.Lop_Animal_va_interface_Edible;

public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];

        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {

                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
    }
}

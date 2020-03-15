package on_tap;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
       Controller<Student>controller=new Controller<>();
       controller.add(new Student("R1","A"));
        controller.add(new Student("R2","B"));
        System.out.println(controller.get(0).fullName);

    }

}

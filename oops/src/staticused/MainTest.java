package staticused;

import java.util.SortedMap;

/**
 * Author: Sandeep Singh
 * Date: 03/04/25
 */

public class MainTest {
    public static void main(String[] args) {
        Father father = new Father();
        father.height();
        Father.run();
        Father.speak();
        Father.surName();

        // when we override a static method its not override its overhide so we have not use it

        System.out.println("\n\n");
        System.out.println("Child \n\n");
        Child child = new Child();
        child.height();

        Child.run(); // static method override/overhide  // this methgod i have not override so use Father Method
        Child.surName(); // static method override/overhide
        Child.speak(); // static method override/overhide


    }
}

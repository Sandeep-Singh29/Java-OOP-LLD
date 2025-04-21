package staticused;

/**
 * Author: Sandeep Singh
 * Date: 03/04/25
 */

public class Child extends Father{


    @Override
    public void height() {       // this method is override
        System.out.println("Child height 5.10");
    }

    /*public static void run() {        // this method is not override its called as overhide
        System.out.println("Child Fast Walk"); // this method is not override so this time Father method call
    }*/

    //@Override  static method cannot we annotated with @Override
    public static void speak() {                // this method is not override its called as overhide
        System.out.println("Child Slow Speak");
    }

  /*  public static final void surName() {   this method give me a compile time error
        System.out.println("Kushwaha");      'surName()' cannot override 'surName()' in 'staticused.Father'; overridden method is final
                                               make sure surName() not final when we override a method
    }*/


}

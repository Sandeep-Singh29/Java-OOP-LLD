package usecaseabstractandinterface.abstrcationandinterface;

/**
 * Author: Sandeep Singh
 * Date: 12/03/25
 */

public interface EnergyType {

     // String type; >>   we can not create a instance variable  >>> This give me a error
     // we have create only public static final variable and initialized in interface itself

    // public static final String type = "test";    >> This will work


    void energyType(String energyType);

}

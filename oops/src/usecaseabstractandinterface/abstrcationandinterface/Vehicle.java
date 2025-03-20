package usecaseabstractandinterface.abstrcationandinterface;

/**
 * Author: Sandeep Singh
 * Date: 12/03/25
 */

public abstract class Vehicle {

//    public Vehicle() {  // we can also create a Constructor
//    }

//    int start; // we can create a instance variable

     abstract void speed(int speed);

     void engineStart(String vehicleName){
         System.out.println(vehicleName+ " Start");
     }

    void engineStop(String vehicleName){
        System.out.println(vehicleName+ " Stop");
    }

}

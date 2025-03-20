package usecaseabstractandinterface.abstrcationandinterface;

/**
 * Author: Sandeep Singh
 * Date: 12/03/25
 */

public class Bike extends Vehicle implements EnergyType {

    @Override
    public void energyType(String energyType) {
        System.out.println("EnergyType is :: " + energyType);
    }

    @Override
    void speed(int speed) {
        System.out.println("Speed is :: " + speed);
    }
}

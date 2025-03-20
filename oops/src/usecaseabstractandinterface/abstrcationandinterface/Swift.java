package usecaseabstractandinterface.abstrcationandinterface;

/**
 * Author: Sandeep Singh
 * Date: 12/03/25
 */

public class Swift extends Vehicle implements EnergyType {

    @Override
    void speed(int speed) {
        System.out.println("Speed is :: " + speed);
    }

    @Override
    public void energyType(String type) {
        System.out.println("EnergyType is :: " + type);
    }
}

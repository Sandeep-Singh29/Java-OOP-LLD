package usecaseabstractandinterface.abstrcationandinterface;

/**
 * Author: Sandeep Singh
 * Date: 12/03/25
 */

public class VehicleTest {
    public static void main(String[] args) {
        GWagon gWagon = new GWagon();
        gWagon.engineStart("G-Wagon");
        gWagon.speed(250);
        gWagon.energyType("electric");
        gWagon.engineStop("G-Wagon");

        System.out.println("\n");

        Swift swift = new Swift();
        swift.engineStart("Swift");
        swift.speed(120);
        swift.energyType("Diesel");
        swift.engineStop("Swift");

        System.out.println("\n");

        Bike bike = new Bike();
        bike.engineStart("Apache");
        bike.speed(80);
        bike.energyType("Petrol");
        bike.engineStop("Apache");
    }
}

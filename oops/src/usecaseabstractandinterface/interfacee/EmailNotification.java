package usecaseabstractandinterface.interfacee;

/**
 * Author: Sandeep Singh
 * Date: 12/03/25
 */

public class EmailNotification implements Notification {

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Email :: " + message);
    }
}

package usecaseabstractandinterface.interfacee;

/**
 * Author: Sandeep Singh
 * Date: 12/03/25
 */

public class NotificationTest {
    public static void main(String[] args) {
        EmailNotification emailNotification = new EmailNotification();
        emailNotification.sendNotification("Order is Shipped");

        SmsNotification smsNotification = new SmsNotification();
        smsNotification.sendNotification("Your OPT is :: 12345");
    }
}

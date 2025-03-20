package usecaseabstractandinterface.abstrcation;

/**
 * Author: Sandeep Singh
 * Date: 12/03/25
 */

public class UpiPayment extends PaymentProcess {

    @Override
    void paymentType() {
        System.out.println("Payment Done By UpiPayment");
    }
}

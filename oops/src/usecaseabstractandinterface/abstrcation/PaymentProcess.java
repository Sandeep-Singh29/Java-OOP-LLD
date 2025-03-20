package usecaseabstractandinterface.abstrcation;

/**
 * Author: Sandeep Singh
 * Date: 12/03/25
 */

public abstract class PaymentProcess {

    abstract void paymentType();

    public void paymentReceiptBy(String paymentType, int amount) {
        System.out.println("Payment receipt amount is :: " + amount + "  and Payment Done By: " + paymentType);
    }

    public void paymentReceiptBy() {
        System.out.println("Payment Done By inHand Cash");
    }

}

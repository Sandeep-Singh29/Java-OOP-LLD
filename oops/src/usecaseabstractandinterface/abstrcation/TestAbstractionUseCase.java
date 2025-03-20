package usecaseabstractandinterface.abstrcation;

/**
 * Author: Sandeep Singh
 * Date: 12/03/25
 */

public class TestAbstractionUseCase {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        creditCard.paymentType();
        creditCard.paymentReceiptBy("credit-card", 200);
        System.out.println("\n");
        UpiPayment upiPayment = new UpiPayment();
        upiPayment.paymentType();
        upiPayment.paymentReceiptBy("upi-payment",170);
        System.out.println("\n");
        Cash cash = new Cash();
        cash.paymentType();
        cash.paymentReceiptBy();


    }
}

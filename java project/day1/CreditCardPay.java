public class CreditCardPay extends Payment {
    private String cardNumber;
    private String cvv;

    CreditCardPay(double amount, String cardNumber, String cvv) {
        super(amount);
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    @Override
    public void makePayment() {
        System.out.println("process Credit Card payment");
        System.out.println("Card Number -" + cardNumber);
        String SetCard = "1221 1221 1221 1221";
        String SetCvv = "123";
        if (cardNumber.equals(SetCard) && cvv.equals(SetCvv)) {
            System.out.println("paid amount" + amount);
            PaymentSucess();
        } else {
            System.out.println("Invalid credit card number or CVV. Payment failed.");
        }
    }
}

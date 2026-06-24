public class DebitcardPay extends Payment {
    private String cardNumber;
    private String pin;

    DebitcardPay(double amount, String cardNumber, String pin) {
        super(amount);
        this.cardNumber = cardNumber;
        this.pin = pin;
    }

    @Override
    public void makePayment() {
        System.out.println("process Debit Card payment");
        System.out.println("Card Number -" + cardNumber);
        String SetCard = "1111 2222 3333 4444";
        String SetPin = "4321";
        if (cardNumber.equals(SetCard) && pin.equals(SetPin)) {
            System.out.println("paid amount" + amount);
            PaymentSucess();
        } else {
            System.out.println("Invalid debit card number or PIN. Payment failed.");
        }
    }

}

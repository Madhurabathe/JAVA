public class UpiPay extends Payment {
    private String upiId;
    private String pin;

    UpiPay(double amount, String upiId, String pin) {
        super(amount);
        this.upiId = upiId;
        this.pin = pin;
    }

    @Override
    public void makePayment() {
        System.out.println("process UPI payment");
        System.out.println("UPI ID -" + upiId);
        String SetUpi = "user@upi";
        String SetPin = "1212";
        if (upiId.equals(SetUpi) && pin.equals(SetPin)) {
            System.out.println("paid amount" + amount);
            PaymentSucess();
        } else {
            System.out.println("Invalid UPI ID or PIN. Payment failed.");
        }
    }

}

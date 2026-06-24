public abstract class Payment {
    protected double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    abstract void makePayment();

    void PaymentSucess() {
        System.out.println("Payment of " + amount + " is successful.");
    }
}

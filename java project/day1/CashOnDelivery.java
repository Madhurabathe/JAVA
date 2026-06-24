public class CashOnDelivery extends Payment {

    CashOnDelivery(double amount) {
        super(amount);
    }
    @Override
    public void makePayment() {
        System.out.println("process Cash on Delivery payment");
        System.out.println("paid amount" +amount);
        PaymentSucess();
    }
    
}

import java.util.Scanner;

public class FoodOrderingSystem {
    public static void main(String[] args) {
        FoodOrderingSystem obj = new FoodOrderingSystem();
        Scanner sc = new Scanner(System.in);
        String username = "admin";
        String password = "1234";
        System.out.println("Enter username:");
        String user = sc.nextLine();
        System.out.println("Enter password:");
        String pass = sc.nextLine();
        if (user.equals(username) && pass.equals(password)) {
            System.out.println("LOGIN SUCCESSFUL");
            int choice;
            double totalBill = 0;
            do {
                System.out.println("======= MENU =======");
                System.out.println("1. PIZZA-   $250");
                System.out.println("2. BURGER-  $120");
                System.out.println("3. PASTA-   $180");
                System.out.println("4. SANDWICH-  $100");
                System.out.println("5. Checkout");
                System.out.println("6. EXIT");
                System.out.println("Enter your choice:");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("how many quantity of ?");
                        int qunty1 = sc.nextInt();
                        totalBill = 250 * qunty1;
                        System.out.println(qunty1 + "Pizza ADD");
                        break;
                    case 2:
                        System.out.println("how many quantity of ?");
                        int qunty2 = sc.nextInt();
                        totalBill = 120 * qunty2;
                        System.out.println(qunty2 + "Pizza ADD");
                        break;
                    case 3:
                        System.out.println("how many quantity of ?");
                        int qunty3 = sc.nextInt();
                        totalBill = 180 * qunty3;
                        System.out.println(qunty3 + "Pizza ADD");
                        break;
                    case 4:
                        System.out.println("how many quantity of ?");
                        int qunty4 = sc.nextInt();
                        totalBill = 100 * qunty4;
                        System.out.println(qunty4 + "Pizza ADD");
                        break;
                    case 5:

                        if (totalBill < 500) {
                            totalBill += 40;
                            System.out.println("Delivery added now  total bill is " + totalBill);
                        } else {
                            System.out.println("your bill is more than 500  so delivery is free");
                        }
                        System.out.println(" total bill is :- " + totalBill + "and After Gst Added");
                        totalBill = totalBill + (totalBill * 0.18);
                        System.out.println("Total Bill is " + totalBill);
                        System.out.println("select paymenet method");
                        System.out.println("1. Credit Card");
                        System.out.println("2. UPI");
                        System.out.println("3. Debit Card");
                        System.out.println("4. Cash on Delivery");
                        int pymentchoice = sc.nextInt();
                        sc.nextLine();
                        Payment payment;

                        if (pymentchoice == 1) {
                            System.out.println("Enter card number");
                            String card = sc.nextLine();
                            System.out.println("Enter CVV");
                            String cvv = sc.nextLine();
                            payment = new CreditCardPay(totalBill, card, cvv);
                        } else if (pymentchoice == 2) {
                            System.out.println("Enter UPI ID");
                            String upi = sc.nextLine();
                            System.out.println("Enter UPI PIN");
                            String upiPin = sc.nextLine();
                            payment = new UpiPay(totalBill, upi, upiPin);
                        } else if (pymentchoice == 3) {
                            System.out.println("Enter card number");
                            String card = sc.nextLine();
                            System.out.println("Enter PIN");
                            String pin = sc.nextLine();
                            payment = new DebitcardPay(totalBill, card, pin);
                        } else if (pymentchoice == 4) {
                            payment = new CashOnDelivery(totalBill);
                        } else {
                            System.out.println("Invalid Payment Option ");
                            break;
                        }
                        payment.makePayment();
                        break;
                    case 6:
                        System.out.println("Thank you for Visting");
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            } while (choice != 6);
        } else {
            System.out.println("Invalid Username Or Password");
        }
        sc.close();
    }

}

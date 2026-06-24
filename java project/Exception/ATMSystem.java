package Exception;

import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BankAccount account=new BankAccount("madhura", 10000,1234);

        while(true){
            System.out.println("\n=====ATM MEANU=====");
            System.out.println("1. Check Balance");
            System.out.println("2.Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. EXIT");
           
            System.out.println("Enter Choice");
            int choice=sc.nextInt();
            
            try{

                switch(choice){
                    case 1:
                        System.out.println("Enter PIN");
                        int pin1=sc.nextInt();
                        account.checkBalance(pin1);
                        break;
                    
                    case 2:
                        System.out.println("Enter amount");
                        double deposit=sc.nextDouble();            
                        account.deposit(deposit);
                        break;
                    
                    case 3:
                        System.out.println("Enter amount");
                        double withdraw=sc.nextDouble();
                        System.out.println(" Enter PIN");
                        int pin2=sc.nextInt();
                        account.withdraw(withdraw, pin2);
                        break;
                    
                    case 4:
                        System.out.println(" THank YOU !");
                        System.exit(0);

                    default:
                        System.out.println("Invalid Choice");
                    }
            } catch (InvalidPIN  e){
                System.out.println(" Error:" +e.getMessage());
            } catch(InsufficientBalance e){
                System.out.println("Error: "+e.getMessage());
            }
        }
        
    }
}
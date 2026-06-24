package Exception;

public class BankAccount {
    private String accountHolder;
    private double balance;
    private int pin;
     
    public BankAccount(String accountHolder, double balance, int pin) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.pin = pin;
    }
    public void checkBalance(int enterdPin)
        throws InvalidPIN{
            if(enterdPin!=pin){
                throw new InvalidPIN("wrong pin enterd");
            }
            System.out.println("current balance :$"+balance);
        }
    public void deposit(double amount){
        balance+=amount;
        System.out.println("$" + amount+"deposited succesfully");
    }
    public void withdraw(double amount,int enterdPin) throws InvalidPIN, InsufficientBalance{
        if(enterdPin!=pin){
            throw new InvalidPIN("wrong pin enterd");
        }
        if(amount>balance){
            throw new InsufficientBalance("insufficient balance");
        }
        balance-=amount;
        System.out.println("$"+amount+"withdrawn successfully");
    }
}


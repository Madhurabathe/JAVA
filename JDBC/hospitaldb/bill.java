package hospitaldb;

public class bill {
    private int bill_id  ;
    private int pid;
    private int amount ;
    private String payment_mode ;
    private String payemnt_date ;

    public bill(int bill_id,int pid,int amount,String payment_mode,String payemnt_date){
        this.bill_id=bill_id;
        this.pid=pid;
        this.amount=amount;
        this.payment_mode=payment_mode;
        this.payemnt_date=payemnt_date;
    }
    public int getid(){
        return bill_id;
    }
    public int getpid(){
        return pid;
    }
    public int getamount(){
        return amount;
    }
    public String getmode(){
        return payment_mode;
    }
    public String getdate(){
        return payemnt_date;
    }
}

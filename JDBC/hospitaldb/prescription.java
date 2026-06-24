package hospitaldb;

public class prescription {
    private int pre_id; 
    private int quantity;
    private int appoint_id;
    private int med_id;
    
    public prescription(int pre_id,int appoint_id,int med_id,int quantity){
        this.pre_id=pre_id;
        this.quantity=quantity;
        this.appoint_id=appoint_id;
        this.med_id=med_id;

    }
    public int getid(){
        return pre_id;
    }
    public int getquantity(){
        return quantity;
    }
    public int getapid(){
        return appoint_id;
    }
    public int getmid(){
        return med_id;
    }
}

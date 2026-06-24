package hospitaldb;

public class medicine {
     private int med_id;
     private String med_name;  
     private int med_price;
     private String expiry_date;
     private String meds_avail;

     public medicine(int med_id,String med_name,int med_price,String expiry_date,String meds_avail){
        this.med_id=med_id;
        this.med_name=med_name;
        this.med_price=med_price;
        this.expiry_date=expiry_date;
        this.meds_avail=meds_avail;
     }
     public int getid(){
         return this.med_id;
     }
     public String getname(){
        return med_name;
     }
     public int getprice(){
        return med_price;
     }
     public String getexpiry(){
        return expiry_date;
     }
     public String getavail(){
        return meds_avail;
     }
}

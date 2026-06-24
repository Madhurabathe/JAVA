package hospitaldb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class billdao {
    
    public void addbill(bill b){
            try{
                Connection con=DBConnection.getConnection();
                String Q="insert into bill values(?,?,?,?,?)";
                PreparedStatement ps=con.prepareStatement(Q);
                ps.setInt(1,b.getid()) ;
                ps.setInt(2, b.getpid());
                ps.setInt(3, b.getamount());
                ps.setString(4,b.getmode());
                ps.setString(5,b.getdate());
               

                int row=ps.executeUpdate();
                System.out.println(row +"Bill Added");
            }
            catch(Exception e){
                System.out.println(e);
            }
    } 
    public void viewbill(){
        try{
            Connection con=DBConnection.getConnection();
            String Q="select * from bill";
            PreparedStatement ps=con.prepareStatement(Q);
            ResultSet rs=ps.executeQuery(Q);
            while(rs.next()){
             System.out.println("Bill ID: " + rs.getInt("bill_id"));
            System.out.println("Patient ID: " + rs.getInt("pid"));
            System.out.println("Amount: " + rs.getInt("amount"));
            System.out.println("Payment Mode: " + rs.getString("payment_mode"));
            System.out.println("Payment Date: " + rs.getString("payemnt_date"));
            }
            }catch(Exception e){
                System.out.println(e);
        }
    }
    public void searchbill(int bill_id){
        try{
            Connection con=DBConnection.getConnection();
            String Q="select * from bill where bill_id=?";
            PreparedStatement ps=con.prepareStatement(Q);
            ps.setInt(1,bill_id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
            System.out.println("Bill ID: " + rs.getInt("bill_id"));
            System.out.println("Patient ID: " + rs.getInt("pid"));
            System.out.println("Amount: " + rs.getInt("amount"));
            System.out.println("Payment Mode: " + rs.getString("payment_mode"));
            System.out.println("Payment Date: " + rs.getString("payemnt_date"));
            }
            else{
                System.out.println("Data not Found");
            }
            }catch(Exception e){
                System.out.println(e);
    }}
    public void deletebill(int bill_id){
         try{
            Connection con=DBConnection.getConnection();
            String Q="delete from bill where bill_id=?";
            PreparedStatement ps=con.prepareStatement(Q);
            ps.setInt(1, bill_id);
            int row =ps.executeUpdate();
            System.out.println(row +" Bill Deleted successfully");

            }catch(Exception e){
                System.out.println(e);
            }
    }
    public void highestBill() {
    try {
        Connection con = DBConnection.getConnection();

        String Q = "SELECT * FROM bill WHERE amount = (SELECT MAX(amount) FROM bill)";

        PreparedStatement ps = con.prepareStatement(Q);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            System.out.println("Bill ID: " + rs.getInt("bill_id"));
            System.out.println("Patient ID: " + rs.getInt("pid"));
            System.out.println("Amount: " + rs.getInt("amount"));
            System.out.println("Payment Mode: " + rs.getString("payment_mode"));
            System.out.println("Payment Date: " + rs.getString("payemnt_date"));
        }

    } catch (Exception e) {
        System.out.println(e);
    }
}
}
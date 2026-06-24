package hospitaldb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class medicinedao {
    public void addmed(medicine m){
            try{
                Connection con=DBConnection.getConnection();
                String Q="insert into medicine values(?,?,?,?,?)";
                PreparedStatement ps=con.prepareStatement(Q);
                ps.setInt(1,m.getid()) ;
                ps.setString(2, m.getname());
                ps.setInt(3, m.getprice());
                ps.setString(4,m.getexpiry());
                ps.setString(5,m.getavail());
               

                int row=ps.executeUpdate();
                System.out.println(row +"Medicine Added");
            }
            catch(Exception e){
                System.out.println(e);
            }
    } 
    public void viewmed(){
        try{
            Connection con=DBConnection.getConnection();
            String Q="select * from medicine";
            PreparedStatement ps=con.prepareStatement(Q);
            ResultSet rs=ps.executeQuery(Q);
            while(rs.next()){
            System.out.println(rs.getInt("med_id")
            +rs.getString("med_name")
            +rs.getInt("med_price")
            +rs.getString("expiry_date")
            +rs.getString("meds_avail"));
            }
            }catch(Exception e){
                System.out.println(e);
        }
    }
    public void searchmed(int med_id){
        try{
            Connection con=DBConnection.getConnection();
            String Q="select * from mmedicine where med_id=?";
            PreparedStatement ps=con.prepareStatement(Q);
            ps.setInt(1,med_id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
            System.out.println(rs.getInt("med_id")
            +rs.getString("med_name")
            +rs.getInt("med_price")
            +rs.getString("expiry_date")
            +rs.getString("meds_avail"));
            }
            else{
                System.out.println("Data not Found");
            }
            }catch(Exception e){
                System.out.println(e);
    }}
    public void deletemed(int med_id){
         try{
            Connection con=DBConnection.getConnection();
            String Q="delete from medicine where med_id=?";
            PreparedStatement ps=con.prepareStatement(Q);
            ps.setInt(1, med_id);
            int row =ps.executeUpdate();
            System.out.println(row +" Medicine Deleted successfully");

            }catch(Exception e){
                System.out.println(e);
            }
    }
}

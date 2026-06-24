package hospitaldb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;      
public class prescriptiondao {

    public void addpresc(prescription pre){
            try{
                Connection con=DBConnection.getConnection();
                String Q="insert into prescription(pre_id,appoint_id,med_id,quantity) values(?,?,?,?)";
                PreparedStatement ps=con.prepareStatement(Q);
                ps.setInt(1,pre.getid()) ;
                ps.setInt(2, pre.getapid());
                ps.setInt(3, pre.getmid());
                ps.setInt(4,pre.getquantity());
               

                int row=ps.executeUpdate();
                System.out.println(row +"Prescription Added");
            }
            catch(Exception e){
                System.out.println(e);
            }
    } 
    public void viewpresc(){
        try{
            Connection con=DBConnection.getConnection();
            String Q="select * from prescription";
            PreparedStatement ps=con.prepareStatement(Q);
            ResultSet rs=ps.executeQuery(Q);
            while(rs.next()){
            System.out.println(rs.getInt("pre_id")
            +rs.getInt("appoint_id")
            +rs.getInt("med_id")
            +rs.getInt("quantity"));
            }
            }catch(Exception e){
                System.out.println(e);
        }
    }
    public void searchpresc(int pre_id){
        try{
            Connection con=DBConnection.getConnection();
            String Q="select * from prescription where pre_id=?";
            PreparedStatement ps=con.prepareStatement(Q);
            ps.setInt(1,pre_id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
            System.out.println(rs.getInt("pre_id")
            +rs.getInt("appoint_id")
            +rs.getInt("med_id")
            +rs.getInt("quantity"));
            }
            else{
                System.out.println("Data not Found");
            }
            }catch(Exception e){
                System.out.println(e);
    }}
    public void deletepresc(int pre_id){
         try{
            Connection con=DBConnection.getConnection();
            String Q="delete from prescription where pre_id=?";
            PreparedStatement ps=con.prepareStatement(Q);
            ps.setInt(1, pre_id);
            int row =ps.executeUpdate();
            System.out.println(row +" Prescription Deleted successfully");

            }catch(Exception e){
                System.out.println(e);
            }
    }
}

package hospitaldb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;      
public class appointdao {

    public void addappoint(appointment a){
            try{
                Connection con=DBConnection.getConnection();
                String Q="insert into appointment values(?,?,?,?,?)";
                PreparedStatement ps=con.prepareStatement(Q);
                ps.setInt(1,a.getid()) ;
                ps.setInt(2, a.getpid());
                ps.setInt(3,a.getdid());
                ps.setString(4,a.getdate());
                ps.setInt(5, a.getfees());
               
                int row=ps.executeUpdate();
                System.out.println(row +"Appointment Added");
            }
            catch(Exception e){
                System.out.println(e);
            }
    } 
    public void viewappoint(){
        try{
            Connection con=DBConnection.getConnection();
            String Q="select * from appointment";
            PreparedStatement ps=con.prepareStatement(Q);
            ResultSet rs=ps.executeQuery(Q);
            while(rs.next()){
            System.out.println(rs.getInt("appoint_id")
            +rs.getInt("pid")
            +rs.getInt("did")
            +rs.getString("appoint_date")
            +rs.getInt("consultaion_fee"));
            }
            }catch(Exception e){
                System.out.println(e);
        }
    }
    public void searchappoint(int appoint_id){
        try{
            Connection con=DBConnection.getConnection();
            String Q="select * from appointment where appoint_id=?";
            PreparedStatement ps=con.prepareStatement(Q);
            ps.setInt(1,appoint_id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
            System.out.println(rs.getInt("appoint_id")
            +rs.getInt("pid")
            +rs.getInt("did")
            +rs.getString("appoint_date")
            +rs.getInt("consultaion_fee"));
            }
            else{
                System.out.println("Data not Found");
            }
            }catch(Exception e){
                System.out.println(e);
    }}
    public void deleteappoint(int appoint_id){
         try{
            Connection con=DBConnection.getConnection();
            String Q="delete from appointment where appoint_id=?";
            PreparedStatement ps=con.prepareStatement(Q);
            ps.setInt(1, appoint_id);
            int row =ps.executeUpdate();
            System.out.println(row +" Appointment Deleted successfully");

            }catch(Exception e){
                System.out.println(e);
            }
    }
}

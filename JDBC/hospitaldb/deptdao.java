package hospitaldb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet; 
public class deptdao {
    
    public void adddept(dept d){
            try{
                Connection con=DBConnection.getConnection();
                String Q="insert into dept(dept_id,dept_name) values(?,?)";
                PreparedStatement ps=con.prepareStatement(Q);
                ps.setInt(1,d.getid()) ;
                ps.setString(2, d.getname());

                int row=ps.executeUpdate();
                System.out.println(row +"Department Added");
            }
            catch(Exception e){
                System.out.println(e);
            }
    } 
    public void viewdept(){
        try{
            Connection con=DBConnection.getConnection();
            String Q="select * from dept";
            PreparedStatement ps=con.prepareStatement(Q);
            ResultSet rs=ps.executeQuery(Q);
            while(rs.next()){
            System.out.println(rs.getInt("dept_id")
            +rs.getString("dept_name"));
            }
            }catch(Exception e){
                System.out.println(e);
        }
    }
    public void deletedept(int dept_id){
         try{
            Connection con=DBConnection.getConnection();
            String Q="delete from dept where dept_id=?";
            PreparedStatement ps=con.prepareStatement(Q);
            ps.setInt(1, dept_id);
            int row =ps.executeUpdate();
            System.out.println(row +" Depaartment Deleted successfully");

            }catch(Exception e){
                System.out.println(e);
            }
    }
}
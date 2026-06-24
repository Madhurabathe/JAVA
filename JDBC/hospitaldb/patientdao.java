package hospitaldb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;      

public class patientdao {
    
    public void addpatient(patient p){
            try{
                Connection con=DBConnection.getConnection();
                String Q="insert into patient(pid,pname,page,gender,city,contact) values(?,?,?,?,?,?)";
                PreparedStatement ps=con.prepareStatement(Q);
                ps.setInt(1,p.getid()) ;
                ps.setString(2, p.getname());
                ps.setInt(3, p.getage());
                ps.setString(4,p.getgender());
                ps.setString(5,p.getcity());
                ps.setInt(6,p.getcontact());

                int row=ps.executeUpdate();
                System.out.println(row +"Patient Updated");
            }
            catch(Exception e){
                System.out.println(e);
            }
    } 
    public void viewpatient(){
        try{
            Connection con=DBConnection.getConnection();
            String Q="select * from patient";
            PreparedStatement ps=con.prepareStatement(Q);
            ResultSet rs=ps.executeQuery(Q);
            while(rs.next()){
            System.out.println(rs.getInt("pid")
            +rs.getString("pname")
            +rs.getInt("page")
            +rs.getString("gender")+
            rs.getString("city")+
            rs.getInt("contact"));
            }
            }catch(Exception e){
                System.out.println(e);
        }
    }
    public void searchpatient(int pid){
        try{
            Connection con=DBConnection.getConnection();
            String Q="select * from patient where pid=?";
            PreparedStatement ps=con.prepareStatement(Q);
            ps.setInt(1,pid);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
            System.out.println(rs.getInt("pid")
            +rs.getString("pname")
            +rs.getInt("page")
            +rs.getString("gender")+
            rs.getString("city")+
            rs.getInt("contact"));
            }
            else{
                System.out.println("Data not Found");
            }
            }catch(Exception e){
                System.out.println(e);
    }}
    public void updatepatient(int pid,String pname,int page,String gender,String city,int contact){
        try{
            Connection con=DBConnection.getConnection();
            String Q="update patient set pname=?,page=?,gender=?,city=?,contact=? where pid=?";
            PreparedStatement ps=con.prepareStatement(Q);
            ps.setString(1,pname);
            ps.setInt(2,page);
            ps.setString(3, gender);
            ps.setString(4, city);
            ps.setInt(5, contact);
            ps.setInt(4,pid);
            int row=ps.executeUpdate();
            System.out.println(row +"Patient Updated");
            }catch(Exception e){
                System.out.println(e);
            }
    }
    public void deletepatinet(int pid){
         try{
            Connection con=DBConnection.getConnection();
            String Q="delete from patient where pid=?";
            PreparedStatement ps=con.prepareStatement(Q);
            ps.setInt(1, pid);
            int row =ps.executeUpdate();
            System.out.println(row +" Patinet Deleted successfully");

            }catch(Exception e){
                System.out.println(e);
            }
    }
    
}

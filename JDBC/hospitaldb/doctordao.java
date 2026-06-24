package hospitaldb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class doctordao {
    public void adddoctor(doctor d){
            try{
                Connection con=DBConnection.getConnection();
                String Q="insert into doctor(did,dname,experience,specialization,salary,deptid) values(?,?,?,?,?,?)";
                PreparedStatement ps=con.prepareStatement(Q);
                ps.setInt(1,d.getid()) ;
                ps.setString(2, d.getname());
                ps.setInt(3, d.getexp());
                ps.setString(4,d.getspec());
                ps.setInt(5,d.getsalary());
                ps.setInt(6,d.getdid());

                int row=ps.executeUpdate();
                System.out.println(row +"Doctor Updated");
            }
            catch(Exception e){
                System.out.println(e);
            }
    } 
    public void viewdoctor(){
        try{
            Connection con=DBConnection.getConnection();
            String Q="select * from doctor";
            PreparedStatement ps=con.prepareStatement(Q);
            ResultSet rs=ps.executeQuery(Q);
            while(rs.next()){
            System.out.println(rs.getInt("did")
            +rs.getString("dname")
            +rs.getInt("experience")
            +rs.getString("specialization")+
            rs.getString("salary")+
            rs.getInt("deptid"));
            }
            }catch(Exception e){
                System.out.println(e);
        }
    }
    public void searchdoctor(int did){
        try{
            Connection con=DBConnection.getConnection();
            String Q="select * from doctor where did=?";
            PreparedStatement ps=con.prepareStatement(Q);
            ps.setInt(1,did);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
            System.out.println(rs.getInt("did")
            +rs.getString("dname")
            +rs.getInt("experience")
            +rs.getString("specialization")+
            rs.getString("salary")+
            rs.getInt("deptid"));
            }
            else{
                System.out.println("Data not Found");
            }
            }catch(Exception e){
                System.out.println(e);
    }}
    public void updatedoctor(int did,String dname,int experience,String specialization,String salary,int deptid){
        try{
            Connection con=DBConnection.getConnection();
            String Q="update patient set dname=?,experience=?,specialization=?,salary=?,deptid=? where did=?";
            PreparedStatement ps=con.prepareStatement(Q);
            ps.setString(1,dname);
            ps.setInt(2,experience);
            ps.setString(3, specialization);
            ps.setString(4, salary);
            ps.setInt(5, deptid);
            ps.setInt(4,did);
            int row=ps.executeUpdate();
            System.out.println(row +"Doctor Updated");
            }catch(Exception e){
                System.out.println(e);
            }
    }
    public void deletedoctor(int did){
         try{
            Connection con=DBConnection.getConnection();
            String Q="delete from doctor where did=?";
            PreparedStatement ps=con.prepareStatement(Q);
            ps.setInt(1, did);
            int row =ps.executeUpdate();
            System.out.println(row +" Doctor Deleted successfully");

            }catch(Exception e){
                System.out.println(e);
            }
    }
    
}

package studentdb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class studentdao {
    public boolean login(String username,String password){
        boolean status=false;
        try{
            Connection con=DBConnection.getConnection();
            String sql="select * from admin where username=? and password=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,username);
            ps.setString(2, password);
            ResultSet result=ps.executeQuery();
            if(result.next()){
                status=true;
            }  
        }
        catch(Exception e){
            System.out.println(e);
        }return status;
    }
        public void addstudent(student s){
            try{
                Connection con=DBConnection.getConnection();
                String Q="insert into student(id,name,course,marks) values(?,?,?,?)";
                PreparedStatement ps=con.prepareStatement(Q);
                ps.setInt(1,s.getid()) ;
                ps.setString(2, s.getname());
                ps.setString(3, s.getcourse());
                ps.setInt(4,s.getmarks());

                int row=ps.executeUpdate();
                System.out.println(row +"Student Updated");
            }
            catch(Exception e){
                System.out.println(e);
            }
    } 
    public void displaystudent(){
        try{
            Connection con=DBConnection.getConnection();
            String Q="select * from student";
            PreparedStatement ps=con.prepareStatement(Q);
            ResultSet rs=ps.executeQuery(Q);
            while(rs.next()){
            System.out.println(rs.getInt("id")
            +rs.getString("name")
            +rs.getString("course")
            +rs.getInt("marks"));
            }
            }catch(Exception e){
                System.out.println(e);
        }
    }
    public void searchstudent(int id){
        try{
            Connection con=DBConnection.getConnection();
            String Q="select * from student where id=?";
            PreparedStatement ps=con.prepareStatement(Q);
            ps.setInt(1,id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                System.out.println(rs.getInt("id")
            +rs.getString("name")
            +rs.getString("course")
            +rs.getInt("marks"));
            }
            else{
                System.out.println("Data not Found");
            }
            }catch(Exception e){
                System.out.println(e);
    }}
    public void updatestudent(int id,String name,String course,int marks){
        try{
            Connection con=DBConnection.getConnection();
            String Q="update student set name=?,course=?,marks=? where id=?";
            PreparedStatement ps=con.prepareStatement(Q);
            ps.setString(1,name);
            ps.setString(2,course);
            ps.setInt(3, marks);
            ps.setInt(4, id);
            int row=ps.executeUpdate();
            System.out.println(row +"Student Updated");
            }catch(Exception e){
                System.out.println(e);
            }
    }
    public void deletestudent(int id){
         try{
            Connection con=DBConnection.getConnection();
            String Q="delete from student where id=?";
            PreparedStatement ps=con.prepareStatement(Q);
            ps.setInt(1, id);
            int row =ps.executeUpdate();
            System.out.println(row +" Student Deleted successfully");

            }catch(Exception e){
                System.out.println(e);
            }
    }
    
}

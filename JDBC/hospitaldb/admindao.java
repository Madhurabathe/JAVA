package hospitaldb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class admindao {
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
}

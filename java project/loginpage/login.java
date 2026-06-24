
package loginpage;

import java.util.Scanner;
 
public class login {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter username");
        String Username=sc.nextLine();
        System.out.println("enter password");
        String pass= sc.nextLine();
        
        if(Username.equals("sam@123")){
            if(pass.equals("1234")){
                System.out.println("successful login");
            }else{
                try{
                    invaldpass obj1=new invaldpass();
                    throw obj1;
                }catch(invaldpass e){
                    System.out.println(e.getMessage());
                    System.out.println("invalid password");
                    e.msg();
                }
            }
        }
sc.close();
    }
}

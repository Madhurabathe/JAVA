package loginpage;
public class invaldpass extends RuntimeException{

    public void msg()
    {
        System.out.println("invalid pass");
    }
    public String getMessage()
    {
        return "not supported;";
    }
}
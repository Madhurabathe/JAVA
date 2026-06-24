package hospitaldb;
public class dept{
    private int dept_id;
    private String dept_name;

    public dept(int dept_id, String dept_name){
        this.dept_id=dept_id;
        this.dept_name=dept_name;
    }
    public int getid(){
        return dept_id;
    }
    public String getname(){
        return dept_name;
    }
}
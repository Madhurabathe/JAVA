    package hospitaldb;

    public class doctor {
    private int did;
    private String dname;
    private int experience;
    private String specialization;
    private int salary;
    private int dept_id;

    public doctor(int did,String dname,int experience,String specialization,int salary,int dept_id){
        this.did=did;
        this.dname=dname;
        this.experience=experience;
        this.specialization=specialization;
        this.salary=salary;
        this.dept_id=dept_id;
    }
    public int getid(){
        return did;
    }
    public String getname(){
        return dname;
    }
    public int getexp(){
        return experience;
    }
    public String getspec(){
        return specialization;
    }
    public int getsalary(){
        return salary;
    }
    public int getdid(){
        return dept_id;
    }
}

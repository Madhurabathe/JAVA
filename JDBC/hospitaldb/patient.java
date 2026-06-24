package hospitaldb;

public class patient {
    private int pid;
    private String pname;
    private int page;
    private  String gender;
    private String city;
    private int contact;

    public patient(int pid,String pname,int page,String gender,String city,int contact){
        this.pid=pid;
        this.pname=pname;
        this.page=page;
        this.gender=gender;
        this.city=city;
        this.contact=contact;
    }
    public int getid(){
        return pid;
    }
    public String getname(){
        return pname;
    }
    public int getage(){
        return page;
    }
    public String getgender(){
        return gender;
    }
    public String getcity(){
        return city;
    }
    public int getcontact(){
        return contact;
    }
}

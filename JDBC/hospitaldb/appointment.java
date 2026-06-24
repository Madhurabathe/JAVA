package hospitaldb;

public class appointment {
    private int  appoint_id;
    private int pid;
    private int did;
    private String appoint_date;
    private int consultaion_fee ;

    public appointment(int  appoint_id,int pid,int did,String appoint_date,int consultaion_fee){
        this.appoint_id=appoint_id;
        this.pid=pid;
        this.did=did;
        this.appoint_date=appoint_date;
        this.consultaion_fee=consultaion_fee;
    }
    public int getid(){
        return appoint_id;
    }
    public int getpid(){
        return pid;
    }
    public int getdid(){
        return did;
    }
    public String getdate(){
        return appoint_date;
    }
    public int getfees(){
        return consultaion_fee;
    }
}

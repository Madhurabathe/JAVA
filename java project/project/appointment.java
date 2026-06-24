package project;

public class appointment {
    private int pateintid;
    private int doctorid;
    public appointment(int patientid,int doctorid){
        this.pateintid=patientid;
        this.doctorid=doctorid;
    }
    @Override
    public String toString(){
        return "Appoinment{"+
            "patientid="+pateintid+
            ",doctorid="+doctorid+
                '}';
    }
}

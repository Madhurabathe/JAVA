package studentdb;

public class student {
    private int id;
    private String name;
    private String course;
    private int marks;

    public student(int id,String name,String course,int marks){
        this.id=id;
        this.name=name;
        this.course=course;
        this.marks=marks;
    }
    public int getid(){
        return this.id;
    }
    public String getname(){
        return this.name;
    }
    public String getcourse(){
        return this.course;
    }
    public int getmarks(){
        return this.marks;
    }
}

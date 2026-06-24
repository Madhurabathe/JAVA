// create a student class and set the values in contructor

package ERP;

public class Student {
    private int Id;
    private String name;
    private double mark;

    public Student(int Id, String name, double mark){
        this.Id=Id;
        this.name=name;
        this.mark=mark;
    }
    public int getId(){
        return Id;
    }
    public String getName(){
        return name;
    }
    public double getMark(){
        return mark;
    }
    public void setName (String name){
        this.name=name;
    }
    public void setMark(Double mark)
    {
        this.mark=mark;
    }
    public String toString(){
        return "Id"+Id+"name"+name+"mark"+mark;
    }
}

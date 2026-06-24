package employee;

public class employe {
   private int id;
   private String name;  
   private double salary;  
    public employe(int id, String name, double salary){
         this.id=id;
         this.name=name;
         this.salary=salary;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public String toString(){
        return "id"+id+"name"+name+"salary"+salary;
    }
}

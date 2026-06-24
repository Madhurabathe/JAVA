package comparable;

public class Student implements Comparable<Student>{
     private int id;
     private String name;
     private double marks;

    public Student(int id,String name,double marks)
{
    this.id=id;
    this.name=name;
    this.marks=marks;
}
public int getid(){
    return id;
}
public String getname(){
    return name;
}
public double getmarks(){
    return marks;
}
@Override
public int compareTo(Student s){
    return this.id - s.id;
}
@Override
public String toString(){
    return "ID="+id+"  name="+name+"  marks="+marks;
}
}

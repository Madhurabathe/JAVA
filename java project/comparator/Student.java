package comparator;

import java.util.Comparator;

public class Student implements Comparator<Student>{
     private int id;
     private String name;
     private double marks;

    public Student(int id,String name,double marks)
{
    this.id=id;
    this.name=name;
    this.marks=marks;
}
public Student(){}

public int getid(){
    return id;
}
public String getname(){
    return name;
}
public double getmarks(){
    return marks;
}
// @Override
// public int compare(Student s1,Student s2){
//     return s1.name.compareTo(s2.name);
// }
@Override
public int compare(Student s1,Student s2){
    return Double.compare(s1.marks, s2.marks); //for marks cannot use compareto its only for string 
}

@Override
public String toString(){
    return "ID="+id+"  name="+name+"  marks="+marks;
}
}


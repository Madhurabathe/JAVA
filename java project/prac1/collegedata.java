package prac1;

public class collegedata {
    int age;
    String name;
    collegedata(int age , String name){
        this.age=age;
        this.name=name;
        System.out.println(age+""+name);

    } public String toString(){
        return "id"+age+"name"+name;
}}

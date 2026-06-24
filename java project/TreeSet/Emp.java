package TreeSet;

public class Emp implements Comparable<Emp> {
    int age;
    String name;

    Emp(int age, String name){
        this.age=age;
        this.name=name;

    }
    public String toString(){
        return age+""+name;
    }
    public int compareTo(Emp s){
        return this.name.compareTo(s.name);
    }
}

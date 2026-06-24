package comparable;
import java.util.ArrayList;
import java.util.Collections;

public class main {
    public static void main(String[] args) {
        ArrayList<Student> s=new ArrayList<>();
        s.add(new Student(102, "madhura",20));
        s.add(new Student(104, "seema",50));
        s.add(new Student(101, "sujal",220));

        Collections.sort(s);
        System.out.println(s);
    }
}


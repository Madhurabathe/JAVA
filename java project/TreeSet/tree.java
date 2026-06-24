package TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class tree {
    public static void main(String[] args) {
        Emp e1 = new Emp(10, "kim");
        Emp e2 = new Emp(10, "kim");
        Emp e3 = new Emp(20, "kim");
        Emp e4 = new Emp(30, "kim");
        Emp e5 = new Emp(40, "kim");
        Emp e6 = new Emp(50, "kim");
        Emp e7 = new Emp(50, "kim");

        TreeSet<Emp> tr = new TreeSet<Emp>();
        tr.add(e1);
        tr.add(e2);
        tr.add(e3);
        tr.add(e4);
        tr.add(e5);
        tr.add(e6);
        tr.add(e7);
        for (Emp i : tr) {
            System.out.println(i);
        }
        System.out.println("========================");

        TreeSet<Emp> tl = new TreeSet<>(new Comparator<Emp>() {
            @Override
            public int compare(Emp a, Emp b) {
                return Integer.compare(a.age, b.age);
            }
        });

        tl.add(e1);
        tl.add(e2);
        tl.add(e3);
        tl.add(e4);
        tl.add(e5);
        tl.add(e6);
        tl.add(e7);

        for (Emp i : tl) {
            System.out.println(i);
        }
    }
}

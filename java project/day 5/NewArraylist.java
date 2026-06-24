import java.util.ArrayList;
public class NewArraylist {
    public static void main(String[] args) {
        ArrayList A1 = new ArrayList();
        A1.add(10);
        A1.add(20);
        A1.add(30);
        A1.add(40);
        A1.add(50);
        A1.add(60);
        A1.add(70);
        A1.add(80);
        A1.add("SAM");
        A1.add(10.5);
        A1.add('@');
        A1.add(null);
        A1.add(80);

        System.out.println(A1.size());
        System.out.println(A1);
        A1.add(110);
        System.out.println(A1.size());
        System.out.println("------------------------------");
        System.out.println(A1.get(5));
        System.out.println("----------------");
        System.out.println(A1.contains("SAM"));
        System.out.println(A1.contains("SAM11"));
        System.out.println("----------------");
        System.out.println(A1.size());
        A1.remove(0);
        System.out.println(A1);
        System.out.println(A1.size());
        System.out.println(A1.isEmpty());
        A1.clear();
        System.out.println(A1);
        System.out.println(A1.isEmpty());
        
        A1.add(10);
        A1.add(20);
        A1.add(30);
        A1.add(40);
        A1.add(50);
        System.out.println(A1);
        System.out.println(A1.indexOf(60));
        System.out.println(A1.lastIndexOf(50));

    }
}

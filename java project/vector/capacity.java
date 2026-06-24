package vector;

import java.util.Iterator;
import java.util.Vector;

public class capacity {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<Integer>(4,2);
        System.out.println("initial capacity: "+v.capacity());
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        System.out.println("size of vector"+v.size());
        System.out.println("capacity of vector"+v.capacity());

        Iterator i=v.iterator();
        while(i.hasNext()){
            Object obj=i.next();
            System.out.println(obj);//sout (i.next()) 
        }
    }
}

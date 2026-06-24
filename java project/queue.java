import java.util.*;
public class queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        pq.add(50);
        pq.add(40);
        pq.add(30);
        pq.add(20);
        System.out.println("priority queue"+pq);
        System.out.println("top priority element"+pq.peek());

        while(!pq.isEmpty()){
            System.out.println("removing"+pq.poll());
        }
    }
}

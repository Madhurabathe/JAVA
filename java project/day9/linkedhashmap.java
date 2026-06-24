package day9;
import java.util.*;

public class linkedhashmap{
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> l1=new LinkedHashMap<>();
        l1.put("sam", 45555555);
        l1.put("tom", 455555555);
        l1.put("kim", 45555525);
        l1.put("nam", 455555554);
        l1.put("tim", 455555551);
        l1.put("mad", 455555557);
        System.out.println(l1);
        System.out.println(l1.containsKey("kim"));
        System.out.println(l1.containsValue(101));

        Set<String> temm=l1.keySet();//for key
        // Collection<Integer> temm=l1.values();//for values
        for(String i:temm){
            System.out.println(i);
        }
        System.out.println(l1);
    }
}
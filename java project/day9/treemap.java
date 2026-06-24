package day9;

import java.util.*;

public class treemap {
    public static void main(String[] args) {
        TreeMap<String,Integer> t1=new TreeMap();
        t1.put("mango",60);
        t1.put("banana",50);
        t1.put("apple",70);
        t1.put("stwab",30);
        System.out.println(t1);
        int last=0;

        Set<String> fruit1=t1.keySet();
        Collection<Integer> fruit2=t1.values();
        for(int i:fruit2){
            System.out.println(i);

        }
        for(int i:fruit2){
            if(last<i){
                last=i;
            }
        }
        for(String i:fruit1){
            if(t1.get(i)==last){
                System.out.println(i+""+t1.get(i));
            }
        }

        
    }
}

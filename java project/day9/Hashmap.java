package day9;

import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<Object, Object> hash = new HashMap<>();
        hash.put(101, "sam");
        hash.put(103, "sam");
        hash.put(102, "sam");
        hash.put(101, "sam");
        hash.put("sam", 101);
        System.out.println(hash);

    }

}

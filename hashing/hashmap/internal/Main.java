package hashing.hashmap.internal;

import java.util.*;
class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Vikash",90);
        map.put("Aman",91);
        map.put("Rishav", 94);
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("Vikash",90);
        lhm.put("Aman",91);
        lhm.put("Rishav", 94);
        System.out.println(map);
        System.out.println(lhm);
        // System.out.println(map.get("Vikash"));
        // // System.out.println(map.remove("Aman")); 
        // System.out.println(map.containsKey("Aman"));
        // System.out.println(map.containsKey("Rishav"));
        // System.out.println(map.get("Aloo"));


        // Set<String> keys = map.keySet();
        // for (String k : keys) {
        //     System.out.println("Key "+k+", "+"value "+map.get(k));
        // }

        
        // map.clear(); //it clears whole map
        // map.isEmpty() // it return ture or false
        //  map.size(); // it retunr size       
    }
}

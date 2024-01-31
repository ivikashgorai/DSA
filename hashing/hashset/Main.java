package hashing.hashset;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        // System.out.println(set.contains(4));
        // System.out.println(set);
        Iterator i = set.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        //
        for(Integer num : set){
            System.out.println(num);
        }
    }
}

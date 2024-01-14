package subset_subsequence_string.subsequences;

import java.util.ArrayList;

public class StringXWithArraylist {
    public static void main(String[] args) {
        String subs = "";
        String up = "Dhanbad";
        ArrayList<String> List = new ArrayList<>();
        System.out.println(subsequenc(subs,up,List)
        );
    }
    static ArrayList<String> subsequenc(String subs,String up,ArrayList<String> List){
        if(up.isEmpty()){
            List.add(subs);
            return List;
        } 
        char ch = up.charAt(0); // humko sirf first step sochna hai baki sab apne aap ho jayega
        // also printing the empty string
        subsequenc(subs+ch,up.substring(1),List);
        return subsequenc(subs,up.substring(1),List); 
       // if it is written up then output will from down to up as it printing now
    }
}

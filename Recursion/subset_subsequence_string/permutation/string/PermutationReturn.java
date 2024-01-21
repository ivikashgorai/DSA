package subset_subsequence_string.permutation.string;

import java.util.*;

public class PermutationReturn {
    public static void main(String[] args) {
        String s = "123";
        String empty = "";
        System.out.println(perm(s, empty));
    }

    static ArrayList<String> perm(String s, String empty) {
        if (s.isEmpty()) {
         ArrayList<String> list = new ArrayList<>();
            list.add(empty);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        char ch = s.charAt(0);
        for (int i = 0; i <= empty.length(); i++) { // this line will run again and again beacuse it is inside for loop // it will not go out till loop is completed
            ans.addAll(perm(s.substring(1), empty.substring(0, i) + ch + empty.substring(i, empty.length())));
        }
        return ans;
    }
}
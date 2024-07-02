import java.util.HashMap;

public class CountOccurrenceOfAnagram {
    public static void main(String[] args) {
        String s1 = "aabaabaa";
        String s2 = "aba";
        int dist = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s2.length(); i++) {
            if (!map.containsKey(s2.charAt(i))) {
                dist += 1; // distinct element
                map.put(s2.charAt(i), 1);
            } else {
                map.put(s2.charAt(i), map.get(s2.charAt(i)) + 1);
            }
        }
        int m = s1.length();
        int k = s2.length();
        int i = 0;
        int j = 0;
        int count = 0;
        while (j < m) {
            while (j - i + 1 <= k) {
                if(map.containsKey(s1.charAt(j))){
                map.put(s1.charAt(j),map.get(s1.charAt(j))-1);
                if(map.get(s1.charAt(j))==0){
                    if(dist!=0){
                        dist-=1;
                    }
                    if(dist==0){
                        count+=1;
                    }
                }
            }
                j += 1;
            }
            if (j >= m) {
                break;
            }
            if(map.containsKey(s1.charAt(i))){
                map.put(s1.charAt(i),map.get(s1.charAt(i))+1);
            }
            i+=1;


        }
        System.out.println(count);
    }
}

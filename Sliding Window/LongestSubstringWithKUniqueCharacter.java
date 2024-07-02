import java.util.*;

public class LongestSubstringWithKUniqueCharacter {
    public static void main(String[] args) {
        String s = "aabacbebebe";
        int i=0;
        int j =0;
        int n = s.length();
        int uni = 3;
        int count = 0;
        int len = Integer.MIN_VALUE;
        HashMap<Character,Integer> set = new HashMap<>();
        for(int l=0;l<n;l++){
            set.put(s.charAt(l),0); // sab charcter ko map mein 0 times hai
        }
        while(j<n){
            while(count<=uni){
                if(set.get(s.charAt(j))==0){
                    set.put(s.charAt(j),1);
                    count+=1;
                }
                else{
                    set.put(s.charAt(j),set.get(s.charAt(j))+1);
                }
                j+=1;
                if(j==n){
                    break;
                }
            }
                len = Math.max(len,j-i); 
            while(count>uni){
                int a = set.get(s.charAt(i));
                set.put(s.charAt(i), set.get(s.charAt(i))-1);
                if(a==1){
                    count-=1;
                }
                i+=1;
            }
        }
        System.out.println(len);
    }
}

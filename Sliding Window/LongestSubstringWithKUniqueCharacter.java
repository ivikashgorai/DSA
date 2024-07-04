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
                int b = set.get(s.charAt(j));
                if(b==0){
                    set.put(s.charAt(j),1);
                    count+=1;
                }
                else{
                    set.put(s.charAt(j),b+1);
                }
                j+=1;
                if(count==uni){
                    len = Math.max(len,j-i);
                }
                
                if(j==n){
                    break;
                }
            }
            while(count>uni){
                int a = set.get(s.charAt(i));
                set.put(s.charAt(i), a-1);
                if(a==1){
                    count-=1;
                }
                i+=1;
            }
            if(count==uni){
                len = Math.max(len,j-i);
            }
        }
        if(len == Integer.MIN_VALUE){
            System.out.println(0);
        }
        else{
        System.out.println(len);
        }
    }
}

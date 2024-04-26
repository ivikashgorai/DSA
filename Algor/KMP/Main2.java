import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(longestPrefixSuffix("bhmaammomashhsacgt")));
    }
    public static int[] longestPrefixSuffix(String s){
        int n = s.length();
        int[] lps = new int[n];
        char ch[] =s.toCharArray();
        int left = 0;
        int right = 1;
        lps[0] = 0;
        while(right<n){
            if(ch[left]==ch[right]){
                lps[right] = left+1;
                right+=1;
                left+=1;
            }
            else{
                if(left==0){
                    lps[right] =0;
                    right+=1;
                }
                else{
                    left = lps[left-1];
                }
            }
        }
        return lps;
    }
}
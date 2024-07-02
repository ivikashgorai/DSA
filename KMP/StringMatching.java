// import java.util.*;

public class StringMatching {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        String s1 = "abcd"; //original
        String s2 = "cdab";
        int first = 0;
        int sec = 0;
        int[] lps = longestPrefixSuffix(s2);
        int n = s1.length();
        int m = s2.length();
        while(first<n && sec<m){
            if(s1.charAt(first)==s2.charAt(sec)){
                first+=1;
                sec+=1;
            }
            else{
                if(sec==0){
                    first+=1;
                }
                else{
                sec = lps[sec-1];
                }
            }
        }
        if(sec==m){
            System.out.println(first-sec);
        }
        else{
            System.out.println(-1);
        }

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

import java.util.*;

// import practice_ques.bit_manipulation.removeLastBit;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s  = "ABCABDABCABCABD";
        int n = s.length();
        int[] lps = new int[n];
        System.out.println(Arrays.toString(kmp(s,lps)));
    }
    static int[] kmp(String s,int[] lps){
        int l  = 0;
        int r  = 1;
        int n = s.length();
        while(r<n){
            if(s.charAt(l)==s.charAt(r)){
                lps[r] = l+1;
                l+=1;
                r+=1;
            }
            else if(l==0){
                r+=1;
            }
            else{
                if(lps[l-1]==0){
                    lps[r] = 0;
                    r+=1;
                    l = 0;
                }
                else{
                    l = lps[l-1];
                }
            }
        }
        return lps;
    }
}

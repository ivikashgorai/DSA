package dynamic_programming.AdityaVerma.LCS.LongestCommonSubsequence;

public class Recursive {
    public static void main(String[] args) {
        String s1 = "abcdef";
        String s2 = "abdpefs";
        System.out.println(LongestCommonSubs(s1, s2,s1.length(),s2.length()));

    }
    static int LongestCommonSubs(String s1,String s2,int m,int n){
        if(m==0 || n==0){
            return 0;
        }
        if(s1.charAt(m-1)==s2.charAt(n-1)){
              return 1+ LongestCommonSubs(s1, s2, m-1, n-1);
             
        }
        else{
         return LongestCommonSubs(s1, s2, m-1, n-1);

                }

    }
}

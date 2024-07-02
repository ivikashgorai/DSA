package dynamic_programming.AdityaVerma.LCS.LongestCommonSubstring;

public class PrintTabulation {
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "labfgcnde";
        int m = s1.length();
        int n = s2.length();
       String ans = LongestCommonSubstringTab(s1, s2, m, n);
       System.out.println(ans);
    }
    static String LongestCommonSubstringTab(String s1,String s2,int m,int n){
        String[][] dp = new String[m+1][n+1];
        for(int i=0;i<m+1;i++){
            dp[i][0] = "";
        }
        for(int j=0;j<n+1;j++){
            dp[0][j] = "";
        }
        String max  = "";
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
        if(s1.charAt(i-1)==s2.charAt(j-1)){
               dp[i][j] =  dp[i-1][j-1] + s1.charAt(i-1);
                if(max.length()<dp[i][j].length()){
                    max = dp[i][j];
                }
                
            //    max = Math.max(max, dp[i][j]); 
             
        }
        else{ // jaisi match nhi karta reset the length to 0
  
          dp[i][j] = "";

                }
            }
        }
        return max;

    }
}

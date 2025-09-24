import java.util.*;

public class Tab {
    public static void main(String[] args) {
        String word1 = "vbcca";
        String word2 = "abc";
        
    }
    static String lcsString(String s1, String s2) {
    int x = s1.length(), y = s2.length();
    int[][] dp = new int[x + 1][y + 1];

    // Fill DP table
    for (int i = 1; i <= x; i++) {
        for (int j = 1; j <= y; j++) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1))
                dp[i][j] = 1 + dp[i - 1][j - 1];
            else
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
        }
    }

    // Reconstruct LCS
    StringBuilder lcs = new StringBuilder();
    int i = x, j = y;
    while (i > 0 && j > 0) {
        if(s1.charAt(i-1)==s2.charAt(j-1)){
            lcs.append(s1.charAt(i-1));
            i-=1;
            j-=1;
        }
        else if(dp[i-1][j]>dp[i][j-1]){
            i-=1;
        }
        else{
            j-=1;
        }
    }

    return lcs.reverse().toString();
}
}

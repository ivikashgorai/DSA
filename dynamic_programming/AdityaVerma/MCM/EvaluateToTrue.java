package dynamic_programming.AdityaVerma.MCM;

public class EvaluateToTrue {
    static int[][][] dp;
    public static void main(String[] args) {
        
        String s = "T^F&T";
        char[] arr = s.toCharArray();
        dp = new int[s.length()+1][s.length()+1][2];
        System.out.println(Evaluate(arr, 0, arr.length-1, true));
    }

    static int Evaluate(char[] arr, int i, int j, boolean isTrue) {
        if (i > j) {
            return 0;
        }
        if (i == j) {
            if (isTrue == true) {
                if(arr[i] == 'T'){
                    return 1;
                }
            }
            else{
                if(arr[i]=='F'){
                    return 1;
                }
            }
            return 0;
        }
        if(isTrue){ // memoize
        if(dp[i][j][1]!=0){
            return dp[i][j][1];
        }
        }
        else {
            if(dp[i][j][0]!=0){
                return dp[i][j][0];
            }
        } //
        int ans  = Integer.MIN_VALUE;
        int temp = 0;
        for (int k = i + 1; k <= j - 1; k += 2) {
            int lefttrue = Evaluate(arr, i, k-1, true);
            int leftFalse = Evaluate(arr, i, k-1, false);
            int rightTrue = Evaluate(arr, k+1, j, true);
            int rightFalse =  Evaluate(arr, k+1, j, false);

            if(arr[k]=='&'){
                if(isTrue==true){
                    temp+= lefttrue*rightTrue;
                }
                else if(isTrue == false){
                    temp+= lefttrue*rightFalse + leftFalse*rightTrue +leftFalse*rightFalse;
                }
            }
            else if(arr[k]=='^'){
                if(isTrue == true){
                    temp+= leftFalse*rightTrue +lefttrue*rightFalse;
                }
                else if(!isTrue){
                    temp+= leftFalse*rightFalse + lefttrue * rightTrue;
                }
            }
            else if(arr[k]=='|'){
                if(isTrue){
                    temp+= lefttrue*rightTrue + leftFalse*rightTrue + lefttrue *rightFalse;
                }
                else{
                    temp+= leftFalse * rightFalse;
                }
            }
            ans = Math.max(ans, temp);
        }
        if(isTrue==true){ // memoize
        dp[i][j][1] = ans;
        }
        else{
            dp[i][j][0] = ans;
        }
        return ans;
    }
}

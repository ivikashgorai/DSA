package dynamic_programming.AdityaVerma.CoinChangeI;

public class RecursionCoin {
    public static void main(String[] args) {
        int[] coin = {1,2,3};
        int sum = 4;
        int n = coin.length;
        System.out.println(CountWays(coin,n, sum));
    }   
    static int CountWays(int[] arr,int n,int sum){
        if(sum==0){
            return 1;
        }
        if(n==0){
            return 0;
        }
        if(sum-arr[n-1]>=0){
            return CountWays(arr, n, sum-arr[n-1])+CountWays(arr, n-1, sum);
        }
        else{
            return CountWays(arr, n-1, sum);
        }
        // return count;
    }
}

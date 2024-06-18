package dynamic_programming.AdityaVerma.Knapsack_problems.SubsetSum;

public class RecursiveCode {
    public static void main(String[] args) {
        int[] arr = {2,3,7,8,10}; // all positive
        int targetSum = 11;
    System.out.println(sum(arr, targetSum, arr.length));
    }
    static boolean sum(int[] arr,int targetSum,int n){
        if(targetSum==0){ // empty subset
            return true;
        }
        if(n==0){
            return false;
        }
        if(targetSum-arr[n-1]>=0){
            return (sum(arr, targetSum-arr[n-1], n-1) || sum(arr, targetSum, n-1));
        }
        else{
            return sum(arr, targetSum, n-1);
        }
    }
}

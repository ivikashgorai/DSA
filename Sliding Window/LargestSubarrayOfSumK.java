public class LargestSubarrayOfSumK {
    public static void main(String[] args) { 
        // not applied if -ve number or 0  present
        int[] arr = {};
        int n = arr.length;
        int i = 0;
        int j = 0;
        int req = 3;
        int sum = 0;
        int max  = Integer.MIN_VALUE;

        while(j<n){
            while(sum<req){
                sum+=arr[j];
                j+=1;
            }
            if(sum==req){
                max = Math.max(max,j-i+1);
            }
            while(sum>=req){
                sum-=arr[i];
                i+=1;
            }
        }
        System.out.println(max);
    }
}

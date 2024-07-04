package dynamic_programming;

public class SubarrayTraverse {
    public static void main(String[] args) {
        int[] arr = {1,-2,3,4};
        System.out.println(sub(arr, 0, 0,1));
    }
    static int sub(int[] arr,int index,int end,int sign){
        if(index==arr.length){
            return 0;
        }
        int sum = 0;
        for(int i=index;i<=end;i++){
            sum+=arr[i];
        }
        return Math.max(sum+sub(arr,index,end+1,sign),sub(arr,index+1,end+1, sign));
          
    }
}

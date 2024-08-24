import java.util.*;

public class LongestPrefixSuffix{
    public static void main(String[] args) { //wrong
        // Scanner sc = new Scanner(System.in);
        String s = "ABCABDABCABCABD"; //ABCABDABCABCABD
        int n = s.length();
        char[] ch = s.toCharArray();
        int[] arr = new int[n];
        int left = 0;
        int right = 1;
        arr[0]  = 0;
        while(right<n){
                if(ch[left]!=ch[right]){
                   if(left==0){
                    arr[right] = 0;
                    right+=1;
                   }
                   else{
                    left = arr[left-1];
                   }
                }
                else if(ch[left]==ch[right]){
                    arr[right] = left+1;
                    left+=1;
                    right+=1;
                }
                
        }
        System.out.println(Arrays.toString(arr));
    }
}
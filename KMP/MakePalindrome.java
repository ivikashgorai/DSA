import java.util.*;
public class MakePalindrome {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        String s1 = "aacecaaa"; // rkaa //jaha par peh
        StringBuilder s2 = new StringBuilder(s1);
        s2 = s2.reverse();
        s1 = s1+""+s2;
        // String s2 = "abamm";
            System.out.println(Arrays.toString(lps(s1)));
            // System.out.println(Arrays.toString(lps(s2)));

    }
    public static int[] lps(String s){
        char ch[] = s.toCharArray();
        int n = s.length();
        int left = 0;
        int right = 1;
        int[] arr = new int[n];
        arr[0] = 0;
        while(right<n){
            if(ch[left]==ch[right]){
                arr[right] = left+1;
                right+=1;
                left+=1;
            }
            else{
                if(left==0){
                    arr[right] = 0;
                    right+=1;
                }
                else{
                    left =  arr[left-1];
                }
            }
        }
        return arr;
    }
}

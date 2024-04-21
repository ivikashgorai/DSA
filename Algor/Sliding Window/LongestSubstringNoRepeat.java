import java.util.*;
public class LongestSubstringNoRepeat{
public static void main(String[] args){
    Solution s = new Solution();
    int a  = s.lengthOfLongestSubstring("abcdecbead");
    System.out.println(a);
}
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==1){
            return 1;
        }
        int l = 0;
        int max  = 0;
        StringBuilder sb = new StringBuilder(s);
        StringBuilder ans = new StringBuilder("");
        int n = sb.length();
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<n;i++){
            if(!set.contains(sb.charAt(i))){
                ans = ans.append(sb.charAt(i));
                max = Math.max(max,ans.length());
                set.add(sb.charAt(i));
            }
            else{
                set.remove(ans.charAt(0));
                ans = ans.deleteCharAt(0);
                i-=1;
            }
        }
        return max;
    }
}
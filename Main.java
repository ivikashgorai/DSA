import java.util.*;
public class Main {
public static void main(String[] args) {
  Solution5 sw = new Solution5();
  System.out.println(sw.letterCombination("23"));
}
}
class Solution5 {
    public List<String> letterCombination(String digits) {
     String[] arr =  {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
     List<String> list = new ArrayList<>();
     letter(digits,0,"",arr,list);
     return list;
    }
    static void letter(String digits,int index,String emp,String[] arr, List<String> list){
      if(index==digits.length()){
        list.add(emp);
        return;
      }
       int n = digits.length();
        char ch = digits.charAt(index);
        int num = ch - '0';
        String st = arr[num];
        int len = st.length();
        for(int j=0;j<len;j++){
          letter(digits,index+1,emp+st.charAt(j),arr,list);
        }
    }
}
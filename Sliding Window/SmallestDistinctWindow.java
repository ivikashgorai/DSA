import java.util.*;
public class SmallestDistinctWindow{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = "AABBBCBCCA";
    int n = s.length();
    int[] unique = new int[256];
    for(int i = 0;i<n;i++){
        unique[s.charAt(i)] = 1;
    }
    int[] original = new int[256];
     int last  = 0;
     String min = "";
     int len =Integer.MAX_VALUE;
     boolean[] add = new boolean[n+1];
    //  ArrayList<String> list = new ArrayList<>();
    for(int i =0;i<n;i++ ){
        if(!add[i]){
            original[s.charAt(i)]+=1;
            add[i]=true;
        }
        if(equal(unique, original)){
            original[s.charAt(last)]-=1;
            String st =s.substring(last, i+1);
            if(len>st.length()){
                len = st.length();
                min = st;
            }
            // list.add(s.substring(last, i+1));
            last+=1;
            i-=1;
        }
    }
    System.out.println(min+" "+len);
}
public static boolean equal(int[] arr1,int arr2[]){ // decrease this time ,otherwise code is correct
      for(int i=0;i<256;i++){
        if(arr1[i]==1 && arr2[i]==0){
            return false;
        }
      }
      return true;
}
}
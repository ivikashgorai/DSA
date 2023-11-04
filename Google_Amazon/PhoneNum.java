package Google_Amazon;

import java.util.ArrayList;

public class PhoneNum {
    public static void main(String[] args) {
        String a = "12";
        String empty = "";
        ArrayList<String> list = new ArrayList<>();
      System.out.println(phone(a,empty,list));
    }
    static ArrayList<String> phone(String a,String empty,ArrayList<String> list){
        if(a.isEmpty()){
            list.add(empty);
            return list;
            // return list;
        }
        char ch = a.charAt(0);
        int digit = (int)(ch-'0');
        if(digit>0 && digit<9){
        for(int i=(digit-1)*3;i<digit*3;i++){
            char add = (char)(i+'a');
           phone(a.substring(1), empty+add, list);
        }
    }
    else {
        for(int i=(digit-1)*3;i<digit*3-1;i++){
            char add = (char)(i+'a');
           phone(a.substring(1), empty+add, list);
        }
    }
       return list;
    }
}

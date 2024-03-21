package revision.Basic;

import java.util.*;
public class DecToBin{
    public static void main(String[] args) {
        int a = 20;
        StringBuilder s = new StringBuilder("");
        while(a!=0){
            s.append(a%2);
            a = a/2;
        }
        System.out.println(s.reverse());
         
    }
}
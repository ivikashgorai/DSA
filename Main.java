// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       while(t-->0){
           String s = sc.next();
           String out = "";
           for(int i=0;i<s.length();i++){
               if(s.charAt(i)!='B' && s.charAt(i)!='b'){
                    String s1=String.valueOf(s.charAt(i));  
                    out = out.concat(s1);
               }
               else if(s.charAt(i)=='B'){
                   for(int j=out.length()-1;j>=0;j--){
                       if(out.charAt(j)>='A' && out.charAt(j)<='Z'){
                        if(j+1<out.length()){
                           out= out.substring(0, j)+""+out.substring(j+1, out.length());
                       }
                       else{
                        out = out.substring(0, j);
                       }
                           break;
                       }
                   }
               }
                   else if(s.charAt(i)=='b'){
                   for(int j=out.length()-1;j>=0;j--){
                       if(out.charAt(j)>='a' && out.charAt(j)<='z'){
                            if(i+1<out.length()){
                           out= out.substring(0, j)+""+out.substring(j+1, out.length());
                       }
                       else{
                        out = out.substring(0, j);
                       }
                           break;
                       }
                   }
               }
           }
           System.out.println(out);
       }
    }
}
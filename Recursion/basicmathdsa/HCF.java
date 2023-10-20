package basicmathdsa;
public class HCF {
  public static void main(String[] args) {
    int a = 30;
    int b = 45;
hcf(a, b); // for lcm 
    //LCM(a,b) X HCF(a,b) = a X b;
  }

  public static void hcf(int a, int b) { // Time complexity O(log N)
      int rem=-1;
      while (rem != 0) {
        rem = b%a;
        b = a;
        a = rem;
      }
      System.out.println(b); 
    // if(a==0){
    //   return b;
    // }
    // return hcf(b%a,a); // through recursion 
  }
}
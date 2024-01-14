package basicmathdsa;

public class HCF {
  public static void main(String[] args) {
    int a = 30;
    int b = 45;
    int ans = hcf(a, b); // for lcm
    // LCM(a,b) X HCF(a,b) = a X b;
  }

  public static int hcf(int a, int b) { // Time complexity O(log N)
    if (a == 0) {
      return b;
    }
    return hcf(b % a, a); // through recursion
  }
}
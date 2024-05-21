package practice_ques.bit_manipulation;

public class XorOneToN {
    public static void main(String[] args) {
        int n =5;
        System.out.println(oneton(n));
        
    }
    public static int oneton(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 3;
        }
        int from = ((n-3)/4)+1;
        int num = 3+((from-1)*4);
        int ans = 0;
        for(int i=num+1;i<=n;i++){ // O(3)
            ans^=i;
        }
        return ans;
    }
}

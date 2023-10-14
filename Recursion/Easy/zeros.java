package recursion.easy;
public class zeros {
    static int sum =0;
    public static void main(String[] args) {
        int  n =40530200; 
        zero(n);
        System.out.println(sum);

    }
    public static void zero(int n){
        if(n/10==0){
            return;
        }
        else if(n%10==0){
            sum+=1;
        }
        zero(n/10);
    }
}

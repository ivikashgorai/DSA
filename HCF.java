public class HCF {
    public static void main(String[] args) {
        int a  = 15;
        int b = 3;
        System.out.println(hfc(a,b));

    }
    static int hfc(int a,int b){
        if(a%b==0) return b;

        int rem = b%a;
        b = a;
        a = rem;
        return hfc(a,b);
    }
}

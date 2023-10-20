package basicmathdsa.sqrt;
public class sqrtBinary {
    public static void main(String[] args) { // best way to find sqare root
        long n=2147395599;
        System.out.println(sqrt1(n));

    }
    public static long sqrt1(long n) {
        long start =0;
        long end = n;
        while(start<=end){
            long mid = start+(end-start)/2;
            if(mid*mid>n){
                end = mid-1;
            }
            else if(mid*mid<n){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return end;
    }
}

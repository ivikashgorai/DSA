package practice_ques.bit_manipulation;

public class DivideWithoutAnyOperator {
    public static void main(String[] args) {
        long n = -2147483648;
        long m = 2;
       System.out.println(find(n, m));

    }
    public static long find(long n,long m){
        // 89/8 = 11
        boolean neg = false;
        if(n<0 && m<0){
            n=-n;
            m = -m;
        }
        else if(n<0){
            n = -n;
            neg = true;
        }
        else if(m<0){
            m = -m;
            neg = true;
        }
        
        if(n==m && !neg){
            return 1;
        }

        // real code form here
        long count =0;
        while(n>=m){
            long num = binary(n, m);
            count+=(1<<num);
            n -= (m<<num);
        }
        if(neg){
            return (int) -count;
        }
        return (int)count;

    }
    public static long binary(long n,long m){
        long start = 0;
        long end = 32;
        while(start<=end){
            long mid = start + (end-start)/2;
            long num = m<<mid;
            if(num<n){
                start = mid+1;
            }
            else if(num>n){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return end;
    }
}

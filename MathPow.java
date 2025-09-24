public class MathPow {
    public static void main(String[] args) {
    int power = 100;
    int num = 3;
    System.out.println(pow(3,20));
    }
   static long pow(int num,int power){
    if(power==0){
        return 1;
    }
    if(power%2!=0){
        return num * pow(num,power-1);
    }
    else{
        long half = pow(num,power/2);
        return half*half;
    }
}
}

//working hard
//2nd commit


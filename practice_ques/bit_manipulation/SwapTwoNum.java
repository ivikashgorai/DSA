package practice_ques.bit_manipulation;

public class SwapTwoNum {
    public static void main(String[] args) {
        int a = 13;
        int b = 6; 
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(a+" "+b);

    }
}

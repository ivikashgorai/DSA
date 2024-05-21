package practice_ques.bit_manipulation;

public class clearIthBit {
    public static void main(String[] args) {
        int a  = 13; //1101
        int  i = 3;
        int b = 1;
        b = ~(b<<(i-1));
        System.out.println(a&b);

    }
}

package basicmathdsa;

public class factorials {
   public static void main(String[] args) {
    int n=22;
    for(int i =1;i<=Math.sqrt(n);i++){
        if(n%i==0){
            System.out.print(i+" ");
            System.out.print(n/i+" "); // create arraylist and store it and then print in opposite way in last
        }
    }
   } 
}

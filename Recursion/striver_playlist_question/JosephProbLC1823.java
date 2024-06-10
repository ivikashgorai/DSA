package striver_playlist_question;

/**
 * JosephProbLC1823
 */
public class JosephProbLC1823 {

    public static void main(String[] args) {
        int n =6;
        int k = 5; 
       System.out.println(josh(n, k)+1); // +1 for if 1 indexed
    }
    static int josh(int n,int k){ // 0 indexed
        if(n==1){
            return 0;
        }
        return (josh(n-1, k) +k)%n;
    }
}
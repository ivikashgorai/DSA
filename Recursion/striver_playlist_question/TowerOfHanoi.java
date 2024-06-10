package striver_playlist_question;

public class TowerOfHanoi {
    static int count = 0;
    public static void main(String[] args) {
        int n = 2;
       int source = 1;
       int help = 2;
       int dest = 3;
       solve(n, source, help, dest);
    }
    static void solve(int n, int source,int help,int dest){
        if(n==1){
            System.out.println("move disk"+" "+n+" "+"from rod "+source+" to rod "+dest);
            return;
        }
        solve(n-1, source, dest, help);
        System.out.println("move disk"+" "+n+" "+"from rod "+source+" to rod "+dest);
        solve(n-1, help, dest, source);
    }
}

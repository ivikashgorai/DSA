package recursion.subset_subsequence_string.basicstring;

public class remove {
    public static void main(String[] args) {
        String name = "babbsaaaccda";
        String ans = "";// remove all 'a' from it
        System.out.println(removeA(name, 0, ans));
    }
    static String removeA(String name,int n,String ans){
        if(n==name.length()){
            return ans;
        }
            if(name.charAt(n)!='a'){
                ans = ans+name.charAt(n);
            }
                return removeA(name, n+1,ans);
        }
}



public class StringX {
    public static void main(String[] args) {
        String subs = "";
        String up = "abc";
        subsequenc(subs,up);
    }
    static void subsequenc(String subs,String up){
        if(up.isEmpty()){
            System.out.println(subs+" ");
            return;
        } 
        char ch = up.charAt(0); // humko sirf first step sochna hai baki sab apne aap ho jayega
        // also printing the empty string
        subsequenc(subs+ch,up.substring(1));
        subsequenc(subs,up.substring(1));// => if it is written up then output will from down to up as it printing now
        // subsequenc(subs+(ch+0), up.substring(1));=> also give assci value of ch
    }
}

package amazonques;

import java.util.*;

public class Dice {
    public static void main(String[] args) {
        int dice = 4;
        String em = "";
        List<String> list = new ArrayList<>();
        diceFun(list, dice, em);
        System.out.println(list);
    }
    static void diceFun(List<String> list,int dice,String em){
        if(dice==0){
            list.add(em);
            return;
        }
        for(int i=1;i<=6;i++){ // if dice is lets say not (max) not equal to 6 so just increase the i<= here
            if(dice-i>=0){
                diceFun(list, dice-i, em+i+"");
            }
        }
    }
}

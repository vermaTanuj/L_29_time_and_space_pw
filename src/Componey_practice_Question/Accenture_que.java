package Componey_practice_Question;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Accenture_que {
    public static void main(String[] args) {
        //Convert the capital to small:-
        String s="ABCDabcd123**";
        System.out.println(converter(s));

    }
    public static String converter(String s){
        char [] ch= s.toCharArray();//new char[s.length()];

        for(int i=0;i< ch.length;i++){
            if(Character.isUpperCase(ch[i])){
                ch[i]=Character.toLowerCase(ch[i]);
            }
            else{
                //if(Character.isLowerCase(ch[i]))
                ch[i]=Character.toUpperCase(ch[i]);
            }
        }
        return String.valueOf(ch);
    }
}

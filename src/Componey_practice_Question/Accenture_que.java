package Componey_practice_Question;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Accenture_que {
    public static void main(String[] args) {
        //Convert the capital to small:-
        String s="ABCDabcd123**";
       // System.out.println(converter(s));

        System.out.println((int)'a');
        System.out.println((int)'z');
        System.out.println((int)'A');
        System.out.println((int)'Z');
        System.out.println(by_Algoritthem(s));
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

    public static String by_Algoritthem(String s){

        char[] c=s.toCharArray();
        int i=0;
        while(i< c.length){
            if((int)c[i]>=65 && (int)c[i]<=90){
                char ch= (char) ((int)c[i]+32);
                c[i]=ch;
                i++;
            }
            else if((int)c[i]>=97 && (int)c[i]<=122){
                char ch= (char) ((int)c[i]-32);
                c[i]=ch;
                i++;
            }
            else {
                i++; // Increment i if the character is neither uppercase nor lowercase
            }
        }
return String.valueOf(c);
    }
}

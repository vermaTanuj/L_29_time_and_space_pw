package __String__;

import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        //Pool:-
        String a="tanuj";
        String b="tanuj is goood  ";

        System.out.println("{"+b.trim()+"}");


       String [] word= b.split(" ");
        System.out.println("["+Arrays.toString(word)+"]");

        System.out.println(String.join("",word));

        b="og";
    //    System.out.println(a+b);
    }
}

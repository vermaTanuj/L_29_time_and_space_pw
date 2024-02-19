package __String__;
import java.util.*;
public class String__Builder {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Tony");
        
        System.out.println(sb);
        sb.append("s");
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        sb.setCharAt(2,'y');
        System.out.println(sb);
        sb.insert(1,'r');
        System.out.println(sb);
        sb.delete(3,4);
        System.out.println(sb);
        System.out.println(sb.length());
        sb.reverse();
        System.out.println(sb);

        System.out.println(revString(sb));

    }

    public static String revString(StringBuilder s){

        if(s.length()==0 )return "Empty string";
        if(s==null){return "Null";}
        int st=0;
        int end=s.length()-1;


        while(st<end) {
            char t= s.charAt(st);
          s.setCharAt(st,s.charAt(end));
          s.setCharAt(end,t);
          st++;
          end--;
        }
        return String.valueOf(s);
    }
}

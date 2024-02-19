
import java.util.ArrayList;
import java.util.Collections;

public class _ArrayList__pw {
    public static void main(String[] args) {

        ArrayList <Integer> al=new ArrayList();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println("Original list:-"+al);
        System.out.println("Reversed list:-"+rev(al));

        ArrayList l=new ArrayList();
        l.add("Apple");
        l.add("ball");
        l.add("cat");
        l.add("dall");
        l.add("aapp");
        System.out.println("String list:-"+l);

       // method to sort
        Collections.sort(l);

        System.out.println("String sort list:-" +l);
    }
    public static ArrayList rev(ArrayList al){

        int st=0;
        int end= al.size()-1;
        while(st<end){
            Integer t=Integer.valueOf((int)al.get(st));
           al.set(st,al.get(end));
            al.set(end,t);
            st++;end--;
        }

        return al;
    }
}

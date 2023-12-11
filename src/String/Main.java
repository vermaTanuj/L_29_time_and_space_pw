package String;



public class Main {
    public static void main(String[] args) {

        String a="Tanuj";
        String b="Tanuj";

        if(a==b){
            //==:- checks the memory in heap
            System.out.println("a & b are equal");
        }
        if(a.equals(b)){
            //.equals():- checks the content of string
            System.out.println("a.equals(b)");
        }

        // Immutable;
        //Reassign:-
        String s="top";
        System.out.println(s);
        s="bottom";
        System.out.println(s);
        //S is not changed s has reassigned a new value;

        //how to create the new obj with same value:-
        String v=new String("kkk");
        String u=new String("kkk");
        System.out.println(u==v);
        System.out.println(u.equals(v));
    }
}

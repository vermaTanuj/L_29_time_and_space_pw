package OOPs__kunal.__Object_Cloning;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        CopyConstructor human=new CopyConstructor(24,"tanuj");

        ////Object cloning:-
        //Copy:-
        CopyConstructor y=new CopyConstructor(human);

        System.out.println(human.age);
        System.out.println(human.name);
        System.out.println(y);
        System.out.println(y.age);
        System.out.println(y.name);

        //but copy constructor is slow:-


        //Copies
        //Shallow copy:- premitive makes a new copy,but non premitives like Ayyay
        //               String reffers to the same memory adress
        //               so update can alter the result

        int a[]={1,2,3,4,5,6};
        int b[]=a;
        System.out.println("a:-"+Arrays.toString(a));
        System.out.println("b:-"+Arrays.toString(b));
        b[0]=99;
        System.out.println("a:-"+Arrays.toString(a));
        System.out.println("b:-"+Arrays.toString(b));

//Deep copy:-
        int c[]={1,2,3,4,5,6};
        int d[]=Arrays.copyOf(c,c.length);
        System.out.println("c:-"+Arrays.toString(c));
        System.out.println("d:-"+Arrays.toString(d));
        d[0]=999;
        System.out.println("c:-"+Arrays.toString(c));
        System.out.println("d:-"+Arrays.toString(d));
//Deep copy:-
        String s="rrr";
        String s1=s;
        s="123";
        System.out.println(s);
        System.out.println(s1);
    }
}

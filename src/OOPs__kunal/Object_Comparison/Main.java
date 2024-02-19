package OOPs__kunal.Object_Comparison;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student tanuj =new Student(4,70.56f);
        Student verma =new Student(5,60.60f);

    /*    //comparing two opraters:-
        if(tanuj > verma){
            System.out.println("tanuj wins");
        }
        if(tanuj < verma){
            System.out.println("verma wins");
        }

     */


        System.out.println(tanuj.compareTo(verma));

        gop a=new gop(6,90.90f);
        gop b=new gop(6,909.90f);
        gop c=new gop(6,90.90f);
        gop d=new gop(6,909.90f);
        gop e=new gop(6,90.90f);
        gop f=new gop(6,909.90f);
        System.out.println(a.comaiir(b));
        
        gop []list={a,b,c,d,e,f};
        System.out.println(list);
    //    Arrays.sort(list);
        System.out.println(list);
    }
}

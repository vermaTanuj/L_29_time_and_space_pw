package Maths_for_DSA__Kunal;


import java.util.Arrays;

public class Lec_25__Bit_Wise_oprater {
    public static void main(String[] args) {

        System.out.println(oddEven(-9));
        System.out.println(isOdd(9));

        int a[]={1,3,5,1,3,5,9};
       // in array every no appears toice 1 no apears ones return that no;


        int ans=no(a);
        System.out.println(ans);

    }

    //no is odd or even:-
    public static String oddEven(int n){
        String s="Odd";
        if(n%2==0){
            s="Enen";
        }
        return s;
    }
    public static boolean isOdd(int n){
        return((n & 1)==1);
    }

    //non repeated no:-
    public static int no(int a[]){
        int unique=0;
        for(int i=0;i< a.length;i++){
            unique=unique^a[i];
        }

      return unique;
    }
}

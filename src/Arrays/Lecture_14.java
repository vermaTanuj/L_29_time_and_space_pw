package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Lecture_14 {
    public static void main(String [] args){
        System.out.print("Enter the size of array:- ");
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int [] a=new int[b];
        input(a);
        System.out.println("array:-"+ Arrays.toString(a));

        System.out.println("array's sum:-"+ sum(a));
        System.out.println("array's max no:-"+ max(a));

        //Find target  element or not:-
        System.out.print("Enter the target element of array:- ");
        int target=sc.nextInt();
        int r=findTarget(a,target);
        if(r<0){
            System.out.println("target does't exist ;");
        }
        else {
            System.out.println("target:- "+target+" exist at:- "+r);
        }
    }
    //input anarray:-
    public static int[] input(int []a){
        System.out.println(" Enter the elements:--");
        int in=0;
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<a.length;i++){
            System.out.print("arr["+i+"]:-");
          in=sc.nextInt();
          a[i]=in;

        }
        return a;
    }

    //calculate the sum of array:-
    public static int sum(int []a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }


        return sum;
    }

    //maximum out of all elements:-
    public static int max(int []a) {
       int max=a[0];
       for(int i=0;i<a.length;i++){
           if(max<a[i]){
               max=a[i];
           }
       }

        return max;
    }

    //Finding target element is in array or not & return its index:-
    public static int findTarget(int []a,int t) {
        int index=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]==t){
               index=i;
            }
        }


        return index;
    }


}

package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lecture_21 {
    public static void main(String[] args) {

       // swap(5,6);
     //   swapSumDiff(5,6);
        //reverse the array;-
        int []a={4,5,6,7,8,8,9,7,5,5,4,3,2,1};
      //  reverseArray(a);
        //reverseArray_for_loop(a);

        //reverse Array in place from position to position:-
        //where i is initial position and j is last position;
      //  Rev_place_to_place(a,2,6);

        //rotate the array to tke value of k:
        System.out.println("Oringinal Array:- "+Arrays.toString(a));
      //  reverse_k(a,6);
        rotate_k_inplace(a,6);


    }
    public static void swap(int a,int b){
        System.out.println("a:-"+a);
        System.out.println("b:-"+b);
        int tenp;
        tenp=a;
        a=b;
        b=tenp;
        System.out.println("a:-"+a);
        System.out.println("b:-"+b);
    }

    public static void swapSumDiff(int a,int b){
        System.out.println("Swapping wsing sum and diff:-" );
        System.out.println("a:-"+a);
        System.out.println("b:-"+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a:-"+a);
        System.out.println("b:-"+b);

    }

    //reversing array:-
    public static void reverseArray(int []a){
        System.out.println("original array:- "+Arrays.toString(a));

        int n=a.length-1;
        int i=0;
        int temp;
        while(i<=n){
           temp=a[i];
           a[i]=a[n];
           a[n]=temp;
            i++;n--;
        }
        System.out.println("original array:- "+Arrays.toString(a));
    }

    ////reversing array:- Using for loop:-
    public static void reverseArray_for_loop(int []a){
        System.out.println("revers ing using for loop:-");
        System.out.println("original array:- "+Arrays.toString(a));
        int n=a.length-1;
        int temp;
        for(int i=0;i<=a.length/2;i++){
            if(i<=n){
                temp=a[i];
                a[i]=a[n];
                a[n]=temp;
                n--;
            }
        }
        System.out.println("original array:- "+Arrays.toString(a));
    }

    //reverse Array in place from position to position:-
    public static void Rev_place_to_place(int a[],int i,int j){
        int temp;
      //  System.out.println("original array:- "+Arrays.toString(a));
        while(i<=j){
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            j--;i++;
        }
        System.out.println("Rotated array:- "+Arrays.toString(a));
    }

    //rotate the array to tke value of k::--
    public static void reverse_k(int []a,int k){
        int n=a.length;
        k=k%n;

        //new Array:- ans
        int []ans=new int[n];
        int j=0;
        for(int i=n-k;i<=n-1;i++){
            ans[j++]=a[i];
        }
        for(int i=0;i<=n-k-1;i++){
            ans[j++]=a[i];
        }
        System.out.println("rotate the array to tke value of k=6:- "+Arrays.toString(ans));
    }

    //rotate the array to tke value of k::--
    //in place:-
    public static void rotate_k_inplace(int a[],int k){
        int n= a.length;
        k=k%n;

        //rotate first part:-
        Rev_place_to_place(a,0,n-k-1);
//rotate 2nd part:-
Rev_place_to_place(a,n-k,n-1);
//rotate whole array:-
        Rev_place_to_place(a,0,n-1);
        System.out.println("rotate the array to tke value of k=6:- "+Arrays.toString(a));
    }

    }

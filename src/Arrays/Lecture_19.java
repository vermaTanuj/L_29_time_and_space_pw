package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Lecture_19 {
    public static void main(String[] args) {
/*
        //2D Array dexclaration:-
        int a[][]=new int[3][];

        //taking input in array from user and printing:-

        System.out.print("Enter the size of array:- ");
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int [] ar=new int[b];

        //input function:-
        input(ar,b);
        //printing function:-
        print(ar);



 */
        //count the number of occurence of x in array:-
        int arr[] ={2,3,4,5,6,5,4,5};
        System.out.println("no of occurence of x is :-"+occurencre(arr,5));

        //last occurence of x
        //if x does not exist return -1
        System.out.println("last of occurence of x is :-  "+lastOccurence(arr,5));

        //in a array count the no of elemenyts strictly greater than x:-
        System.out.println("no of elemenyts strictly greater than x :-  "+strictlyGreater(arr,1));

        //check if the given array is sorted or not:-
        System.out.println("check if the given array is sorted or not:-"+Arrays.toString(arr)+" "+sortedOrNot(arr));


        //Write a function that returns a array where in whish a[o]=Smallest element ,and a[1]=Biggest elements
        System.out.println("return a function "+Arrays.toString(arr)+" :- "+Arrays.toString(smallBig(arr)));
  //trick:-
        /*
        minimum:-
        if a[i] is minimum then min then make it a new min
        maximum:-
        if a[i] is maximum than max than make it a new max
         */
    }

    public static void input(int []ar,int b){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements:-");
        for(int i=0;i<ar.length;i++){
            System.out.print("ar["+i+"]:-");
            ar[i]=sc.nextInt();
        }

    }

    public static void print(int []ar){
        for(int i=0;i<ar.length;i++) {
            System.out.print(ar[i]+" ");
        }
    }

    ////count the number of occurence of x in array:-
    public static int occurencre(int []arr,int x){
        int c=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==x){
                c++;
            }
        }
        return c;
    }


    //last of occurence of x is
    public static int lastOccurence(int []arr,int x){
        int l=-1;//-1 if not exist
        for(int i=arr.length-1;i>=0;i--){
           if(arr[i]==x){
               l=i;
               break;
           }
        }

        return l;
    }

    //in a array count the no of elemenyts strictly greater than x:-
    public static int strictlyGreater(int []arr,int x){
        int c=0;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] > x) {
                c++;
            }
        }
        return c;
    }

    //check if the given array is sorted or not:-
    public static String sortedOrNot(int a[]){
        String s="SORTED";
      for(int i=1;i<a.length;i++){
          if(a[i-1]>a[i]){
             s="NOT SORTED";
          }

      }

        return s;
    }


    public static int [] smallBig(int []a){
        int []ar=new int [2];
        int max=a[0];
        int min=a[0];
        //max element:-
        for(int i=1;i< a.length;i++){
            if( a[i] >max){
                max=a[i];

            }}

            //min element:-
            for(int j=1;j< a.length;j++){
                if( a[j] < min){
                    min=a[j];

                }
            }
        ar[1]=min;
        ar[0]=max;
        return ar;
    }
}

package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Frequency_Array {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array:-");
        int n= sc.nextInt();
        int a[]=new int[n];

        System.out.println("Taking input in array:-" );

        for(int i=0;i<n;i++){
            System.out.print("a["+i+"]:-");
            a[i]=sc.nextInt();
        }
        //printing:-
        System.out.println("original array :- "+Arrays.toString(a));

        //making frequency Array
        //it is made to denote the frequency of array :- a
        //ita size is one more than biggest element in array a

        int[] freq= makeFrequencyArray( a);

        System.out.println("Frequency array :- "+Arrays.toString(freq));

        //taking queries from user:-
        System.out.print("Enter the no fo queries:-");
        int q=sc.nextInt();

        //checking for queries:-
        while(q>0){
            System.out.print("enter no to be searched :- ");
            int x=sc.nextInt();

            if(freq[x]>0){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
            q--;
        }
    }


    //  FREQUENCY ARRAY:-
    public static int [] makeFrequencyArray(int []a){
        int freq[]=new int[100005];
        //default value at each position is 0

        for(int i=0;i< a.length;i++){
            freq[a[i]]++;
        }
return freq;
    }
}

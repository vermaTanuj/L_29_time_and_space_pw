package Sorting__;

import java.util.Arrays;

public class Kunal_BubbleSort__Lec__19 {
    public static void main(String[] args) {
        int a[]={3,1,5,4,2};
        int b[]={5,4,3,2,1};

     //  System.out.println(Arrays.toString(BubbleSort(b)));

       bubbleSort_Kunal(a);
        System.out.println(Arrays.toString(a));
    }
    //Bubble Sort:-
    //My Algo:-
    public static int[] BubbleSort(int a[]){
        System.out.println(Arrays.toString(a));
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    //swap:-
                    int t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        return a;
    }

    //Kunal BubbleSort:-
    public static void bubbleSort_Kunal(int a[]){

        for(int i=0;i<a.length;i++){   // running to n-1 terms
            boolean b=false;
          for(int j=1;j< a.length-i;j++){  //for each step maximum item will come at end
              //Swaping the term if it is sess then its previous one:-
              if(a[j]<a[j-1]){
                  //swap:-
                  int t=a[j];
                  a[j]=a[j-1];
                  a[j-1]=t;
                  b=true;
              }
          }
          if(b==false){
              System.out.println("hhhf");
              return;
          }
        }
    }
}

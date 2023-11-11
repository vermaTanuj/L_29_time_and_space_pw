package Sorting__;

import java.util.Arrays;
public class Insertion__Sort__Kunal {
    public static void main(String[] args) {
        int a[]={5,4,3,2,1};
        insertionSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void insertionSort(int a[]){

        for(int i=0;i<a.length;i++){  //Select a element and place it at correct position;

            int last = a.length-1-i;
            int max_ele_index=findMaxElement(a,0,last);
            swap(a,max_ele_index,last);


        }
    }

    public static int findMaxElement(int a[],int st,int end){
        int max=st;
        for(int i=st;i<=end;i++){
           if(a[max] <a[i]){
               max=i;
           }
        }
        return max;
    }

    public static void swap(int a[],int f,int s){
        int t=a[f];
        a[f]=a[s];
        a[s]=t;
    }
}

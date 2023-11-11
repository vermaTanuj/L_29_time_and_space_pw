package Sorting_pw;

import java.util.Arrays;

public class exp {
    public static void main(String[] args) {


        int a[]={8,9,7,2,3,4,5,6,};
                insertionsort(a);
        System.out.println(Arrays.toString(a));
//1307674368000
    }




//insertion sort:-
    public static void insertionsort(int a[]){
        for(int i=0;i<a.length;i++){

            //finding last index:-
            int last_ind=a.length-1-i;
            int biggedt_ele=find_big_ele(a,0,last_ind);
            swap(a,biggedt_ele,last_ind);

        }
    }

    //bogest ele:-
    public static int find_big_ele(int a[],int s,int e){
        int max=s;
        for(int i=0;i<=e;i++){
            if(a[max]<a[i]){
                max=i;
            }
        }
        return max;
    }

    //swaping index:-
    public static void swap(int a[],int f,int s){
        int t=a[f];
        a[f]=a[s];
        a[s]=t;
    }
}

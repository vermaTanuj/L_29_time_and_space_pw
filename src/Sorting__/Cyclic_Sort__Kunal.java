package Sorting__;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Cyclic_Sort__Kunal {
    public static void main(String[] args) {
        int a[]={3,5,2,1,4};
        int i[]={7,8,9,13,11,12};
      int y[]={3, 4, 12, 3, 12, 3, 4, 4, 12, 7, 11, 6, 5};

        cyclic_sort(y);
        System.out.println(Arrays.toString(y));
        System.out.println("gg");

        int b[]={0,3,1};
        System.out.println(gfg(y, y.length));
      //  System.out.println(Leet_code_286(b));
    }

    //Cyclic sort:-


    public static void cyclic_sort(int a[]){
        int i=0;
        while(i<a.length){
            int correct_ind=a[i]-1;
            if(a[i]<a.length && a[i]>0 && a[i] != a[correct_ind]){
                int t=a[i];
                a[i]=a[correct_ind];
                a[correct_ind]=t;
            }
            else{
                i++;
            }
        }
    }


    public static int Leet_code_286(int a[]){

        int i=0;
        while(i<a.length){
            int correct_ind=a[i];
            if(a[i]<a.length && a[i] != a[correct_ind]){
                //Swap:-
                int t=a[i];
                a[i]=a[correct_ind];
                a[correct_ind]=t;
            }
            else{
                i++;
            }
        }
        for(int k=0;k<a.length;k++){
            if(a[k] != k){
                return k;
            }
        }
        return a.length;
    }

    public static List<Integer> Leet_code_448(int a[]){
        List<Integer> l1=new ArrayList<>();

        int i=0;
        while(i<a.length){
            int corr_ind=a[i]-1;
            if(  a[i]!=a[corr_ind]){
                //Swap:-
                int t=a[i];
                a[i]=a[corr_ind];
                a[corr_ind]=t;
            }
            else{
                i++;
            }
        }
        for(int k=0;k<a.length;k++){
            if(a[k]!=k+1){
                l1.add(k+1);
            }

        }
        return l1;
    }
    public int Leet_code_287(int[] a) {

        int i=0;
        while(i<a.length){
            int corr_ind=a[i]-1;
            if(a[i]!=a[corr_ind]){
                //Swap:-
                int t=a[i];
                a[i]=a[corr_ind];
                a[corr_ind]=t;
            }
            else{
                i++;
            }
        }
        for(int k=0;k<a.length;k++){
            if(a[k]!=k+1){
                return a[k];
            }
        }
        return a.length;
    }

    public List<Integer> LeetCode_442(int[] a) {
        List <Integer>l1=new ArrayList<>();
        int i=0;
        while(i<a.length){
            int corr_ind=a[i]-1;
            if(a[i]!=a[corr_ind]){
                //Swap:-
                int t=a[i];
                a[i]=  a[corr_ind];
                a[corr_ind]=t;
            }
            else{
                i++;
            }
        }
        //Checking:-
        for(int k=0;k<a.length;k++){
            if(a[k]!=k+1){
                l1.add(a[k]);
            }
        }
        return l1;
    }

    public int LeetC0de_41(int[] a) {


        int i=0;
        while(i<a.length){
            int correct_ind=a[i]-1;
            if(a[i]<=a.length && a[i]>0 && a[i] != a[correct_ind]){
                int t=a[i];
                a[i]=a[correct_ind];
                a[correct_ind]=t;
            }
            else{
                i++;
            }

        }

        for(int k=0;k<a.length;k++){
            if(a[k]!=k+1){
                return k+1;  //return value not index
            }

        }
        return a.length+1;    //next value
    }

    public static ArrayList<Integer> gfg(int a[], int n) {
        // code here

        ArrayList<Integer>al=new  ArrayList<Integer>();

        //count sort:-
        int i=0;
        while(i<n){
            int corr_ind=a[i];
            if(a[i]!=a[corr_ind]){
                //Swap:-
                int t=a[i];
                a[i]=a[corr_ind];
                a[corr_ind]=t;
            }
            else{
                i++;
            }
        }
        //Checking:-
        for(int k=0;k<a.length;k++){
            if(a[k]!=k){
                al.add(a[k]);
            }

        }
        //Checkung:-
        

        if(al.isEmpty()){
            al.add(-1);
        }
        Collections.sort(al);
        return al;


    }
}

package Sorting__;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cyclic_Sort__Kunal {
    public static void main(String[] args) {
        int a[]={3,5,2,1,4};

    //    cc(a);
        //cyclic_sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println("gg");

        int b[]={0,3,1};
        System.out.println(Leet_code_286(b));
    }

    //Cyclic sort:-
    public static void cc(int a[]){
        int n=a.length;
        int p=0;
        int i;
        while(p<a.length){
            if(a[p]-1!=a[p]){
                //swap:-
                int t=a[p]-1;
                a[p]=a[a[p]-1];
                a[a[p]-1]=t;
            }
          else {

               p++;
           }

        }
    }

    public static void cyclic_sort(int a[]){
        int i=0;
        while(i<a.length){
            int correct_ind=a[i]-1;
            if(a[i] != a[correct_ind]){
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
}

package Sorting_pw;

import java.util.Arrays;
public class Question_practice {
    public static void main(String[] args) {
        /*
        Given an integer array arr,move all 0's to the end of it while maintaining the
        relative order of the non zero elements;

        do it in place
        {0,5,0,3,42,0,0,-1,-2,0};
        * */
        int a[]={0,5,0,3,42,0,0,-1,-2,0};
        b_sort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void b_sort(int a[]){
        for(int i=0;i< a.length;i++){
            for(int j=1;j<a.length-i;j++){
                if(a[j-1]==0){
                    //swap:-
                    int t=a[j];
                    a[j]=a[j-1];
                    a[j-1]=t;
                }
            }
        }
    }
}

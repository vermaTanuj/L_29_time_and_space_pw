package Searching_Kunal;

import java.util.ArrayList;
import java.util.Arrays;

public class LeniarSearch__L_13 {
    public static void main(String[] args) {



        //Leaniar search on String:-
        String s="tanuj";
        char c='a';

        System.out.println(ls(s,c));

        //to convert string into Array:-
        String a="Apapaya";
        System.out.println("Original:- "+a);
        //Method:-
       // a.toCharArray();
        System.out.println("Original into Array:- "+ Arrays.toString(a.toCharArray()));

        int d[]={-8,1,2,3,4,5,6,7,12,0,00};
        int[]p={};
        System.out.println("Min in array:-  "+min(d));

        //Searching in 2d array:-
        int [][]r={ {0, 1, 2, 3},
                {4, 5, 6, 7},
                {8, 9, 10, 11}};
        int[][] y=new int[0][];
        System.out.println("the element exist at:-"+Arrays.toString(searvhIn2D(r,6)));

        //  //seperating even and odd no in array:-
       // and return even;
        System.out.println("Seperated Array:-"+sep(d));



    }
    //method to search in a string:-
    public static String ls(String s,char t){


        if (s.length()==0){
            return " Empty string ";
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==t){
                return "it exists";
            }
        }
        return "-1";
    }

    //minimum no:-
    public static int min(int []a){
        int rr=0;
        if (a.length==0){
            return -3;
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(min>a[i]){
                min=a[i];
                rr=min;
            }
        }
        return rr;
    }

    //searching  in 2d Array:-
    public static int[] searvhIn2D(int [][]a,int t){
       int []ans={-1,-1};
        if(a.length==0){
            return new int[]{-6,-6,-6};
        }

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(t==a[i][j]){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }

        return ans;
    }


    //seperating even and odd no in array:-
    public static ArrayList sep(int []a){
       ArrayList al=new ArrayList();

        //Handeling empty array condition;-
        if (a.length==0){
            al.add("Empiy array");
            return al;
        }


        //Searching:-
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
               al.add(a[i]);
            }
        }

        return al;
    }

}

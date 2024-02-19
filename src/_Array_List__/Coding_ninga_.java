package _Array_List__;

import java.util.ArrayList;
import java.util.Arrays;

public class Coding_ninga_ {
    public static void main(String[] args) {
        //Intersection of 2 sorted Array:-
  ArrayList <Integer> a=new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(2);
        a.add(2);
        a.add(3);
        a.add(4);


        ArrayList <Integer> b=new ArrayList<>();
        b.add(2);
        b.add(2);
        b.add(3);
        b.add(3);

        ArrayList<Integer> p=
                findArrayIntersection(a,6,b,4);
       for(int i=0;i<p.size();i++){
            System.out.println(p.get(i));
        }




    }

    public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> a, int n, ArrayList<Integer> b, int m)
    {
        // Write Your Code Here.

        //New Array list;
        ArrayList<Integer> ans=new ArrayList<>();

       int i=0; int j=0;

       while(i<n && j <m){

           if(a.get(i)==b.get(j)){
               ans.add(a.get(i));
               i++;
               j++;
           }

           if(a.get(i) < b.get(j)){
               i++;
           }
           if(a.get(i) >  b.get(j)){
               j++;
           }

       }

return ans;


    }
}


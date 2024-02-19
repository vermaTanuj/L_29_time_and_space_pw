package Recurtion__Kunal;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrays_Lec__28 {
    public static void main(String[] args) {
        int a[]={1,3,4,7,2};
        System.out.println("Array"+ Arrays.toString(a)+" is sorted or not:-"+isSorted(a,0));  //o:- index

        //Lenisr search in array:-  Recurtion;
        int b[]={3,2,1,18,9};
        System.out.println(LeniarSearch(b,18,0));

        //Return index:-
        System.out.println("Return index:-"+returnIndex(b,18,0));

        int c[]={3,2,1,18,18,18,9,18};
        //if you have multiple index to return ,then return  it in ArrayList:-
       returnIndex__inArrayLiat(c,18,0);
        System.out.println(al);

        //returning a arraylist from inside the recursive function;
        System.out.println(ListReturn(c,18,0));

    }
    //check wethere the array is sorted od not:-
    public static boolean isSorted(int a[],int i){
        if(i==a.length-1){
            return true;
        }
        return a[i]<a[i+1] && isSorted(a,i+1);
    }

    //Lenisr search in array:-  Recurtion;
    static boolean LeniarSearch(int a[],int t,int i){
        if(i==a.length ){
            return false;
        }
        return a[i]==t || LeniarSearch(a,t,i+1);
    }

    //Return index:-
    static int returnIndex (int a[],int t,int i){
        if(i==a.length ){
            return -1;
        }
        if(a[i]==t){
            return i;
        }
       else{
            return  returnIndex(a,t,i+1);
        }
    }

    //Retiurn indices in ArrayList:-
    static ArrayList <Integer> al=new ArrayList<>();
    public static void returnIndex__inArrayLiat (int a[],int t,int i){
        if(i==a.length ){
            return ;
        }
        if(a[i]==t){
            al.add(i);
        }

              returnIndex__inArrayLiat(a,t,i+1);

    }

    //returning a arraylist from inside the recursive function;
    //we are adding the ans in list -- ans ;
    // and then adding the whole list ans into list
    //and then returning it;
    public static ArrayList<Integer> ListReturn (int a[],int t,int i){
        ArrayList<Integer> list=new ArrayList<>();
        if(i==a.length ){
            return list ;
        }
        if(a[i]==t){
            list.add(i);
        }

       ArrayList<Integer> ans= ListReturn(a,t,i+1);
        list.addAll(ans);
  return list;
    }
}

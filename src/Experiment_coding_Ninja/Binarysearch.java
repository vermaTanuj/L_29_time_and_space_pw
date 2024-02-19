package Experiment_coding_Ninja;
import java.util.Arrays;
import java.util.ArrayList;

public class Binarysearch {
    public static void main(String[] args) {

        ArrayList<Integer> arr=new ArrayList<>();//‘arr = { 1, 2, 3, 4, 5}
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        ArrayList<Integer> queries=new ArrayList<>();//{2,4}
        queries.add(2);
        queries.add(4);

      //  System.out.println(Arrays.toString(new ArrayList[]{searchInTheArray(arr, queries)}));

       // System.out.println(Arrays.toString(new ArrayList[]{searchInTheArray_1(arr, queries)}));
      //  System.out.println(Arrays.toString(new ArrayList[]{searchInTheArray_2(arr, queries)}));
        System.out.println(Arrays.toString(new ArrayList[]{godd(arr, queries)}));

        System.out.println(Arrays.toString(new ArrayList[]{godd_1(arr, queries)}));

    }
    public static ArrayList<Integer> searchInTheArray(ArrayList<Integer> arr, ArrayList<Integer> queries) {
        // Write your code here.
        ArrayList<Integer> al=new ArrayList<>();//ans

        int st=0;
        int end=arr.size()-1;

        int t=0;
        for(int i=0;i<queries.size();i++){
            t= queries.get(i);
        }

        while(st<=end){

           int mid=st+(end-st)/2;


            if(t<arr.get(mid)){
                end=mid-1;
            }
            else if(t>arr.get(mid)){
                st=mid+1;
            }
            else{
                int sum=0;
                for(int s=0;s<= t ;s++){
                    sum=sum+arr.get(s);
                }
                al.add(sum);
            }

        }


        return al;
    }

    //my Sol:-
    public static ArrayList<Integer> searchInTheArray_1(ArrayList<Integer> arr, ArrayList<Integer> queries){
        // Write your code here.
        ArrayList<Integer> al=new ArrayList<>();//ans
        int sum=0;

        for(int i=0;i< queries.size()-1;i++){
            for(int j=0;j<arr.size()-1;j++){
                if(queries.get(i)<=arr.get(j)){
                     sum=sum+arr.get(j);
                }
            }
            al.add(sum);
        }

        return al;
    }

    public static ArrayList<Integer> searchInTheArray_2(ArrayList<Integer> arr, ArrayList<Integer> queries){
        ArrayList<Integer> al=new ArrayList<>();//ans

        for(int i=0;i< queries.size();i++){
            int sum=0;
            //sum of arraylist arr
            sum= findSum(arr,queries.get(i));
            System.out.println("sum of "+queries.size()+" :-"+ sum);
            al.add(sum);
        }

        return al;
    }

    public static int findSum(ArrayList<Integer> arr,int t){
 int s=0;
int sum=0;
        for(int i=0;i<arr.size();i++){
           sum=0;
            if(t<=arr.get(i));
            sum= sum+arr.get(i);
        }
 s=sum;

      return s;
    }


    public static ArrayList<Integer> godd(ArrayList<Integer> arr, ArrayList<Integer> queries) {
        ArrayList<Integer> results = new ArrayList<>();

        for (int i = 0; i < queries.size(); i++) {
            int query = queries.get(i);
            int sum = 0;

            for (int j = 0; j < arr.size(); j++) {
                int element = arr.get(j);
                if (element <= query) {
                    sum += element;
                }
            }

            results.add(sum);
        }

        return results;
    }

    public static ArrayList<Integer> godd_1(ArrayList<Integer> arr, ArrayList<Integer> queries){
        ArrayList <Integer> al=new ArrayList<>();

        //taking q's:- element
        for(int i=0;i< queries.size();i++){
            int sum=0;

            //finding sum:-
            for(int j=0;j<arr.size();j++){

                if( arr.get(j) <= queries.get(i)){
                    sum=sum+arr.get(j);
                }
            }
            //adding sum in to al:-
            al.add(sum);

        }

        return al;
    }
}

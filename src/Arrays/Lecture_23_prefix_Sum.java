package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Lecture_23_prefix_Sum {
    public static void main(String[] args) {

        int a[]={1,2,3,4,5,6 };

        //prefix sum:-
        //extra space new array created:-
        System.out.println("Original array:- "+Arrays.toString((a)));
        System.out.println("Prefix_sum array:- "+Arrays.toString(pre_sum(a)));


        //prefix sum No extra space created:-
        System.out.println(Arrays.toString(pre_sum_noExtra_Space(a)));


        //optimised aproch to find sum between the array's given index:-
        //starting and ending index is given;-
        //taking queries n no fo times:-

        int b[]={1,2,3,4,5,6 };
        System.out.println(Arrays.toString((b)));
        que(b);


        //deviding the array into sub_array with equal sum:-
             int ar[]={5,3,2,6,3,1};
             int ar_2[]={15,5,6,4,8,2};
        System.out.println(array_dev(ar));
    }
    //prefix sum:-
    public static int [] pre_sum(int a[]){
        int []ans=new int [a.length];
        ans[0]=a[0];
        for(int i=1;i< a.length;i++){
            ans[i]=a[i]+ans[i-1];
        }
        return ans;
    }

    // //prefix sum No extra space created:-
    public static int[] pre_sum_noExtra_Space(int a[]){
        for(int i=1;i<a.length;i++){
            a[i]=a[i]+a[i-1];
        }
        return a;
    }

    //Generating q no of queries:-
    public static void que(int b[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of queries:-");
        int q=sc.nextInt();


        int a[]=pre_sum_noExtra_Space( b);
        while(q>0){
            if(q>0){
                System.out.println(" ");
                System.out.print("Enter 1st index :-" );
                int f=sc.nextInt();
                System.out.print("Enter 2nd index :-" );
                int s=sc.nextInt();


                if(f<a.length && s< a.length){
                    int ans=a[s-1]-a[f-1];
                    System.out.println("Pre_sum between indices "+f+" and "+ s+" is :- "+ans);
                }
                else{
                    System.out.println("index out of bound");
                }

            }
            else{
                System.out.println("No of queries should be greater than 0");
            }

            q--;
        }

    }



//deviding the array into sub_array with equal sum:-


    public static String array_dev(int a[]){
        System.out.println("Original array:- "+Arrays.toString((a)));
        String s="No";
        int pre[]=new int[a.length];
        int post[]=new int[a.length];


        //preSum;-
        pre[0]=a[0];
        for(int i=1;i<a.length;i++){
            pre[i]=a[i]+pre[i-1];
        }
        System.out.println("Pre_Sum array:- "+Arrays.toString((pre)));

        //postfixSum:-
        post[a.length-1]=a[a.length-1];
        for(int i=a.length-2;i>=0;i--){
            post[i]=a[i]+post[i+1];
        }
        System.out.println("Post_Sum array:- "+Arrays.toString((post)));

        //checking if exist or not":-
        //1st way:-
        /*
        for(int i=0;i<pre.length-1;i++){
                if(pre[i]==post[i+1]){
                    System.out.println(" index:-"+i);
                    s="Yes";
                  //  break;
                }
        }

         */
        //2st way:-

        for(int i=0;i<pre.length;i++){
            if(pre[i]*2==pre[a.length-1]){
                System.out.println("i:-"+i);
                s="yes";
            }
        }


        return s;
    }















}

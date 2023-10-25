package Searching_Kunal;

import java.util.Arrays;

public class Binary_Search__QuestionPractice_Kunal {
    public static void main(String[] args) {

        int a[]={2,4,6,8,10,12,14};

        //Seeling no:-
        System.out.println("Seeling no:- "+seelingNo(a,11));

       // floor no:-
        System.out.println("floor no:- "+floorNo(a,11));

        //letters = ["c","f","j"], target = "c"
        //leet code:-744
        char[] let={'c','f','j'};
     //   System.out.println(nextGreatestLetter(let,'c'));
        //System.out.println("nn;-"+nextGreatestLetter_1(let,'c'));

        int n[]={5,7,7,8,8,10};
        System.out.println("Ans:-"+ Arrays.toString( searchRange(n,8)));

    }
    //Seeling no:- Smallest no in the array which is just greater than the the target element;
    public static int seelingNo(int []a,int t){
         int st=0;
         int end=a.length-1;

         if(t>a[a.length-1]){
             return -1;
         }

         while(st<=end){
             int mid=st+(end-st)/2;

             if(t<a[mid]){
                 end=mid-1;
             }
             else if(t>a[mid]){
                 st=mid+1;
             }
             else{
                 return a[mid];
             }
         }
         return a[st];
    }

    public static int floorNo(int []a,int t){
        int st=0;
        int end=a.length-1;

        if(t<a[st]){
            return -1;
        }

        while(st<=end){
            int mid=st+(end-st)/2;

            if(t<a[mid]){
                end=mid-1;
            }
            else if(t>a[mid]){
                st=mid+1;
            }
            else{
                return a[mid];
            }
        }
        return a[end];
    }


    //leet code:-744
    public static char nextGreatestLetter(char[] a, char t) {
        int st=0;
        int end=a.length-1;

        while(st<=end){
            int mid=st+(end-st)/2;

            if(t<a[mid]){
                end=mid-1;
            }
            else{
                st=mid+1;
            }

        }
        return a[st % a.length];

    }

    public static char nextGreatestLetter_1(char[] a, char t) {
        int st=0;
        int end=a.length-1;
        char y='j';

        while(st<=end){
            int mid=st+(end-st)/2;

            if(t<a[mid]){
                end=mid-1;
            }
            else if(t>a[mid]){
                st=mid+1;
            }
            else{
                if(mid==a.length-1){
                    return a[0];
                }
                y=a[mid+1];
            }

        }
        return a[0];
      //  return a[st % a.length];

    }

    public static int[] searchRange(int[] ar, int t) {
        int a[]=new int [2];
        a[0]=-1;
        a[1]=-1;
        int st =0;
        int end=ar.length-1;
        if(ar.length<2){
            return a;
        }
        if(ar.length==1){
            if (t == ar[0]) {
                a[0] = 0;
                a[1] = 0;
                return a;
            }
            // return a;

        }

        while(st<=end){
            int mid=st+(end-st)/2;

            if(t<ar[mid]){
                end=mid-1;
            }
            else if(t>ar[mid]){
                st=mid+1;
            }
            else{
                int y=mid;
                a[0]=mid;
                if(ar[mid-1]==ar[mid]){
                    a[1]=mid-1;
                }
                else{
                    a[1]=mid+1;
                }
                Arrays.sort(a);
                return a;

            }

        }
        return a;
    }
    }





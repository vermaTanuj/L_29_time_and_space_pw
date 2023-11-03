package Binary_Search__pw;

import java.util.Arrays;

public class Matrix_BinarySearch__lec__51 {
    public static void main(String[] args) {

    int a[][]={{1,3,5,7},
               {10,11,16,20},
               {23,30,34,60}};


        int t=3;
        System.out.println(Arrays.toString(bs_Matrix(a,t)));


        int b[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(Arrays.toString(bs_Matrix(b,3)));
        System.out.println(binarySearch(b,3));
        System.out.println("jj");
    }




    //Binary Search on matrix:-
    public static int[] bs_Matrix(int a[][],int t){
        int ans[]={-1,-1};

        int r=0;
        int c=a[0].length-1;

        while(r<a.length && c>0){
            if(t == a[r][c]){
                ans[0]=r;
                ans[1]=c;
                break;
            }
            else if(a[r][c]<t){
                r++;
            }
            else{
                // a[r][c] > t :-
                c--;
            }
        }
        return ans;
    }

    //Binary Search in 2dArray Time:-log(m*n)
    public static boolean binarySearch(int a[][],int t){
        boolean rr=false;
        int r=a.length; //rows
        int c=a[0].length;//coll

        int st=0;
        int end=r*c-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            int midele=a[mid / c][mid % c];
            if(t==midele){
                rr=true;
                break;
            }
            else if (midele >  t) {
                end=mid-1;
            }
            else{
                //a[mid/c][mid%c]<t :-
                st=mid+1;
            }
        }
        return rr;
    }
}

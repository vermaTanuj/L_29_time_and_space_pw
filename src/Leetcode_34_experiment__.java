import java.util.Arrays;
public class Leetcode_34_experiment__ {
    public static void main(String[] args) {

        int arr[]={5,7,7,8,8,10};
        int []arr1={5,7,7,8,8,10};
        Solution a=new Solution();

 int y[]=a.searchRange(arr,7);
        System.out.println("Ans:-"+Arrays.toString(y));


    }
}


class Solution {
    public int[] searchRange(int[] ar, int t) {
        int b[]=new int[2];

        if(ar.length==0){
            b[0]=-1;
            b[1]=-1;
            return b;
        }

        b[0]=firstIndex( ar, t);
        b[1]=lastIndex(ar,  t);


        return b;
    }
    public int firstIndex(int[] a, int t){
        int st =0;
        int end=a.length-1;
        int i=-1;
        while(st<=end){
            int mid=st+(end-st)/2;

            if(t<a[mid]){
                end=mid-1;
            }
            else if(t>a[mid]){
                st=mid+1;
            }
            else{
                i=mid;
                end=mid-1;
            }
        }
        return i;
    }
    public int lastIndex(int[] a, int t){
        int st =0;
        int end=a.length-1;
        int i=-1;
        while(st<=end){
            int mid=st+(end-st)/2;

            if(t<a[mid]){
                end=mid-1;
            }
            else if(t>a[mid]){
                st=mid+1;
            }
            else{
                i= mid;
                st=mid+1;
            }
        }
        return i;
    }


}


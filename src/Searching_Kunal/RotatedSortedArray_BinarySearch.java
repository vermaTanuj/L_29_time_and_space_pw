package Searching_Kunal;

public class RotatedSortedArray_BinarySearch {
    public static void main(String[] args) {
        int a[]={4,5,6,7,0,1,2};
        int[]b={5,1,3};
        int t=0;
        //it means that the array is rotated by k th term;
        System.out.println(searchInRotatedSortedArray(a,0));
        System.out.println("lll");
    }
    public static int searchInRotatedSortedArray(int []a,int t){
        //finding pivot:-
        //peak in array:-
        if(a.length==0){
            return -1;
        }
        int st=0;
        int end=a.length-1;
        int pivot=-1;
        while(st<end) {
            int mid = st + (end - st) / 2;

            if(a[mid]<a[mid+1]){
                //Assending order;
                st=mid+1;
            }
            else{
                //(a[mid]>a[mid+1]):-  Desending order;
                end=mid;
            }
            pivot=st;
        }

        //searching in first part:-
        int first=binarySearchInRange(a,t,0,pivot);
        System.out.println("first:-  "+first);
        if(first== -1){
            System.out.println("jj");
            int second=binarySearchInRange(a,t,pivot,a.length-1);
            System.out.println("second:- "+second);
            return second;
        }
return first;
    }

    //Binary Search in range:-
    public static int binarySearchInRange(int []a,int t,int st,int end){

        while(st<=end){
            int mid=st+(end-st)/2;
            if(t<a[mid]){
                end=mid-1;
            }
            else if(t>a[mid]){
                st=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}

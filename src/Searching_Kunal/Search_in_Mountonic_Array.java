package Searching_Kunal;

public class Search_in_Mountonic_Array {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,3,2,1};
        int t=3;
/*
        //Aproach:-

        1 > find peak element
        2 > search in first part. in assending part .. if not found than
        3 > search in desond part
         */

        System.out.println(findTarget(a,t));

    }

    public static int findTarget(int []a,int t){
        int peak=peskElement(a);
        int first=binarySearch(a,t,0,peak);
        if(first != -1){
          return first;
        }
        return orderAgnosticBinarySearch(a,t,peak+1,a.length-1);
    }

    //prakElement:-
    public static int peskElement(int []a){
        int st=0;
        int end=a.length-1;
        while(st<end){
            int mid=st+(end-st)/2;

            //Assending part
            if(a[mid]<a[mid+1]){
                st=mid+1;
            }
            else{
               // (a[mid]<a[mid+1]):- Desending part;
                end=mid;
            }
        }
        return st;
    }

    //Binary Search in given position;
    public static int binarySearch( int []a,int t,int st,int end){
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

    //OrderAgnostic Binary search:-
    //orderless BinarySearch;
    public static int orderAgnosticBinarySearch(int []a,int t,int st,int end){

        boolean ass=a[0]<a[a.length-1];

        while(st<=end){
            int mid=st+(end-st)/2;

            if(ass==true){

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
            else{
                if(t<a[mid]){
                    st=mid+1;
                }
                else if(t>a[mid]){
                    end=mid-1;
                }
                else{
                    return mid;
                }

            }

        }
        return -1;
    }

}





















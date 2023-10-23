package Searching_Kunal;

public class Binary_Search__1 {
    public static void main(String[] args) {

        int a[]={-4,-3,-2,-1,0,1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(a,5));


        //binarySearch in dwsending order;-
        int b[]={100,90,80,70,60,50,40,30,20,10,0};
        System.out.println(desendingBinarySearch(b,20));

        //Order agnostic binary search :- if we dont know the assending or desending order of binary search
        System.out.println(orderAgnosticBinarySearch(b,30));
    }

    //Binary search code
    public static int binarySearch(int a[],int t){

        int st=0;
        int end=a.length-1;

        while(st<=end){

            //Calculating mid
            int mid= st+(end-st)/2;

            if(t<a[mid]){
                end=mid-1;
            }
            else if(t>a[mid]){
                st=mid+1;
            }
            else{
                //t=a[mid]
                return mid;
            }
        }
        return -1;
    }

    //binary search in decending order:-
    public static int desendingBinarySearch(int a[],int t){

        int st=0;
        int end=a.length-1;

        while(st<=end){

            int mid=st+(end-st)/2;

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
        return -1;
    }

    //Order agnostic binary search
    public static int orderAgnosticBinarySearch(int a[],int t){
        int st =0;
        int end=a.length-1;

        while(st<=end){
            int mid= st + (end-st)/2;

            //Checking order of array
            boolean ass = a[st] < a[end];

            if(ass == true){
                if(t<a[mid]){
                    end=mid-1;
                }
                else if(t>a[mid]){
                    st=mid+1;
                }
                else{
                    //t=a[mid]
                    return mid;
                }
            }

            else {
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

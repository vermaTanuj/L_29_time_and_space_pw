package Searching_Kunal;

public class Mountain_in_array {
    public static void main(String[] args) {
        int a[]={1,2,3,4,3,2,1};
        System.out.println(mountainInArray(a));
        //
        //Search in Mountainic array:=


    }
    //write a fumction to find mountain in array;-
    public static int mountainInArray(int a[]){
        int st=0;
        int end=a.length-1;

        while(st<end) {
            int mid = st + (end - st) / 2;

            if (a[mid] > a[mid + 1]) {
                //you are present in desending part:-
                end = mid;
            } else {
                //   a[mid]>a[mid+1]
                //you are present in assending part:-
                st = mid +1;
            }
        }
        return st;
    }
}

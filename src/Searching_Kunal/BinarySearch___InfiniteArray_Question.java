package Searching_Kunal;

public class BinarySearch___InfiniteArray_Question {
    public static void main(String[] args) {
        int a[]={2,3,5,6,7,8,10,12,15,20,23,30};
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170,180};
     //   System.out.println(ans(a,10));:-Does not know why not works;
        System.out.println(ans(arr,10));
    }

    public static int ans(int []a,int t){
        //first scope;- 2 Length;
        int st=0;
        int end=1;

        //searching condition:-
      //  searching will happen until the target is less than a[mid]
        while(t>a[end]){
            //doubling the scope every time
            int temp = end + 1;
            end= end+(end-st+1)*2;
            /*
            Explaning the newEnd formulla:-

          end= end+(end-st+1)*2;

           end+  -->for increasing the indexahed from old end
           (end - st +1)  --> for gop and +1 because one number gets ingulfed in it
           *2   --> for doubling the gap;
             */
            st=temp;
        }
          return binarySearch(a,t,st,end);
    }

    //BinarySearch:-
    public static int binarySearch(int a[],int t,int st,int end){
       // int st=0;
       // int end=a.length-1;

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
}

package Searching_Kunal;

public class Binary_Search__QuestionPractice_Kunal {
    public static void main(String[] args) {

        int a[]={2,4,6,8,10,12,14};

        //Seeling no:-
        System.out.println("Seeling no:- "+seelingNo(a,9));

       // floor no:-
        System.out.println("floor no:- "+floorNo(a,9));

    }
    //Seeling no:- Smallest no in the array which is just greater than the the target element;
    public static int seelingNo(int []a,int t){
         int st=0;
         int end=a.length-1;

         if(t>a[a.length]){
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
}

package Binary_Search__pw;

public class Lec_50__Rotated_Sorted_Array {
    public static void main(String[] args) {
        int a[]={5,6,7,8,9,10,1,2,3,4};
        System.out.println(bsIn_Min(a));
        int b[]={5,6,7,8,9,10,1};
        System.out.println(bsIn_Min(b));

        int c[]={3,4,5,1,2};
        int t=4;
        System.out.println(find_Target(c,t));

        int []d={0,0,0,1,1,1,2,0,0};
        System.out.println("lll"+find_Target(d,2));

        int e[]={1,1,1,1,1,1,2,3,1,1};
        System.out.println(find_Target(e,2));

    }

    //find minimum in rotated sorted array Binary seatrch:-
    public static int bsIn_Min(int a[]){
        int st=0;int end= a.length-1;
        int ans=-1;
        while(st<=end){
            int mid=st+(end-st)/2;

            if(a[a.length-1]<a[mid]){
                // You are in first part:-  Go to second part
                st=mid+1;
            }
            else {
                //// You are in 2nd part:- Reduce the search space;:- Ans is hear
                //   a[a.length-1]>=a[mid]:-
                ans=mid;
                end=mid-1;
            }

        }
        return ans;
    }

    public static int find_Target(int []a,int t){
        int st=0;int end=a.length-1;

        int pivot=bsIn_Min(a);

        int first=binarySearch_With_Index(a,t,0,pivot-1);
        if(first > -1){
            return first;
        }
        else{
            return binarySearch_With_Index(a,t,pivot,a.length-1);
        }

    }

    //binary search with index:-
    public static int binarySearch_With_Index(int a[],int t,int st,int end){
      while (st<=end){
          int mid=st+(end-st)/2;
          if(a[mid]>t){
              end=mid-1;
          }
          else if(a[mid]<t){
              st=mid+1;
          }
          else{
              return mid;
          }
      }
      return -1;
    }
}

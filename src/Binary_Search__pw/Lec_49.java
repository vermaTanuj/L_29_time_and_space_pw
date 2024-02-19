package Binary_Search__pw;

public class Lec_49 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int []b={2,5,5,5,6,6,8,9,9,9};

        System.out.println(bsRecurtion(a,8,0,a.length-1));
        System.out.println(bs(b,5));
        System.out.println(square_root(12));
    }

    //Binary Search Recursive Aprosch:-
    public static int bsRecurtion(int a[], int t, int st, int end) {

        // Base case;-
        if (st <=  end) {
            int mid = st + (end - st) / 2;

            if (t == a[mid]) {
                return mid;
            } else if (t < a[mid]) {
                return bsRecurtion(a, t, st, mid - 1);
            } else {
                return bsRecurtion(a, t, mid + 1, end);
            }
        }

        return -1;
    }

    //binary search :- itteration;
    //first occurence:-
    public static int bs(int a[],int t){
        int st=0;int end=a.length-1;
  int i=-1;
        while(st<=end){
             int mid=st+(end-st)/2;

             if(a[mid]==t){
                 i=mid;
                 end=mid-1;
             }
             else if(t<a[mid]){
                 end=mid-1;
             }
             else{
                 st=mid+1;
             }
        }
        return i;
    }

    //Square Root:-
    public static int square_root(int n){
        int st=0;
        int end=n;
        int ans=-1;

        while(st<=end){
            int mid=st+(end-st)/2;

            int v = mid * mid;

            if(v < n){
                ans=mid;
                st=mid+1;
            }
            else if(v > n){
                end=mid-1;
            }
            else {return mid;}
        }
        return ans;
    }


}

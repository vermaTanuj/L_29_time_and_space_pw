import java.util.*;
public class GFG_experiment__ {
    public static void main(String[] args) {

    }
}

class Solution__o{
    public ArrayList<Integer> firstAndLast(int arr[], int n, int x) {
        // Code here
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(-1);


        if (arr.length == 0) {
            return al;
        }
        al.set(0, firstOcc(arr, x));
        al.set(1, lastOcc(arr, x));

        return al;

    }

    public int firstOcc(int a[], int t) {
        int st = 0;
        int end = a.length - 1;
        int i = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (t < a[mid]) {
                end = mid - 1;
            } else if (t > a[mid]) {
                st = mid + 1;
            } else {
                i = mid;
                end = mid - 1;
            }

        }
        return i;

    }

    public int lastOcc(int a[], int t) {
        int st = 0;
        int end = a.length - 1;
        int i = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (t < a[mid]) {
                end = mid - 1;
            } else if (t > a[mid]) {
                st = mid + 1;
            } else {
                i = mid;
                st = mid + 1;
            }

        }
        return i;
    }

}
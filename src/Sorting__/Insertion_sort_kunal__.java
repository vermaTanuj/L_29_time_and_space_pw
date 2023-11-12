package Sorting__;
import java.util.Arrays;

public class Insertion_sort_kunal__ {
    public static void main(String[] args) {
        int a[]={5,3,4,1,2};
        insertion_sort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void insertion_sort(int a[]){
        for(int i=0;i< a.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(a[j]<a[j-1]){
                    swap(a,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }

    public static void swap(int a[],int f,int s){
        int t=a[f];
        a[f]=a[s];
        a[s]=t;
    }
}

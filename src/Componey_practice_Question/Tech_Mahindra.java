package Componey_practice_Question;

import java.util.Arrays;
//package Componey_practice_Question;

public class Tech_Mahindra {
    public static void main(String[] args) {
        int []a={1,3,5,6,9,10,14,17};
        System.out.println(sumEnd( a,5));

        int []ar={1,3,5,6,9,10,14,17,-1,-2,-4};
        System.out.println(Arrays.toString(ar));
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
    }
    public static int  sumEnd(int a[],int p){
        int res=0;
        for(int i=p;i<a.length;i++){
            res=res+(a[i]-a[i-1]);
        }
        return res;
    }
}

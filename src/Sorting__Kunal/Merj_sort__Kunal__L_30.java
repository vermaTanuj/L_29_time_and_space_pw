package Sorting__Kunal;
import java.util.Arrays;

public class Merj_sort__Kunal__L_30 {
    public static void main(String[] args) {

        int a[]={9,8,7,6,5,2,3,2,1};
      int ans[]= merjSort(a);
        System.out.println(Arrays.toString(ans));

    }
    //Merj Sort:-
    public static int[] merjSort(int a[]){
        if(a.length==1  || a.length==0){
            return a;
       }
        int mid= a.length/2;

        int first[]=merjSort(Arrays.copyOfRange(a,0,mid));  // mid is excluded;
        int second[]=merjSort(Arrays.copyOfRange(a,mid,a.length));

        return murg(first,second);
    }

    public static int [] murg(int first[],int second[]){
        int mix[]=new int [first.length + second.length];

        int i=0;  //operates on first
        int j=0;  //oprates on second
        int k=0;  //operates on mix


        //merjing the arrays:-
        while(i< first.length && j< second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
                k++;
            }
            else{
                //first[i] > second[j]
                mix[k]=second[j];
                j++;
                k++;
            }
        }

        //filling the rest element:-

        //if frrst array left:-
        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }

        while(j< second.length){
            mix[k]=second[j];
            j++;
            k++;
        }

        return mix;
    }
}

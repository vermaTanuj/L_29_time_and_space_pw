package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class QuestionS {
    public static void main(String[] args) {
        int a[]={2 ,3, 1, 6, 3, 6, 2};
        int b[]={1,1,2,2,4,4,3};
        System.out.println(findUique_1(b));

    }
    public static int findUique(int a[]){
        Arrays.sort(a);
        int rr=0;
        System.out.println(Arrays.toString(a));
        for(int i=0;i<a.length-2;i++){
            if(a[i+1]==a[i]||a[i+2]==a[i+1]){

            }
            else {

            }
        }
        return 0;
    }

    public static int findUique_1(int a[]){
        Arrays.sort(a);

       int []freq=new int[a[a.length-1]+1];
       for(int i=0;i<a.length;i++){
           freq[a[i]]++;
       }
        System.out.println(Arrays.toString(freq));

     for(int i=0;i<freq.length;i++){
         if(freq[i]==1){
             return i;
         }
     }
     return -1;
    }


}

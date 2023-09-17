package Arrays;
import java.util.Arrays;
public class Lecture_20__Targeted_Sum {
    public static void main(String[] args) {

        //Find the total no of pairs in the array whose sum is equal to given value or x:-
        int arr[]={4,6,3,5,8,2};
       // pair_equalTo_X( arr, 7);
        System.out.println("no of pair in array:--"+Arrays.toString(arr)+" is :-- "+ pair_equalTo_X( arr, 7));


        //count the no of triplets whose no is equal to x
        int arr1[]={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("no of triplets in array:--"+Arrays.toString(arr1)+" is :-- "+  triplet_equal_to_x(arr1, 21));

        //in a array there is one unique value every value is repeated toice find the unique one:-
        int arr2[]={1,2,3,3,2,1,4};
       // System.out.println("unique in array:--"+Arrays.toString(arr2)+" is :-- "+  uniqueElement_In_Array(arr2));

        //Find second largest element in array:-
        int arr3[]={-1,-2,-3,-4,-5,-6,0};
        System.out.println("second largest element in  array:--"+Arrays.toString(arr3)+" is :-- "+  second_Largest_Element(arr3));

        //Return first repeated array:-
        System.out.println(" first repeated element in  array:--"+Arrays.toString(arr2)+" is :-- "+  firstReprtedValue(arr2));

    }


    //pair sum;-
    public static int pair_equalTo_X(int a[],int t){
        int c=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==t){
                    c++;
                    //System.out.println("i:-"+a[i]+"j;-"+a[j]);
                }
            }
        }

        return c;
    }

//triplet sum:-
    public static int triplet_equal_to_x(int a[],int t){
        int c=0;
        for(int i=0;i<a.length-2;i++){
            for(int j=i+1;j<a.length-1;j++){
                for(int k=j+1;k<a.length;k++){
                    if(a[i]+a[j]+a[k]==t) {
                        c++;
                        System.out.println("i:-" + a[i] + "j;-" + a[j] + "k;-" + a[k] + "");
                    }
                }
            }
        }
        return c;
    }

    //Unique in array:-
    public static int uniqueElement_In_Array(int []a) {
        for (int i = 0; i < a.length - 1; i++) {
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    a[i]=-1;
                    a[j]=-1;
                }
            }

        }
        System.out.println(Arrays.toString(a));
        for(int i=0;i<a.length;i++){
            if(a[i]!= -1){
                return a[i];
            }
        }
        return 0;
    }

    //second largest element:-
    public static int second_Largest_Element(int []a){
        int max=Integer.MIN_VALUE;
//finding max element:-
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        //making max 0;
        for(int i=0;i<a.length;i++){
            if(a[i]==max){
                a[i]=Integer.MIN_VALUE;
            }
        }
        //Second max:-
        int second_max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>second_max){
                second_max=a[i];
            }
        }

return second_max;
    }


//Return first repeated array:-
    public static int firstReprtedValue(int []a){
        int repeted=-1;

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                  return a[i];
                }
            }
        }

        return repeted;
    }


}

package Arrays;

import java.util.Arrays;
public class Lecture_22_Two_pointers {
    public static void main(String[] args) {

<<<<<<< HEAD
        //sort Arrar{1,0,0,1,0,1,1,0,0};
        int a[]={1,0,0,1,0,1,1,0,0,0,0};
        sort(a);
        sort_1(a);

        //using 2 pointer aproch
     //   sort_2(a);
        int b[]={1,0,1,0,1,0};
        sort_2(b);
=======
        //sort
        //Arrar{1,0,0,1,0,1,1,0,0};
        int a[]={1,0,0,1,0,1,1,0,0,0,0};
        //sort(a);
        //sort_1(a);
        //using 2 pointer aproch
     //   sort_2(a);
        int b[]={1,0,1,0,1,0};
      //  sort_2(b);
>>>>>>> origin/main

        //given a array put all even no in begining and all odd no at the end;
        int []arr={-600,-100,1,2,3,4,5,6,7,8,9,10};
        System.out.println("kk"+Arrays.toString(arr));
<<<<<<< HEAD
       even_odd(arr);

       //Assending array ;-
        //return a array:with squares of element in assending order:-
=======
      // even_odd(arr);

>>>>>>> origin/main
assend_sq(arr);


    }


    //countins 0 and and 1 and then filling them 0:- from start 1 from :- end
    public static void sort_1(int a[]) {
        int c0=0;
        int c1=0;
        //counting 0 and 1 :-
    for(int i=0;i<a.length;i++){
        if(a[i]==0){
            c0++;
        }
        if(a[i]==1){
            c1++;
        }
        }
        System.out.println("no for c_0=="+c0+" no for c_1=="+c1);
    //filling 0 and 1:-
        int p=0;
        int j=a.length-1;
        int []anss=new int[a.length];
        System.out.println(Arrays.toString(anss));
      for(int i=0;i< a.length;i++){
          if(i<c0){
              anss[i]=0;
          }
         else{
              anss[i]=1;
          }
      }

        System.out.println(Arrays.toString(anss));
    }


    //Sorting array of 0 and 1 :-
    public static void sort(int a[]){
        int j=a.length-1;
        int p=0;
        int ans[]=new int [a.length];
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                ans[p++]=a[i];
            }
       else{
                ans[j--]=a[i];
            }
        }
        System.out.println(Arrays.toString(ans));
    }

    //Sorting array of 0 and 1 :-
    //usinng 2 pointer aproch;
    public static void sort_2(int a[]){
        int left=0;
        int right=a.length-1;

        while(left < right ){
            if(a[left]==1 && a[right]==0){
                //swap:-
                int temp=a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
                right--;
            }

            if(a[left]==0){
                left++;
            }
            if(a[right]==1){
                right--;
            }
        }
        System.out.println("iii:-"+Arrays.toString(a));
    }



    //given a array put all even no in begining and all odd no at the end;
    public  static void even_odd(int a[]){
        int left=0;
        int right=a.length-1;

        while(left<=right){

            if(a[left]%2 != 0 && a[right]%2 ==0){

                //swap;-
                int temp=a[left];
                a[left]=a[right];
                a[right]=temp;

                left++;
                right--;
            }

            if(a[left]%2 == 0){
                left++;

            }
            if(a[right]%2 != 0){
                right--;

            }
        }
        System.out.println("ANS :-"+Arrays.toString(a));

    }


<<<<<<< HEAD


    //Assending array ;-
    //return a array:with squares of element in assending order:-

=======
>>>>>>> origin/main
    public static void assend_sq(int a[]){

        //Squaring;-
        for(int i=0;i<a.length;i++){
            a[i]=a[i]*a[i];
        }
        System.out.println("fff:-"+Arrays.toString(a));

        //Assending order
        int left=0;
        int right =a.length-1;
      /*  while(left<right){
            if(a[left] > a[right]){
                //swap:-
                int temp=a[left];
                a[left]=a[right];
                a[right]=temp;

                left++;
                right--;
            }
            if(a[left]<a[right] ){
                left++;
            }
            if(a[right]>a[left]){
                right--;
            }
        }
       */

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    //swap:-
                    int temp=a[i];
                   a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("fff:-"+Arrays.toString(a));
    }

}

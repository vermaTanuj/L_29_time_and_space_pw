package Recurtion__Kunal;

public class Lec__23__Basics {
    public static void main(String[] args) {

        //Make a function that prints 1 to 10:=
       // print_1(1);
       // for(int i=1;i<10;i++) {
          // System.out.println(fibonachi_No(45));
       // }
 //printNos(10);

        //Binart Search;-
        /*int a[]={1,2,3,4,5,6,7,8,9};
        System.out.println();
        System.out.println(bs(a,9,0,a.length-1));

         */

        for(int i=0;i<50;i++){
            String h=Integer.toString(fibo_formula(i));
            System.out.print( h+" ");
        }

    }
    public static void print_1(int a){
        if(a>10){
            return;
        }
        print_1(++a);
        System.out.println(a);
         // print_1(++a);
    }

    //Fibonachi no:-
    public static int fibonachi_No(int n) {
        if (n == 1) {
            return 0;
        }
        if(n==2){
            return 1;
        }
        return fibonachi_No(n - 2) + fibonachi_No(n - 1);
    }

        //fibonachi _by loop:-
        public static void printNos(int n)
        {
            //Your code heres
            //  system.out.println(n);
            if(n==0){

                return;
            }
            // System.out.println(n);
            printNos(n-1);
            System.out.print(n+" ");
          //  printNos(--n);
        }

        //BinarySearch:-
    public static int bs(int a[],int t,int st,int end){
       // int mid=st+end/2;
        if(st<=end){
            int mid=st+end-st/2;
        if(a[mid]==t){
            return mid;
        }
        else if (a[mid]<t) {
            return bs(a,t,mid+1,end);
        }
        else{
            return bs(a,t,st,mid-1);
        }
        }
        return -1;
    }

    //Fibonachi no formula:-
    public static int fibo_formula(int n){
        return (int) ((Math.pow(((1+Math.sqrt(5))/2),n) - Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
    }

 
   
}

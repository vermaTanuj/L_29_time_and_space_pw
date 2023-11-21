package Recurtion__Kunal;

public class patterns_kunal_L__29 {
    public static void main(String[] args) {

        /*
         ****
         ***
         **
         *

         */
        pattern_1(4);
        pattern_1__rec(4,0);

    }
    //Patern 1 loop:-
    public static void pattern_1(int n){
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern_1__rec(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("x");
            pattern_1__rec(r,c+1);
        }

       else{
            System.out.println();
            pattern_1__rec(r-1,0);
        }
    }
}

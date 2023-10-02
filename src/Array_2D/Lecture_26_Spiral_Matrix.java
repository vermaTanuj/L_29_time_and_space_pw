package Array_2D;

public class Lecture_26_Spiral_Matrix {
    public static void main(String[] args) {

        //array example:-
        int a[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        int b[][]={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};

        //Class oob initialising:-
        method m1=new method();
        System.out.println("Original matrix:-");
        m1.print(a);

        //spiral order matrix:-
        System.out.println("spiral order matrix:-");
       m1.print_Spiral_Matrix(a,5,5)  ;
        System.out.println();

        System.out.println("Original matrix:-");
        m1.print(b);
       m1.print_Spiral_Matrix(b,4,3);

    }
}
 class method{

    //printing spiral matrix:-
     public void print_Spiral_Matrix(int [][]a,int r,int c){
         int topRow=0;
         int bottomRow=r-1;
         int leftColl=0;
         int rightColl=c-1;
        int totalElement=0;

         while(totalElement < r*c){

             //TpoRow:-  leftcoll to rightcoll
             for(int j= leftColl ;j <= rightColl && totalElement < r*c ; j++) {
                 System.out.print(a[topRow][j] + " ");
                 totalElement++;
             }
                 topRow++;


             //rightColl:- toprow to bottomRow
             for(int i= topRow ; i <= bottomRow && totalElement < r*c ; i++) {
                 System.out.print(a[i][rightColl] + " ");
                 totalElement++;
             }
                 rightColl--;


             //bottomRow:- roghtcoll to leftcoll
             for(int j= rightColl ; j>=leftColl && totalElement < r*c; j--) {
                 System.out.print(a[bottomRow][j] + " ");
                 totalElement++;
             }
                 bottomRow--;


             //leftColl:- bottomRow to topRow
             for(int  i = bottomRow ; i >= topRow && totalElement < r*c ;i-- ) {
                 System.out.print(a[i][leftColl] + " ");
                 totalElement++;
             }
                 leftColl++;


         }

     }

    public  void print(int a[][]){
        // System.out.println("Printing array :-");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}

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

       //Generating spiral matrix:-
        //value putting in spiral:-
        System.out.println();
        System.out.println("Generating spiral matrix:-");
          m1.print(m1.generatingSpiralMatrix(4));
          
          //printing matrix spirally in antiClock direction:-
        System.out.println("Original matrix:-");
        m1.print(a);
        System.out.println("printing matrix spirally in antiClock direction:-");
     m1.spiralAntyClockMatrixPrinting(a,5,5);

        System.out.println("Original matrix:-");
        m1.print(b);
        m1.spiralAntyClockMatrixPrinting(b,4,3);
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


     public int [][] generatingSpiralMatrix(int n){
         int tr=0,br=n-1,rc=n-1,lc=0;
         int v=0;                     //value

         //new array:=-
         int ans[][]=new int [n][n];

         while(v<n*n){

             // tr= lc to rc
             for(int j=lc;j<=rc;j++){
                  ans[tr][j]=v++;
             }
             tr++;

             //rc=tr to br
             for(int i=tr;i<=br;i++){
                 ans[i][rc]=v++;
             }
             rc--;

             //br= rc to lc
             for(int j=rc;j>=lc;j--){
                 ans[br][j]=v++;
             }
             br--;

             //lc=br to tr
             for(int i=br;i>=tr;i--){
                 ans[i][lc]=v++;
             }
             lc++;


         }
         return ans;

     }
     
     // //printing matrix spirally in antiClock direction:-
     public void spiralAntyClockMatrixPrinting(int a[][],int r,int c){
         int tr=0,br=r-1,rc=c-1,lc=0;
         int te=0;

         while(te<r*c){

             //lc=tr to br
             for(int i=tr;i<=br&&te<r*c;i++){

                     System.out.print(a[i][lc] + " ");
                 te++;
             }
             lc++;
             //br=lc to rc
             for(int j=lc;j<=rc&&te<r*c;j++){

                     System.out.print(a[br][j] + " ");
                 te++;
             }
             br--;
             //rc=br to tr
             for(int i=br;i>=tr&&te<r*c;i--){

                     System.out.print(a[i][rc] + " ");
                 te++;
             }
             rc--;

             // tr=rc to lc
             for(int j=rc;j>=lc&&te<r*c;j--){

                     System.out.print(a[tr][j] + " ");
                 te++;
             }
             tr++;
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



































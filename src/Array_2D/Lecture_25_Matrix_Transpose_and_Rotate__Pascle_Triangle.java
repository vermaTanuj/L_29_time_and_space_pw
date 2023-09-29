package Array_2D;

public class Lecture_25_Matrix_Transpose_and_Rotate__Pascle_Triangle {
    public static void main(String[] args) {

        int a[][]={{1,2,3},{3,4,5},{6,7,8}};
        int b[][]={{1,2,3},{3,4,5}};

        //class calling:=
        methods a1=new methods();

        //transpose of matrix in another array:-
        System.out.println("Original array:-" );
        a1.print(b);
        System.out.println("transpose of matrix in another array:-");
        a1.print( a1.transpose(b,2,3));

        //transpose of matrix In_Place:-
        System.out.println("Original array:-" );
        a1.print(a);
        System.out.println("transpose of matrix In_Place:-");
        a1.print( a1.transpose_In_Place(a,3,3));

        //rotating the array by 90_digree:-
        System.out.println("Original array:-" );
        a1.print(a);
        System.out.println("rotated array by 90 digree:-");
       a1.print( a1.rotate_90(a));

    }
}

class methods{
    //transppse of matrix:-
    public  int [][] transpose(int a[][],int r,int c){
        int tra[][]=new int [c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                tra[i][j]=a[j][i];
            }
        }
        return tra;
    }

    //transpose of matrix in_place :-
    //this method has a draw back we can only find the transpose of square matrix;-
    public  int [][] transpose_In_Place(int [][]a,int r,int c){

        for(int i=0;i<c;i++){
            for (int j = i; j < r; j++) {
                //swaping:-
                int t=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=t;

            }
        }
        return a;
    }

    // Rotating the array by 90 digree:-
      /*steps:-
        1 :- find transpose of given array;
        2 :- reverse each of the array of tranposed matrix
       */
    public int [][] rotate_90(int a[][]){
        int [][] b=transpose(a,3,3);  //method written earlier 3,3 to fulfil the parameters

        //printing the transpose array:-
        System.out.println("the transpose array:-");
        print(b);
        System.out.println();

        //reversing each array;-
        for(int i=0;i<a.length;i++){
            rev(a[i]);
        }


        return a;
    }

    //reversing the array in place:-
    public int [] rev(int a[]){
        int i=0;
        int j=a.length-1;
        while(i<j){
            int t=a[i];
            a[i]=a[j];
            a[j]=t;
            i++;j--;
        }
        return a;
    }



    //print:-
    //printing 2d arrray:-
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
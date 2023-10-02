package Array_2D;

import java.util.Scanner;

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

       //Pascle Triangle:-
        Scanner sc=new Scanner(System.in);
        System.out.print("Pascle Triangle upto:-");
        int n=sc.nextInt();
        a1.print(a1.pascleTriangle(n));

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
        //transpose:-
        tra(a);

     //   printing the transpose array:-
        System.out.println("the transpose array:-");
        print(a);
        System.out.println();

        //reversing each array;-
        for(int i=0;i<a.length;i++){
            rev(a[i]);
        }


        return a;
    }
    //transpose of  array helper method for rotate 90:-
    public void tra(int a[][]){
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                //swaping:-
                int t=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=t;
            }
        }
    }

    //reversing the array in place:-
    public void rev(int a[]){
        int i=0;
        int j=a.length-1;
        while(i<j){
            int t=a[i];
            a[i]=a[j];
            a[j]=t;
            i++;j--;
        }

    }

    //pascle triangle:-
    /*
    roles:-
    1. every element is sum of previous 2 elements;  pasc[i][j]=pasc[i-1][j]+pasc[i-1][j-1];
    2. first and last element is always 1;
    3. it is jagged arrays;
     */
    public int [][] pascleTriangle(int n){
        int [][]pasc=new int [n][];

        //
        for(int i=0;i<n;i++){
            //it is jagged array so to create column at ren time:-
            pasc[i]=new int [i+1];           //it is jagged arrays; no of collumn in every row is  one more than row 0:-1,2:-2,2:-3

            pasc[i][0]=1;
            pasc[i][i]=1;       //first and last element is always 1;

            //sum:-
            for(int j=1;j<i;j++){
                pasc[i][j]=pasc[i-1][j]+pasc[i-1][j-1];
            }
        }
        return pasc;
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
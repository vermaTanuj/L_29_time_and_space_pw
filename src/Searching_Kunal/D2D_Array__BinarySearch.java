package Searching_Kunal;

import java.util.Arrays;
public class D2D_Array__BinarySearch {
    public static void main(String[] args) {
        int a[][]={{1,2,3},
                   {4,5,6},
                   {7,8,9}};
        int [][]b={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16,17,18,19,20,23}};

        int[][] matrix = {
                {1, 4, 7, 11},
                {2, 5, 8, 12},
                {3, 6, 9, 16},
                {10, 13, 14, 17}
        };

        //searching  in 2d array Leniar search:-
        System.out.println(leniar_in_2D(a,0));

        System.out.println(Arrays.toString(binary_Search_in_Matrix(a,9)));

        System.out.println(Arrays.toString(binary_Search_in_Matrix(matrix,12)));
    }
    //Leniar search in 2d Array:-
    public static String leniar_in_2D(int [][]a,int t){
        String rr="no";
      for(int i=0;i<a.length;i++){
          for(int j=0;j<a[i].length;j++){
              if(t==a[i][j]){
                  rr="YES";
              }
          }
      }
      return rr;
    }



    public static int [] binary_Search_in_Matrix(int a[][],int t){
        int r=0;                 //row == horisantal;
        int c=a[0].length-1;     //coll== vertical;

        while(r < a.length && c >= 0){

            if ( t == a[r][c]){
                return new int[]{r,c};
            }
            else if(t > a[r][c]){
                r++;
                //row is ignored because :-
               // if t is bigger than a[0][3] it is bigger than whole row so ignore that row;
            }
            else{
                //(t < a[r][c]):-
                c--;
                // if t is smaller than a[0][3] it is smaller than whole collumn;
            }
        }
        return new int []{-1,-1};
    }
}

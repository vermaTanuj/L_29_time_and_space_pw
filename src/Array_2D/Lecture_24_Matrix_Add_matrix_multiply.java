package Array_2D;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Lecture_24_Matrix_Add_matrix_multiply {
    public static void main(String[] args) {




Scanner sc=new Scanner(System.in);
        System.out.print("if you want to Add write add for Multiply write mul:-");
String s=sc.next();
String u=s.trim().toLowerCase();
if(u.equals("add")){
    //adding matrix:-
    System.out.println("Add");
    add_formate_Helper();
}
if(u.equals("mul")){
    System.out.println("Multiply");
    //multiplying matrix:-
    multiply_formate_Helper();

}



    }
    //taking input in 2D Array:-
    public static int [][] input(int r,int c){
        Scanner sc=new Scanner(System.in);
        System.out.println("Taking input in array:-");
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("a["+i+"]["+j+"]:-");
                a[i][j]=sc.nextInt();
            }
        }
        return a;
    }
    //printing 2d arrray:-
    public static void print(int a[][]){
       // System.out.println("Printing array :-");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    //helpre for adding 2 matrix:-
    private static void add_formate_Helper() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of 1 st array:-");
        System.out.print("Row 1 :-");
        int r1 = sc.nextInt();
        System.out.print("coll 1:-");
        int c1 = sc.nextInt();
        int a[][] = input(r1, c1);

        System.out.println("Enter size of 2 st array:-");
        System.out.print("Row 2 :-");
        int r2 = sc.nextInt();
        System.out.print("coll 2:-");
        int c2 = sc.nextInt();
        int b[][] = input(r2, c2);


        System.out.println("sum of:-");
        print(a);
        System.out.println("  and  :-");
        print(b);
        addMatrix(a, r1, c1, b, r2, c2);
    }


//Adding 2 matrix:-
    private static void addMatrix(int a[][],int r1,int c1,  int [][]b,int r2,int c2){
  int ans[][]=new int[r1][c1];  // to add 2 matrix row and collumn must be same:-
        if(r1 ==r2 && c1==c2){
            for(int i=0;i<r1;i++) {
                for(int j=0;j<c1;j++){
                    ans[i][j]=a[i][j]+b[i][j];
                }

            }
        }
        else{

            System.out.println("Dimension mismatch. Matrices cannot be added.");
            return;

        }
        System.out.println("The sum is:-");
        print(ans);
    }



    private static void multiply_formate_Helper() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of 1 st array:-");
        System.out.print("Row 1 :-");
        int r1 = sc.nextInt();
        System.out.print("coll 1:-");
        int c1 = sc.nextInt();
        int a[][] = input(r1, c1);

        System.out.println("Enter size of 2 st array:-");
        System.out.print("Row 2 :-");
        int r2 = sc.nextInt();
        System.out.print("coll 2:-");
        int c2 = sc.nextInt();
        int b[][] = input(r2, c2);


        System.out.println("product of:-");
        print(a);
        System.out.println("  and  :-");
        print(b);
        multiplyMatrix(a, r1, c1, b, r2, c2);
    }

    //multiply:-
    private static void multiplyMatrix(int a[][],int r1,int c1,  int [][]b,int r2,int c2){
        if(c1==r2){
            int[][]ans=new int[r1][c2];
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    for(int k=0;k<c1;k++){
                        ans[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            System.out.println(" the product is:-");
            print(ans);
        }
        else{
            System.out.println("");

            System.out.println("Dimension mismatch. Matrices cannot be multiplyed.");
            return;

        }
    }

}

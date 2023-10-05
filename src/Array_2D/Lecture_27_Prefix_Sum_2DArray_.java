package Array_2D;

public class Lecture_27_Prefix_Sum_2DArray_ {
    public static void main(String[] args) {
        int[][] a = {
                {1, 1, 1, 1, 1, 1, 1},
                {2,2,2,2,2,2,2},
                {3,3,3,3,3,3,3},
                {4,4,4,4,4,4,4},
                {5,5,5,5,5,5,5},
                {6,6,6,6,6,6,6},
                {7,7,7,7,7,7,7}
        };

        print(a);

        //method 1:-{Broot force}
        System.out.println(sum(a,3,1,5,4));

        //Method 2:-
        //only 1 itteration used:-
       System.out.println( "Sum of scope variables :-  "+preSumScope(a,0,2,0,2));

        System.out.println( "Sum of scope variables :-  "+pre_2(a,0,2,0,2));
    }

    //prefix Sum inplace:-
    public static void pre_sum(int a[]){
        for(int i=1;i<a.length;i++){
            a[i]=a[i]+a[i-1];
        }
    }

    //prefix sum scope:-
    public static int preSumScope(int a[][],int l1,int l2,int r1,int r2){
        int sum=0;
        //finding prefix sum of every individual array:-
      for(int i=0;i<a.length;i++){
          pre_sum(a[i]);
      }

      //finding sum wethin scope:-
        for(int i=l1;i<=l2;i++){
             if(r1>0) {
                 sum += a[i][r2] - a[i][r1 - 1];
             }
            else{
                sum+=a[i][r2];
             }
        }


        return sum;
    }


    //prefix sum over collumn;-
    public static void pre_Sum_On_Collumn(int[][]a){
        int r=a.length;
        int c=a[0].length;

        //traversing over collumn just put  the loop of j outside:-
        for(int j=0;j<c;j++){
            for(int i=1;i<r;i++){
                a[i][j] += a[i-1][j];
            }
        }

    }

    //Prefix_Sum over collumn and row:-
    public static int pre_2(int a[][],int l1,int l2,int r1,int r2){
        int sum=0;
        //finding prefix sum of every individual array:-
        for(int i=0;i<a.length;i++){
            pre_sum(a[i]);
        }
        System.out.println("prefix sum over row:-");
        print(a);


        //Prefix sum over collumn:-
        System.out.println("Prefix sum over collumn:-");
        pre_Sum_On_Collumn(a);
          print(a);

          //sum:-
        if(r1 >0 && l1 > 0) {
            sum = a[l2][r2] - a[l1 - 1][r2] - a[l2][r1 - 1] + a[l1 - 1][r1 - 1];
        }
        else {
            sum = a[l2][r2] - a[l1][r2] - a[l2][r1] + a[l1][r1];
        }


        return sum;
    }



    //broot force:-
    //sum of given l1,l2 r1,r2:-
    public static int sum(int [][]a,int r1,int c1,int r2,int c2){
        int sum=0;

        for(int i=r1;i<=r2;i++){
            for(int j=c1;j<=c2;j++){
                sum=sum+a[i][j];
            }
        }

        return sum;
    }

    public static void print(int a[][]){
        // System.out.println("Printing array :-");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}

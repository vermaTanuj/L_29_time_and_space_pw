package Array_2D;

public class Lecture_27_Prefix_Sum_2DArray_ {
    public static void main(String[] args) {
        int[][] a = {
                {1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1}
        };

        System.out.println(sum(a,3,1,5,4));
    }
    public static int sum(int [][]a,int r1,int c1,int r2,int c2){
        int sum=0;

        for(int i=r1;i<=r2;i++){
            for(int j=c1;j<=c2;j++){
                sum=sum+a[i][j];
            }
        }

        return sum;
    }
}

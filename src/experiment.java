import java.util.Arrays;

public class experiment {
    public static void main(String[] args) {
        System.out.println(countdig(7000));

        System.out.println(countdig_2(-7000));
        int [][]a={{1,2,3},{3,2,9}};
        System.out.println(ddd(a));


    }
    //count the no of digits:-
    public static int countdig(int n){
        int c=0;

        while(n>0){
            n=n/10;
            c++;
        }

return c;
    }
//
    public static int countdig_2(int n){
        if(n<0){
            n=n*-1;
        }
         String s= n+"";
         return s.length();
    }




    public static int ddd (int a[][]){

        for(int i=0;i<a.length;i++){
            presum(a[i]);
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            int j=a[i].length-1;
            if(max<a[i][j]){
                max=a[i][j];
            }

        }
return max;
    }

    public static void presum(int []a){
        int sum=a[0];
        for(int i=1;i<a.length;i++){
            a[i]=a[i]+a[i-1];
        }
    }
}

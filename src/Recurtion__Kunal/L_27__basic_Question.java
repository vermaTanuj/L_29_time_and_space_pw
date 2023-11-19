package Recurtion__Kunal;

public class L_27__basic_Question {
    public static void main(String[] args) {

        //print n till 1:-
        print_n_till_1(5);

        //print 1 till n:-
        print_1_till_n(5);

     //   System.out.println(Lee(14));
        //Faxtorial:-
        System.out.println("Factorial:-");
        System.out.println(factorial(5));
        System.out.println(sum(5));
        System.out.println(sumOfDigits(142));

        System.out.println(rev(1342));
        System.out.println("sof digit by loop:-"+sss(1342));

        int y=1342;
        reverse(y);
        System.out.println("reverse the no by recurtion:-"+y);

        System.out.println("count zerose :- "+countZerose(30204));

        System.out.println("Leet:-"+countOperations(2,3));
    }

    //print n till 1:-
    public static void print_n_till_1(int n){
        if(n<1){
            return;
        }
        System.out.println(n);
        print_n_till_1(n-1);
    }

    //print 1 till n:-
    private static void print_1_till_n(int n) {
        if(n<1){
            return;
        }
        print_1_till_n(n-1);
        System.out.println(n);
    }

    /*Leetcode
    public static int Lee(int n){
        int rr=0;
        for(int i=0;i<n;i++){
            if(n%2==0){
                n=n/2;
            }
            if(n%2==1){
                n=n-1;
            }
rr=i;
        }
        return rr;
    }

     */

    //factorial:-
    public static int factorial(int n){
        if(n<=1){
            return 1;
        }
        return n*factorial(n-1);
    }

    //Sum of 1 to n:-
    public static int sum(int n){
        if(n<=1){
            return 1;
        }
        return n+sum(n-1);
    }

    //Sum of digit Recurtion:-
    public static int sumOfDigits(int n){
        if(n/10==0){
            return n%10;
        }
        return sumOfDigits(n/10)+sumOfDigits(n%10);
    }

    //Reverse the Digits by loop:-
    public static int rev(int  n){
        int nd=0;
        while(n>0){
           int d=n%10;
            nd=nd*10+d;
           n=n/10;
        }
        return nd;
    }

//Sum of no Loop:-
    public static int sss(int  n){
        int sum=0;
        while(n>0){
            int d=n%10;
            sum=sum+d;
            n=n/10;
        }
        return sum;
    }

//Reverse the no by recurtion:-
    static int nd=0;
    public static void reverse(int n){
     if(n==0){
         return;
     }
     int dig=n%10;
      nd=nd*10+dig;
      reverse(n/10);
    }

    //Counting zerose:-
    public static int countZerose(int n){
        int c=0;
        while(n>0){
            int d=n%10;
            if(d==0){
                c++;
            }
            n=n/10;
        }
        return c;
    }

    public static int countOperations(int n1, int n2) {
        int c=0;
        while(n1 == 0 && n2 == 0){
            if(n1>=n2){
                n1=n1-n2;
                c++;
            }
            if(n2<n1){
                n2=n2-n1;
                c++;
            }
        }
        return c;
    }

}

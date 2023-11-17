package Maths_for_DSA__Kunal;

public class Maths_for_dsa__L__26 {
    public static void main(String[] args) {
        for(int i=0;i<=100;i++) {


            //System.out.println(i+" :-- "+prime_Kunal(i));
        }
//Printing prime no upto given no:-
     //   printPrime(100);

        //find square root:-(Broot force)
        System.out.println(squareRootBrootForce(9));

        //square root BinarySearch
        System.out.println(squareRootBinarySearch(12));
        System.out.println(squareRootBinarySearch_precision(40,3));

        //Factors of the no:-
printFactors(36);
        System.out.println();

        //GCD  HCF:-
        System.out.println("HCF:-"+GCD(15,17));
        //LCM:-
        System.out.println("LCM:-"+LCM(3,7));

    }
    //prime no:-
    public static String prime(int a){

        if(a==1){
            return "Nor prime nor Composit";
        }
        if(a==2){
            return "Prime";
        }

        String s="Prime";
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0){
                s="Composit";
            }
        }
        return s;
    }

    //Prime_Kunal:-
    public static String prime_Kunal(int a){
        if(a==1){
            return "Nor prime nor Composit";
        }
        int n=2;
        while(n*n<=a){
            if(a%n==0){
                return "composit";
            }
            n++;
        }
        return "prime";
    }

    public static void printPrime(int n){
        for(int i=1;i<=n;i++){
            if(prime(i).equals("Prime")){
                System.out.print(i+",");
            }
        }
    }

    //Square Root Brute force:-
    public static int squareRootBrootForce(int n){
        for(int i=1;i<n;i++){
            if(i*i==n){
                return i;
            }
        }
        return -1;
    }

    public static int squareRootBinarySearch(int n){
        int st=0;
        int end=n;
        int ans=-1;

        while(st<=end){
            int mid=st+(end-st)/2;
            int v=mid*mid;
            if(v>n){
                end=mid-1;
            }
            else if(v<n){
                ans=mid;
                st=mid+1;
            }
            else{
                //v==mid :-
                return mid;
            }

        }
        return ans;
    }

    public static double squareRootBinarySearch_precision(int n,int p){
        int st=0;
        int end=n;
        double ans=0.0;

        while(st<=end){
            int mid=st+(end-st)/2;
            double v=mid*mid;
            if(v>n){
                end=mid-1;
            }
            else if(v<n){
                ans=mid;
                st=mid+1;
            }
            else{
                //v==mid :-
                return mid;
            }
        }

//precision:-
        double incr=0.1;
       for(int i=0;i<p;i++){
           while(ans*ans < n){
               ans=ans+incr;
           }
           ans=ans-incr;
           incr=incr/10;
       }
       return ans;

    }

    public static void printFactors(int a){
        for(int i=1;i<=a;i++){
            if(a%i==0){
                System.out.print(i+",");
            }
        }
    }

    //GCD HCF:-
    public static int GCD(int a,int b){
       if(a==0){
           return b;
       }
       return GCD(b%a,a);
    }

    //LCM
    public static int LCM(int a,int b){
     return ( a*b/GCD(a,b));
    }


}

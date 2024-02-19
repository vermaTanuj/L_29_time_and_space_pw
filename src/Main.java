import java.util.Scanner;

//import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter no:-");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=0;i<n;i++){
          System.out.println("i:- "+ i);
          for(int j=0;j<Math.sqrt(n);j++){
              System.out.println("hello:-"+ "i:-"+i+ "  j:-" + j);
          }
      }
//*********************************************************************//


        int m=sc.nextInt();
        for(int i=0;i<n;i=i*2) {
            System.out.println("i:- " + i);
          //  find time complexity
        }

    }
}
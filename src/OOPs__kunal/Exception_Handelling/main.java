package OOPs__kunal.Exception_Handelling;

public class main {
    public static void main(String[] args) {
        int a=55;int b=5;
        int c=0;

       // System.out.println(dev(a,c));

      //  System.out.println(b/c);
        try{
           // int d=a/c;
            System.out.println("dev(a,c):- "+dev(a,c));
        }
        catch (Exception e){
            System.out.println("yyy:-"+e);
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("finally block  Always works;");
            System.out.println("it is used to close file or other part of programme");
        }
    }
     static int dev(int a,int b)throws Exception {
        if(b==0){
            throw new Exception("Dont devide wirth 0");
        }
        return a/b;
    }
}

package Componey_practice_Question;

public class TCS_Digital {
    public static void main(String[] args) {

    //problrm:-
    //no fo vehicle=200
   //no fo wheels=54
   //find no do 2whealers and 4 whealers;

        brootforse(200,540);
        foor(200,540);

        //Automorphic no :-unit digit of no and its square is same
        for(int i=1;i<1000;i++) {
            System.out.println("i:-  "+i+"  :-  "+automorphicNo(i));
        }


    }
    public static void brootforse (int vehicle,int wheels) {
        int tw = 0;

        while (tw <= vehicle) {

            int fw = vehicle - tw;
            if (2 * tw + 4 * fw == wheels) {
                System.out.println("no of 2whelers:-" + tw);
                System.out.println("no of 4whelers:-" + fw);
            }

            tw++;
        }

    }

    //using for loop:-
    public static void foor (int vehicle,int wheels) {
        for(int i=0;i<=vehicle;i++){
            int fw=vehicle-i;
            if(i*2+fw*4==wheels){
                System.out.println("no of 2whelers:-" + i);
                System.out.println("no of 4whelers:-" + fw);
            }
        }
    }

    //automporphic no:-
    public static String automorphicNo (int n) {
        String r="no";
        int dig;
        int sq;

        sq=n*n;
        if(sq%10==n%10){
            r="yes";
        }

        return r;
    }


}
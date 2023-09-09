package Componey_practice_Question;

public class TCS_Digital {
    public static void main(String[] args) {

    //problrm:-
    //no fo vehicle=200
   //no fo wheels=54
   //find no do 2whealers and 4 whealers;

        brootforse(200,540);
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
}
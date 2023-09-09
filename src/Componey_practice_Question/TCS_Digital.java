package Componey_practice_Question;

public class TCS_Digital {
    public static void main(String[] args) {

    //problrm:-
    //no fo vehicle=200
   //no fo wheels=54
   //find no do 2whealers and 4 whealers;

        brootforse(200,540);
        foor(200,540);
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
}
package OOPs__kunal._Enums__;

public class Enum {
    //Enum:-
     enum Week{
        //Every variables are public ,static ,final;
        //no child enum is possible because it is final
       //fixed no of object;
         //Variables:-
         monday,twesday,wednesday,thursday ,friday,saturday,sunday;

         //Constructor";-
        Week(){
            System.out.println("this is enum obj:- "+this);
        }
    }

    public static void main(String[] args) {
        Week w = Week.monday;
        for (Week day : Week.values()) {
            System.out.println(day);
        }
        System.out.println("W:-"+w);
        System.out.println("w.ordinal():-"+w.ordinal());
        System.out.println("w.ordinal():-");
    }
}

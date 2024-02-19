package OOPs__kunal;



public class MMMAin {
    public static void main(String[] args) {

        System.out.println(Human.population);
        Human tanuj=new Human(10000,"Tanuj",23,false);
        Human verma=new Human(99999,"Verma",63,true);

        System.out.println(Human.population);

        Human.population=Human.population+1;
        System.out.println(Human.population);
        Human.population=100;
        System.out.println(Human.population);


        //Singolton class:
        Singolton__Class v1=Singolton__Class.getInstance();
        System.out.println(v1);
        Singolton__Class v2=Singolton__Class.getInstance();
        System.out.println(v2);
        Singolton__Class v3=Singolton__Class.getInstance();
        System.out.println(v3);

        //All object point to same memory location;
    }
}

package OOPs__kunal;

public class Singolton__Class {
    //Singolton class:-
    // can have only one obj ,all other obj will refer to the memory of first obj
    private Singolton__Class(){

    }

    //Singolton inctsnce counter:-
    private static Singolton__Class instance;

    public static Singolton__Class getInstance(){
        if(instance == null){         //if instance is not created then inly create;
            instance = new Singolton__Class();
        }
        return instance;
    }
}

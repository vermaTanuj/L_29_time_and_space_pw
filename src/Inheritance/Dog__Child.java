package Inheritance;

public class Dog__Child extends Animal__Parent {
    @Override
    public  void sound(){
        System.out.println("Dog_sound__Child");
    }
    public  void sound__2(){
        System.out.println("Dog_sound__Child__2");
    }

    public static void main(String[] args) {
        Animal__Parent a=new Dog__Child();
        a.sound();  //if same method is present in both parent and child
                    //it will pick the child one.

        a.sound_1();//if same method is not present in   child
                    //it will pick the parent  one.

        //a.sound__2();:- //can't access the child one;

    }
}

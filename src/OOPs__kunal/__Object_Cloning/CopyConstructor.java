package OOPs__kunal.__Object_Cloning;

public class CopyConstructor {
    int age;
    String name;

//Normal constructor to assign the values;
    public CopyConstructor(int age, String name) {
        this.age = age;
        this.name = name;
    }

    //Copy Constructors:-
    public CopyConstructor(CopyConstructor c){
        this.age=c.age;
        this.name=c.name;
    }

}

package OOPs__kunal;

public class Human {
    int salary;
    String name;
    int age;
    boolean marrage;

    //static:-
    //independent of object
    //Access with class name;
    static long population;

    Human(int salary, String name, int age, boolean marrage){
        this.salary=salary;
       this.name=name;
        this.age=age;
        this.marrage=marrage;
        Human.population=population+1;
    }

}

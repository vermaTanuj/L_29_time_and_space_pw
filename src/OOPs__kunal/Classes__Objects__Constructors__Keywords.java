package OOPs__kunal;

public class Classes__Objects__Constructors__Keywords {
    public static void main(String[] args) {

        Student tanuj=new Student("Tanuj Verma",21604, 99);

        System.out.println(tanuj.name);
        System.out.println(tanuj.roll);
        System.out.println(tanuj.marks);

    }
}

class Student{
    String name;
    int roll;
    float marks;


    //We need a way to add a way to add to assign
    //all variables object by object

    //one way to access all the object is constructor;
    Student( String name,int roll,float marks){
        this.name=name;
        this.roll=roll;
        this.marks=marks;
    }
}

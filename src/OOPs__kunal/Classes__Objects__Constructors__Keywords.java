package OOPs__kunal;

public class Classes__Objects__Constructors__Keywords {
    public static void main(String[] args) {

        Student tanuj=new Student("Tanuj Verma",21604, 99);

        System.out.println(tanuj.name);
        System.out.println(tanuj.roll);
        System.out.println(tanuj.marks);

        // Create a Student object using the regular constructor
        Student a = new Student("John", 1, 90.5f);

        // Create a new Student object using the copy constructor
        Student copiedStudent = new Student(a);

        // Display the values of the original and copied students
        System.out.println("Original Student: " + a.name + ", " +a.roll + ", " + a.marks);
        System.out.println("Copied Student: " + copiedStudent.name + ", " + copiedStudent.roll + ", " + copiedStudent.marks);

        //Finalized method:-

        Student obj;
        for(int i=0;i<1000000000;i++){
            obj=new Student(i);
        }


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
    // Copy constructor to create a new object by copying values from another object
    Student(Student other) {
        this.name = other.name;
        this.roll = other.roll;
        this.marks = other.marks;
    }

    Student(int i){
        System.out.println( "no of times:- "+i);
    }
    //finalised:-
//  it tells the compiler to do what you want to do if obj is distroyed;

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Obj distroyed");
    }
}

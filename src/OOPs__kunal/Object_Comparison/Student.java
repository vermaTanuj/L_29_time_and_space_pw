package OOPs__kunal.Object_Comparison;

public class Student implements Comparable<Student>{
    int roll;
    float marks;

    public Student(int roll,float marks){
        this.roll=roll;
        this.marks=marks;
    }

    @Override
    public int compareTo(Student o) {
        float diff = this.marks - o.marks;
        return (int)diff;
    }
}

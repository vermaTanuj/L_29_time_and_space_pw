package OOPs__kunal.Object_Comparison;

public class gop {
    int roll;
    float marks;

    public gop(int roll,float marks){
        this.roll=roll;
        this.marks=marks;
    }

    public float comaiir(gop y){
        return (this.marks-y.marks);

    }

    @Override
    public String toString() {
        return "gop{" +
                "roll=" + roll +
                ", marks=" + marks +
                '}';
    }
}

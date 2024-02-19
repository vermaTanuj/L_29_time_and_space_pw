package OOPs__kunal.__ObjectClass_;

public class ObjDemo {

    int n;
    public ObjDemo() {}
    public ObjDemo(int n) {
        this.n=n;
    }
    //Method of Object class:-

    //HashCode:-
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class ObjDemmo_2 extends ObjDemo{
    public static void main(String[] args) {

        ObjDemo a=new ObjDemo(34);
        System.out.println(a.hashCode());
        ObjDemo b=new ObjDemo(34);
        System.out.println(b.hashCode());
    }

}
package String;

public class Opraters {
    public static void main(String[] args) {
        System.out.println(('a'+'b'));//195
        System.out.println("a"+"b");  //ab
        System.out.println((char)('a'+3));//d
        System.out.println("a"+1);//:-Any thing added to string is string
        String.valueOf(9);
        int y=0;
    //    String d=(String)y;  :- wrong
        String g=String.valueOf(y);
        System.out.println(g);
    }
}

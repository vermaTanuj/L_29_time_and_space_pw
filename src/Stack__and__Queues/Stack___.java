package Stack__and__Queues;
import java.util.Stack;
public class Stack___ {
    public static void main(String[] args) {

        //Inbuilt stack:-
        Stack<Integer> s =new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        System.out.println(s);

        //There is a convention that if you pop a stack or queue you display it :-
        System.out.println(s.pop());  //deletes 5 follows lifo
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s);
        s.pop();
        s.pop();

    }
}

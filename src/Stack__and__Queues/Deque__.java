package Stack__and__Queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque__ {
    public static void main(String[] args) {
        //Inbuilt:-
        Deque <Integer> d=new ArrayDeque<>();
        d.add(1);
        d.addFirst(2);
        d.add(3);
        d.add(4);
        d.addLast(5);
        d.add(6);
        d.addLast(10);
        d.add(11);

        System.out.println(d);
        System.out.println(d.removeFirst());
        System.out.println(d);
        System.out.println(d.remove());
        System.out.println(d);
    }
}

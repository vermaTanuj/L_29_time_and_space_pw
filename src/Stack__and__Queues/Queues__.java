package Stack__and__Queues;

import java.util.LinkedList;
import java.util.Queue;

public class Queues__ {
    public static void main(String[] args) {
       //Inbuilt one:-
        Queue <Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        System.out.println(q.remove());
        System.out.println(q.remove(3));
        System.out.println(q);
    }
}

package Linked_List;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

//Inbuilt:-
        LinkedList <Integer>a=new LinkedList();
        a.add(5);
        System.out.println(a.size());


        LL list=new LL();
        //adding value;
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        //displaying value;
        list.display();

        //inert at last;-
        list.insertLast(100);
        list.insertFirst(66);
        list.display();

list.insertAtIndex(888,3);
list.display();




    }
}

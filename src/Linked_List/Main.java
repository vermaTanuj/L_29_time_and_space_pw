package Linked_List;

import org.w3c.dom.Node;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws Exception {

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
        list.deleteFirst();
        list.display();

        System.out.println("getSize():- "+list.getSize());
        list.deleteLast();
        list.display();
        System.out.println();
        list.deleteAtIndex(3);
        list.display();

        System.out.println();


        //deleting a list having one element:-
        LL k=new LL();
     k.insertFirst(4);
     k.display();
     k.deleteFirst();
     k.display();

     // //deleting a list having 0 element:-
     LL o=new LL();
     o.display();



    }
}

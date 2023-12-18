package Linked_List;



import java.sql.SQLOutput;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws Exception {

//Inbuilt:-
        LinkedList <Integer>a=new LinkedList();
        a.add(5);
        System.out.println(a.size());


        Singli_Linked_List list=new Singli_Linked_List();
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
        Singli_Linked_List k=new Singli_Linked_List();
     k.insertFirst(4);
     k.display();
     k.deleteFirst();
     k.display();

     // //deleting a list having 0 element:-
     Singli_Linked_List o=new Singli_Linked_List();
     o.display();
///////////////////////////////// -: Doubly Linked List:- ///////////////////////////////////

        Doubli_Linked_List d=new Doubli_Linked_List();
        System.out.println("Duubli Linked List:-");
        d.insertFirst(5);
        d.insertFirst(4);
        d.insertFirst(3);
        d.insertFirst(2);
        d.insertFirst(1);

        d.insertLast(100);
        d.insertAtLast(200);
        d.displayForword();
       d.displayback();
       d.displayForword();
        System.out.println("yyy");
       d.insertAtIndex(5009,4);
       d.displayForword();
d.displayback();

////Circular linked list????
        System.out.println("/Circular linked list?");
        Circular_Linked_List c=new Circular_Linked_List();

        c.insertAfterTail(1);
        c.insertAfterTail(2);
        c.insertAfterTail(3);
        c.insertAfterTail(4);
        c.insertAfterTail(5);
        c.insertAfterTail(6);
        c.insertAfterTail(7);
        c.insertAfterTail(8);
        System.out.println("kkk");
        c.display();
        System.out.println("kkk");
        c.delete(4);
        c.Delete(4);
        c.deletee(3);
        System.out.println("kkk");
        c.display();
        System.out.println("kkk");

    }
}

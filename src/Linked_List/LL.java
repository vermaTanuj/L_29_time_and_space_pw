package Linked_List;

public class LL {
//Singly Linked List:-

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size=0;
    }
    //Inserting  into linklist:-(method)
    public void insert(int value){

        Node node=new Node(value);  //creating new node to add;-
        node.next=head;             //new node is attached to existing head;
        head=node;                   //updating head:- 1st element is the head
        if(tail==null){                //if tail is null it's a link list of 1 element than head & tail are same;
            tail=head;
        }
        size=size+1;                    // increase the size
    }

    //Displaying the linked list:-
    public void display(){
        Node temp=head;  //:- temp variable is used to reduce the risk of modifying ll ;insted of head;
        while(temp != null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("End");
    }




    //Node Class :-
    private class Node{
        private int value;
        private Node next;

        //Connstructor:-
    public Node(int value){
        this.value=value;
    }

    public Node(int value,Node next){
        this.value=value;
        this.next=next;
    }
    }
}

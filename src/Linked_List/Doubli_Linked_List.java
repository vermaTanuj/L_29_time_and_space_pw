package Linked_List;

public class Doubli_Linked_List {

  private    Node head;
  private    Node tail;
    private int size;
    public Doubli_Linked_List(){
        this.size=0;
    }


    //insert First;-
    public void insertFirst(int value){
        Node node=new Node(value);      //new node
        node.next=head;                // new node address = head
        node.prev=null;                //new node previous address to null;
        if(head!=null){               //if list is not empty
            head.prev=node;            //then head can go back
            head=node;                  //update head
        }
        else {
            // If the list is empty, update tail to the new node
            head=node;             //update head
            tail = node;          //This is how tail keeps the track of last node
        }

        //update head
        size++;
    }

    //Display:-
    public void displayForword(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("End");
    }

    //Display Back Words:-
    public void displayback(){
        Node temp=tail;
        while (temp!=null){
            System.out.print(temp.value+" <- ");
            temp=temp.prev;
        }
        System.out.println("Start");
    }

    private class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }


}

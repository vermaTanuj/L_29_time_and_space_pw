package Linked_List;

public class Doubli_Linked_List {

  private    Node head;
  private    Node tail;
    private int size;
    public int getSize(){
        return size;
    }
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

    //Insert at Last:-
    public void insertLast(int value){
        Node node=new Node(value) ;
        node.prev=tail;
        node.next=null;
        if(tail!=null){
            tail.next=node;
            tail=node;
        }
        else{
            head=node;
            tail=node;
        }

    }

    //insert last without tail:-
    public void insertAtLast(int v){
      //empty list
        if(head==null){
            insertFirst(v);
        }
        //Normal case:-
        Node node=new Node(v);
        Node temp=head;
        while (temp!=null){
            temp=tail.next;
            if(temp==null){
                node.prev=temp;
                node.next=null;
                tail.next=node;
            }
        }size++;
    }

    public void insertAtIndex(int value,int index)throws Exception{
        if(index==0){
            insertFirst(value);
            return;
        }
        if(index==size){
          insertLast(value);
          return;
        }
        if(index<0 || index>size){
            throw new Exception("[Index out of bound by Tanuj Verma] ");
        }
        //Normal case:=-

       Node node=new Node(value);
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        node.next=temp.next;
        node.prev=temp;
        temp.next=node;
        node.next.prev=node;
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

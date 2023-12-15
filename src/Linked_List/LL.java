package Linked_List;

public class LL {
//Singly Linked List:-

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size=0;
    }
    //Inserting at first into linklist:-(method)
    public void insertFirst(int value){

        Node node=new Node(value);  //creating new node to add;-
        node.next=head;             //new node is attached to existing head;
        head=node;                   //updating head:- 1st element is the head
        if(tail==null){                //if tail is null it's a link list of 1 element than head & tail are same;
            tail=head;
        }
        size=size+1;                    // increase the size
    }

    //Inserting at last :-(method)
    public void insertLast(int v){

       if (tail==null){ //if list is empty then first enter the value
           insertFirst(v);
           return;
       }

           Node n=new Node(v);  //new node
          tail.next=n;          //tail to new_node
          tail=n;         //update tail to new_node
           size=size+1;       //increase size;


    }


    //Displaying the linked list:-
    public void display(){
        Node temp=head;  //:- temp variable is used to reduce the risk of modifying ll ;insted of head;
        while(temp != null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;         //Ask:-temp = temp ka jisssa connection bana ga.
                                    //As we access the temp.value same is temp.next
                                    // just updating temp;
        }

        /*  for loop aproach:-
        for(Node temp=head; temp!=null; temp=temp.next){
            System.out.print(temp.value);
        }

         */
        System.out.println("End");
    }

    public void insertAtIndex(int value,int index){
        if(index==0){   //insert at first index
            insertFirst(value);
            return;
        }
        if(index==size){           ////insert at Last index
            insertLast(value);
        }
        //insert into middle:-
        Node temp=head;                         //temperory variable
        for(int i=1;i<index;i++){             //bringing temp to (index-1) asress
            temp=temp.next;                   //assigining address
        }
        Node node=new Node(value,temp.next); //new node  ;;temp.next:- giving the address of next node
        temp.next=node;                      //Assigining address of newly created node to  (index-1) node
        size++;
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

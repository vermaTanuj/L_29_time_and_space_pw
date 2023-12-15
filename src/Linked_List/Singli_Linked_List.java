package Linked_List;

public class Singli_Linked_List {
//Singly Linked List:-

    private Node head;
    private Node tail;
    private int size;

    public Singli_Linked_List(){
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

    //Delete first:-
    public void deleteFirst(){
        if(head==null && tail==null){     //Empty linkList:-
            return;
        }
        if(head==tail){          // linklist with 1 element:-
            head=null;
            tail=null;
            return;
        }
        //Delete in normal:-
        head=head.next;         //in deleting we just  point head to  nest
                                //rest part is deleted by garbej collection
        size--;                 //decreasing size
    }

    public int getSize(){
        return size;
    }

    //Deleting the last element:-
    public void deleteLast(){
        if(head==null && tail==null){  //empty list
            return;
        }
        if(head==tail){ // 1 element list
            head=null;
            tail=null;
        }
        //normal list:-
        int size=getSize();    //getSize():-returns the size
        Node temp=head;        //temperory node
        for(int i=1; i< size-1 ;i++){    //size-1 :- brings temp to second last index
            temp=temp.next;             //bringing to second_last adress
        }
        tail=temp.next;            //tail to second last element
        temp.next=null;            //second last element to null
        size--;
    }

    //Delete at index:-
    public void deleteAtIndex(int index) throws Exception {
        if(index==0){
            deleteFirst();
            return;
        }
        if(index==size-1){
            deleteLast();
            return;
        }
        //Empty list:-
        if(head==null&&tail==null){
            return;
        }
        //1 element:-
        if(head==tail){
            deleteFirst();
        }
        if(index>size-1 || index<0){   //Throwing exception in case:-
            throw new Exception("index out of bound: xxx");
        }

        //Normal case:-
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;            //temp contain the address of the node to be deleted
        }

        temp.next=temp.next.next;     //reassigning the address by skipping 1 in between
        size--;

    }

    //finde Value in node;-
    public Node findValue(int value){
        Node temp=head;
       while (temp!=null){
           if(temp.value==value){
               return temp;
           }
           temp=temp.next;
       }
       return null;
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

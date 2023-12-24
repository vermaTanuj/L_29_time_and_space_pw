package Linked_List;

public class Sorting_singly_Link_List {
    public static void main(String[] args) {

        System.out.println("Sorting list:-");
        Sorting_singly_Link_List z = new Sorting_singly_Link_List();
        z.insertLast(4);
        z.insertLast(3);
        z.insertLast(2);
        z.insertLast(16);
        z.insertLast(15);
        z.insertLast(16);

        z.display();
        z.head = z.sortList(z.head); //
        //  z.sortList(z.head);
        //  z.sortList_1(z.head);
        z.display();

    }

//////////////////////////////////
private Node head;
    private Node tail;
    private int size;

    public Sorting_singly_Link_List() {
        this.size = 0;
    }

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

    //////////////////////////////////////////////////
    public static Node marge(Node a, Node b){
        // Base cases
        if (a == null)
            return b;
        if (b == null)
            return a;
        Node head=new Node(0);
        Node tail=head;

        while(a!=null && b!=null) {
            if (a.value < b.value) {
                tail.next = a;
                a = a.next;
                tail = tail.next;
            } else {
                tail.next = b;
                b = b.next;
                tail = tail.next;
            }

        }
        //Left overs:-
        if(a!=null){
            tail.next=a;

        }else{
            tail.next=b;
        }
        return head.next;
    }


    //Get middle:-
    public static Node getMiddle(Node head){
        Node f=head;
        Node s=head;
        Node prev=null;
        while(f!=null && f.next!=null){
            prev=s;
            f=f.next.next;
            s=s.next;
        }

        if (prev != null) {
            prev.next = null;
        }


        return s;
    }



    //Sort List :- Merj sort;
    public static Node sortList(Node a){
        if(a==null || a.next==null){
            return a;
        }
        Node mid=getMiddle(a);
        Node left=sortList(a);
        Node right=sortList(mid);


        return marge(left,right);
    }

///////////////////////////////////////////////////////////////////////
    //Node:-

    //Node Class :-
    private static class Node{
        private int value;
        private Node next;

        //Connstructor:-
        public Node(int value){
            this.value=value;
        }

        public Node(int value, Node next){
            this.value=value;
            this.next=next;
        }
    }
}

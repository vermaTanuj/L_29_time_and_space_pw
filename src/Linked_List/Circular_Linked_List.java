package Linked_List;

public class Circular_Linked_List {

    private Node head;
    private Node tail;
    private int size;

    public Circular_Linked_List(){
        this.head=null;
        this.tail=null;
    }

    //Insert After Tail:-
    public void insertAfterTail(int value){
        Node node=new Node(value);
        if(head==null){ //Empty list only one element
           head=node;
           tail=node;
           size++;
           return;
        }
        //Normal case
        tail.next=node;
        node.next=head;
        tail=node;
        size++;
    }

    //Display:-
    public void display(){
        Node temp=head;

        if(temp==null){ //Empty list;
            System.out.println("no element found");
            return;
        }
        if(temp==tail){    //single element list
            System.out.println(temp.value);
            return;
        }

        if(head!=null){
            do{       //Do while hoop is used because if temp==head then also loop needs to go ones;
                System.out.print(temp.value+"->");
                temp=temp.next;
            }while(temp!=head);
        }
      //While loop dos't work here
       /*
        while(temp!=tail){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }

        */
    }

    //Delete a node
    public void delete(int value){
        Node nodeToDelete=findnode(value);  //node having value
        if (nodeToDelete == null) {
            System.out.println("Node not found");
            return;
        }
        System.out.println(nodeToDelete.value);
        Node temp=head;
        do{
            if(nodeToDelete.value==temp.value){
                temp=temp.next;
                size--;
                return;
            }
            temp=temp.next;
        }while(temp!=head);

    }

    public Node findnode(int value){
        Node temp=head;

/*
        if(temp!=null){
            do{
                if(value==temp.value){
                    rr= temp;
                }
            }while(temp!=head);
        }
        return  rr;

 */
       do{
           if(temp.value==value){
               return temp;
           }
           temp=temp.next;
       }while (temp!=head);
        return null;
    }

    //Delete:-(My own method)
    public void Delete(int value){
        Node node=head;
        if(head==null){  //Empty list
            return;
        }
        if(value==head.value){  //Deleting head:-
            head=head.next;  //head pointer will point to next node
            tail=head;
            return;
        }
        //Single element:-
        if(head==tail && head.value==value){
            head=null;
            tail=null;
        }
//Normal case:-

       Node Ahed_Pointer=node.next;
        do{
          //  Node Ahed_Pointer=node.next;
            if(Ahed_Pointer.value==value){
                node.next=Ahed_Pointer.next;
                size--;
                break;
            }
            node=node.next;
            Ahed_Pointer=Ahed_Pointer.next;
        }while(node!=head);
    }
    public void deletee(int val) {
        Node node = head;
        if (node == null) {
            return;
        }

        if (head == tail){
            head = null;
            tail = null;
            return;
        }

        if (node.value == val) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if (n.value == val) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);

    }
    //Node:-
    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}

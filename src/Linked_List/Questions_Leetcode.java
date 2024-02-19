package Linked_List;

import org.w3c.dom.Node;
/*
public class Questions_Leetcode {

/*
Que;-  83>  Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.


    class Solution {
        public Node deleteDuplicates(Node head) {
            Node temp=head;
            if(temp==null || temp.next==null){
                return head;
            }

            while(temp.next!=null){
                if(temp.val==temp.next.val){
                    temp.next=temp.next.next;
                }else {
                    temp = temp.next;
                }

            }
            return head;

        }
    }
////////////////////////////////////////////////////////////////////////////////
    Que 21 > Merge 2 Link List:-


    class Solution {
    public ListNode mergeTwoLists(ListNode a, ListNode b) {

     ListNode head=new ListNode();
     ListNode tail=head;

     while(a != null && b != null){
       if(a.val <= b.val){

           tail.next=a;
           a=a.next;
           tail=tail.next;
       }
       else{
           tail.next=b;
           b=b.next;
           tail=tail.next;
       }
     }
//Rest overs:-

if(a!=null){
    tail.next=a;

}else{
    //b!=null
    tail.next=b;
}
     return head.next;
    }
}

///////////////////////////////////////////////////////////////////
// Que:-141 { //  Cycle detection  \\}

 public boolean hasCycle(ListNode a) {

  if(a==null){
  return false;  //empty list no cycle
  }

       ListNode s=a;     slow pointer
       ListNode f=a;     fast pointer


       while(f!=null &&f.next!=null){
        s=s.next;                  //Update fast and slow pointer in their own term
        f=f.next.next;
        if(s==f){
            return true;
        }
    }

       return false;
}
}
//////////////////////////////////////////////////////////////////////////////////
///////////////  Count no of nodes in cycle:-

 public int countNoOfNodesInCycle(ListNode a) {

  if(a==null){
  return 0;  //empty list no cycle
  }

       ListNode s=a;     slow pointer
       ListNode f=a;     fast pointer


       while(f!=null &&f.next!=null){
        s=s.next;                  //Update fast and slow pointer in their own term
        f=f.next.next;
        if(s==f){
           // Cycle detected : Find length:-

           Node temp=slow;
           int length=0;
           do{
           temp=temp.next;
           length++;
           }
           while(temp != slow);
           return length;
        }
    }

       return 0;
}
}
//////////////////////////////////////////////////////////////////////////////////////////////////
Que:- 142 {/// return 1'st node where the cycle starts;   \\\}
  public ListNode detectCycle(ListNode head) {

        if(head==null ){
            return null;
        }

        ListNode fast=head;
        ListNode slow=head;

        while(fast!=null && fast.next !=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){

           //Cucle detected:-

           fast=head;

           while(fast!=slow){
               fast=fast.next;
               slow=slow.next;
           }
           return fast;
            }
        }
        //No cycle:-
        return null;
    }




    ////////////////876////////////////
    //////  /Middle of link list ////////////////

    //2pointer aproch":-

    public Node middle(Node head){

    Node f=head;
    Node s=head;


    while(f != null  && f.next!=null){
    f=f.next.next;
     s=s.next;
           }

           retirn s;  /s:- middle in even node no s== mid+1;
           }
 */


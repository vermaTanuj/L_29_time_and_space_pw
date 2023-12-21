package Linked_List;

import org.w3c.dom.Node;

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











 */

}

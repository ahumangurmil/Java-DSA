/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
    ListNode x= null,y,dummy;
    dummy=new ListNode();
    dummy.next=head;
    head=dummy;
    x=dummy;
    y=x.next;

    while(y!=null && y.next!=null){
    if(y.next!=null && y.val==y.next.val){
        while(y.next!=null && y.val==y.next.val){
            y=y.next;
        }
        x.next=y.next;
        y=x.next;
    }
    else{
        x=x.next;
        y=y.next;
    }
    }
    head=head.next;
    return head;
}
}
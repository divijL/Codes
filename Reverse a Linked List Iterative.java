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
    public ListNode reverseList(ListNode head) {
        ListNode temp1=head,temp2=null;
        while(head!=null)
        {
            temp1=head.next;
            head.next=temp2;
            temp2=head;
            head=temp1;
        }
        head=temp2;
        return head;
    }
}

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
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        int count=1;
        ListNode curr=head;
        while(curr.next!=null)
        {
            curr=curr.next;
            count++;
        }    

        int i=1;
        ListNode temp=head;

        if(count-n ==0)
        {
            head=head.next;
            return head;
        }

        while(i<(count-n))
        {
            temp=temp.next;
            i++;
        }

        if(count==1 && n==1)
            return null;        

        temp.next=temp.next.next;
        return head;
    }
}
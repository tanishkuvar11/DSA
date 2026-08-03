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
    public int GCD(int x, int y)
    {
        if(y==0)    
            return x;

        return GCD(y, x%y);
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) 
    {
        ListNode curr=head;

        while(curr.next!=null)
        {
            int x1=curr.val;
            int x2=curr.next.val;
            int g=GCD(x1,x2);
            ListNode newNode=new ListNode(g);
            newNode.next=curr.next;
            curr.next=newNode;

            curr=curr.next.next;
        }

        return head;    
    }
}
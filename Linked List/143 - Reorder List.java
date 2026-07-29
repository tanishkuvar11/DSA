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
    public void reorderList(ListNode head) 
    {
        if(head==null)
            return;

        int ctr=0;

        List<ListNode> l=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null)
        {
            l.add(curr);
            curr=curr.next;
        }

        int i=0, j=l.size()-1;

        while(i<j)
        {
            ListNode temp=l.get(i);
            ListNode next=temp.next;

            temp.next=l.get(j);
            i++;
            
            if(i>j)
                break;

            l.get(j).next=l.get(i);
            j--;
        }

        l.get(i).next=null;
    }
}
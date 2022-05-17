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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = new ListNode();
        dummyNode.next=head;
        ListNode rabbit = dummyNode,
                 turtle = dummyNode;
        for(int i=0;i<n;i++)
        {
          rabbit=rabbit.next;
        }
        
      while(rabbit.next!=null)
      {
        rabbit=rabbit.next;
        turtle=turtle.next;
      }
      
      turtle.next =turtle.next.next;
      
      return dummyNode.next;
    }
}
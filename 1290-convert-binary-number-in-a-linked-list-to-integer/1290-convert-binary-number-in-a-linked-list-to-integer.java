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
    public int getDecimalValue(ListNode head) {
      ListNode temp =head;
      int len =0,res=0;
      while(temp!=null)
      {
        len++;
        temp=temp.next;
      }
      
      temp=head;
      while(temp!=null)
      {
        res+=(int)(temp.val*Math.pow(2,--len));
        temp=temp.next;
      }
      
      return res;
    }
}
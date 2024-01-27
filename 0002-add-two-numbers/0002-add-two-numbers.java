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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
     
        ListNode res = new ListNode(0);
        ListNode curr = res;
        ListNode p1 = l1;
        ListNode p2 = l2;
        while(p1 !=null || p2 !=null){
            int sum = res.val;
            
            if(p1!=null){
                sum+=p1.val;
                p1=p1.next;
            }
            
            if(p2!=null){
                sum+=p2.val;
                p2=p2.next;
            }
            
            if(sum>=10){
               res.next = new ListNode(sum/10);
               res.val = sum%10;
            } else {
               res.val = sum;
               if(p1 ==null && p2 ==null){
                   return curr;
               }
               res.next = new ListNode();
            }
            
            res=res.next;
        }
        
        return curr;
    }
}
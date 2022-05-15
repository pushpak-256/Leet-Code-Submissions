class Solution {
    public ListNode middleNode(ListNode head) {
     ListNode turtle = head;
     ListNode rabbit = head;
      while(rabbit!=null && rabbit.next!=null)
      {
        turtle = turtle.next;
        rabbit=rabbit.next.next;
  
      }
      return turtle;
}
}
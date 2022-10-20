class Solution {
   
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode current = head;
        ListNode pre=null;
        
        while(current!=null){
            size++;
            current= current.next;
        }
    
        int nodeIdx = size - n;
        int count = 0;
        current = head;
        
        if(nodeIdx==0)
        {
            return head.next;
        }
        
       while(nodeIdx != 0){
           pre = current;
           current = current.next;
           nodeIdx--;
       }
        pre.next = current.next;
        current = null;
        return head;
    }
}

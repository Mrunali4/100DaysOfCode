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
    // public ListNode getMid(ListNode head){
    //     ListNode slow=head,fast=head;
    //     while(fast!=null && fast.next!=null){
    //         fast = fast.next.next;
    //         slow=slow.next;
    //     }
    //     return slow.next;
    // }
    ListNode getMid(ListNode head) {
        ListNode midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }
    
    public ListNode merge(ListNode head1,ListNode head2){
        ListNode list1 = head1;
        ListNode list2 = head2;
        ListNode dummyHead= new ListNode();
        ListNode result = dummyHead;
        
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                result.next = list1;
                list1=list1.next;
                result = result.next;
            }
            else if(list1.val>list2.val){
                result.next = list2;
                list2=list2.next;
                result = result.next;
            }
        }
        result.next = (list1 != null)? list1 : list2;
        return dummyHead.next;
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
                return head;   
        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return merge(left,right);
    
    
    }
        
}

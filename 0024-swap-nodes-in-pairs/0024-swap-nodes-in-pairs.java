class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode a = swapPairs(head.next.next);
        head.next.next = head;
        ListNode newhead = head.next;
        head.next = a;
        return newhead;
        
    }
}
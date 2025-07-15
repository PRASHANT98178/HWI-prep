class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next==null) return head;
        ListNode dummy1 = new ListNode(1);
        ListNode dummy2 = new ListNode(2);
        ListNode d1 = dummy1;
        ListNode d2 = dummy2;
        ListNode temp = head;
        while(temp!=null){
            d1.next = temp;
            temp = temp.next;
            d1 = d1.next;

            if(temp==null) break;
            d2.next = temp;
            temp = temp.next;
            d2 = d2.next;
            

        }
        d2.next = null;
        d1.next = dummy2.next;

        return head;
        
    }
}
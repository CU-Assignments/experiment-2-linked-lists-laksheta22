class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next; // Skip duplicate node
            } else {
                curr = curr.next; // Move to next node
            }
        }
        
        return head;
    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode temp_node = new ListNode(0);
        ListNode current_node = temp_node;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current_node.next = l1;
                l1 = l1.next;
            } else {
                current_node.next = l2;
                l2 = l2.next;
            }
            current_node = current_node.next;  // Move the current_node pointer inside the loop
        }

        if (l1 != null) {
            current_node.next = l1;
        } else if (l2 != null) {
            current_node.next = l2;
        }

        return temp_node.next;  // Return the merged list starting from the next node of temp_node
    }
}

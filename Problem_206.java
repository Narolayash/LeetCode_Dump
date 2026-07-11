public class Problem_206 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        ListNode.printList(l1);
        ListNode r1 = reverseList(l1);
        ListNode.printList(r1);
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null) return null;

        ListNode pre = null;
        ListNode curr = head;
        ListNode next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }

        return pre;
    }
}




// using recursion

//public ListNode helper(ListNode pre, ListNode curr) {
//    // base condition
//    if (curr == null) return pre;
//
//    ListNode next = curr.next;
//    curr.next = pre;
//    return helper(curr, next);
//}
//
//public ListNode reverseList(ListNode head) {
//    return helper(null, head);
//}

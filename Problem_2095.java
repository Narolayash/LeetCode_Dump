public class Problem_2095 {
    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null) return null;

        ListNode slow = new ListNode(-1);
        slow.next = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = slow.next.next;

        return head;
    }


//    public ListNode deleteMiddle(ListNode head) {
//        ListNode slow = null;
//        ListNode fast = head;
//
//        while (fast != null && fast.next != null) {
//            if (slow == null) slow = head;
//            else slow = slow.next;
//            fast = fast.next.next;
//        }
//
//        if (slow == null) return null;
//        slow.next = slow.next.next;
//
//        return head;
//    }
}

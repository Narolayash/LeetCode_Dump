public class Problem_19 {
    public int getCount(ListNode slow) {
        int count = 1;

        ListNode fast = slow;

        while (fast.next != null && fast.next.next != null) {
            count++;
            slow = slow.next;
            fast = fast.next.next;
        }

        return (fast.next != null && fast.next.next == null) ? 2 * count : 2 * count - 1;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int total = getCount(head);
        if (total == n) return head.next;

        ListNode pre = null;
        ListNode save = head;

        int currCount = 1;
        while (save != null && total - currCount++ + 1 != n) {
            pre = save;
            save = save.next;
        }

        pre.next = save.next;

        return head;
    }
}

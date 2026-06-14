import java.util.Stack;

public class Problem_2130 {
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        fast = null;
        while (slow != null) {
            ListNode next = slow.next;
            slow.next = fast;
            fast = slow;
            slow = next;
        }

        int maxTwinSum = 0;
        slow = head;

        while (fast != null) {
            maxTwinSum = Math.max(maxTwinSum, fast.val + slow.val);
            fast = fast.next;
            slow = slow.next;
        }

        return maxTwinSum;
    }



//    public int pairSum(ListNode head) {
//        int size = 0;
//        ListNode temp = head;
//        while (temp != null) {
//            size++;
//            temp = temp.next;
//        }
//
//        temp = head;
//        int i = 0;
//        int[] nodes = new int[size];
//        while (temp != null) {
//            nodes[i++] = temp.val;
//            temp = temp.next;
//        }
//        i = 0;
//        int j = size - 1;
//        int maxTwinSum = 0;
//        while (i < j) {
//            maxTwinSum = Math.max(maxTwinSum, nodes[i++] + nodes[j--]);
//        }
//
//        return maxTwinSum;
//    }







//    public int pairSum(ListNode head) {
//        ListNode slow = head;
//        ListNode fast = head;
//
//        int size=1;
//        while (fast.next.next != null) {
//            fast = fast.next.next;
//            slow = slow.next;
//            size++;
//        }
//
//        int[] nodes = new int[size*2];
//        fast = null;
//        slow = head;
//
//        int k = 0;
//        while (slow != null) {
//            nodes[k++] = slow.val;
//            slow = slow.next;
//        }
//
//        int maxTwinSum = 0;
//        int i=0, j = size*2 - 1;
//        while (i < j) {
//            maxTwinSum = Math.max(maxTwinSum, nodes[i++] + nodes[j--]);
//        }
//
//        return maxTwinSum;
//    }






    //    public int ctr(ListNode head) {
//        ListNode slow = head;
//        ListNode fast = head;
//
//        int i=0;
//        while (fast.next.next != null) {
//            fast = fast.next.next;
//            slow = slow.next;
//            i++;
//        }
//
//        return i;
//    }
//
//    public int pairSum(ListNode head) {
//        int n = ctr(head);
//        Stack<Integer> s = new Stack<>();
//
//        ListNode save = head;
//        for (int i=0; i<=n; i++) {
//            s.push(save.val);
//            save = save.next;
//        }
//
//        int maxTwinSum = 0;
//        for (int i=0; i<=n; i++) {
//            maxTwinSum = Math.max(maxTwinSum, s.pop() + save.val);
//            save = save.next;
//        }
//
//        return maxTwinSum;
//    }
}

public class Problem_203 {
    public static void main(String[] args) {

    }

    public static ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return head;
        
        while (head.val == val) {
            head = head.next;
        }



        return head;
    }
}

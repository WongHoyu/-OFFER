package JianZhiOffer;

public class Solution13 {
    public ListNode FindKthToTail(ListNode head,int k) {
        if (head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;

        while (k > 0 && fast != null) {
            fast = fast.next;
            k -= 1;
        }

        if (k > 0) {
            return null;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }
}

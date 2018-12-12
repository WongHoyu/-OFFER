package JianZhiOffer;

public class LeetCode14 {
    public static ListNode ReverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode newHead = null;
        ListNode p = null;

        while (head != null) {
            p = head.next;
            head.next = newHead;
            newHead = head;
            head = p;
        }

        return newHead;
    }

    public static void main(String[] args) {
        ListNode head = ListNode.init(new int[]{1, 2, 3, 4, 5});
        ListNode newHead = ReverseList(head);
        while (newHead != null) {
            System.out.println(newHead.val);
            newHead = newHead.next;
        }
    }
}

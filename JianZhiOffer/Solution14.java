package JianZhiOffer;

public class Solution14 {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }
        ListNode newHead = new ListNode(-1);
        ListNode p =newHead;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                p.next = list1;
                list1 = list1.next;
            } else {
                p.next = list2;
                list2 = list2.next;
            }

            p = p.next;
        }

        while (list1 != null) {
            p.next = list1;
            p = p.next;
            list1 = list1.next;
        }

        while (list2 != null) {
            p.next = list2;
            list2 = list2.next;
            p = p.next;
        }

        return newHead.next;
    }
}

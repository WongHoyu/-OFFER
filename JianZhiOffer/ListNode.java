package JianZhiOffer;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    /**
     * 将数组转化为ListNode
     * @param array
     * @return
     */
    public static ListNode init(int[] array) {
        ListNode listNode = new ListNode(0);
        ListNode head = listNode;
        for (int anArray : array) {
            listNode.next = new ListNode(anArray);
            listNode = listNode.next;
        }
        return head.next;
    }
}

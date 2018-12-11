package JianZhiOffer;


import java.util.ArrayList;
import java.util.Collections;

public class Solution3 {
    ArrayList<Integer> list = new ArrayList<>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode != null) {
            this.printListFromTailToHead(listNode.next);
            list.add(listNode.val);
        }

        return list;
    }

    public static void main(String[] args) {
        ListNode listNode = ListNode.init(new int[] {1,2,3,4,5});
//        Solution3.printListFromTailToHead(listNode);
    }

}

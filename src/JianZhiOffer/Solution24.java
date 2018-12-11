package JianZhiOffer;

/**
 * 对于指针可能需要画图辅助！！！
 * 否则空想有可能出现 NullPointException
 */
public class Solution24 {
    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

    public RandomListNode Clone(RandomListNode pHead)
    {
        if (pHead == null) {
            return null;
        }

        // 在目标节点后新增节点
        RandomListNode tempHead = pHead;
        while (tempHead != null) {
            RandomListNode copyNode = new RandomListNode(tempHead.label);
            copyNode.next = tempHead.next;
            tempHead.next = copyNode;
            tempHead = copyNode.next;
        }


        // 随机指针赋值
        tempHead = pHead;
        while (tempHead != null) {
            RandomListNode copyNode = tempHead.next;

            if (tempHead.random != null) {
                copyNode.random = tempHead.random.next;
            }

            tempHead = copyNode.next;
        }


        // 拆分
        tempHead = pHead;
        RandomListNode newHead = tempHead.next;
        while (tempHead.next != null) {
            // FIXME 如果 temHead.next == null !
            RandomListNode copyNode = tempHead.next;
            tempHead.next = copyNode.next;
            tempHead = copyNode;
        }

        return newHead;

    }


}

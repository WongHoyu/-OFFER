package JianZhiOffer;

public class Solution25 {
    TreeNode pre, head;

    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) {
            return null;
        }

        connect(pRootOfTree);
        return head;
    }

    private void connect(TreeNode node) {
        if (node == null) {
            return;
        }

        connect(node.left);
        node.left = pre;
        if (pre != null) {
            pre.right = node;
        }
        pre = node;
        // 只执行一次
        if (head == null) {
            head = node;
        }
        connect(node.right);
    }
}

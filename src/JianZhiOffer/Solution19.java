package JianZhiOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution19 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            list.add(temp.val);

            if (temp.left != null) {
                queue.add(temp.left);
            }

            if (temp.right != null) {
                queue.add(temp.right);
            }

        }

        return list;
    }
}

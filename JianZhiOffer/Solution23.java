package JianZhiOffer;

import java.util.ArrayList;

public class Solution23 {

    ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null) {
            return new ArrayList<>();
        }

        find(root, target, new ArrayList<>());
        return lists;
    }

    private void find(TreeNode root, int target, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }

        path.add(root.val);
        target -= root.val;

        if (target == 0 && root.left == null && root.right == null) {
            lists.add(new ArrayList<>(path));
        } else {
            find(root.left, target, path);
            find(root.right, target, path);
        }

        path.remove(path.size() - 1);
    }
}

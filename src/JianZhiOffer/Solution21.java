package JianZhiOffer;

import java.util.concurrent.SynchronousQueue;

public class Solution21 {
    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0) {
            return false;
        }

        return verify(sequence, 0, sequence.length - 1);
    }

    private boolean verify(int[] sequence, int first, int last) {
        if (last - first <= 1) {
            return true;
        }

        int root = sequence[last];
        int dividing = first;

        // 将数组分为左子树和右子树
        while (dividing < last && sequence[dividing] < root) {
            dividing++;
        }

        // 检查右子树中是否有小于root的
        for (int i = dividing; i < last; i++) {
            if (sequence[i] < root) {
                return false;
            }
        }

        return verify(sequence, first, dividing - 1) && verify(sequence, dividing, last - 1);
    }

    public static void main(String[] args) {
        Solution21 solution21 = new Solution21();
        boolean b = solution21.VerifySquenceOfBST(new int[] {});
        System.out.println(b);
    }
}

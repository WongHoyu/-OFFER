package JianZhiOffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * - - -
 * - - -
 * - - -
 *
 * -
 *
 * - -
 * - -
 *
 * -
 * -
 * -
 * -
 *
 * - - - -
 */
public class Solution17 {
    public static ArrayList<Integer> printMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return null;
        }

        ArrayList<Integer> list = new ArrayList<>();

        int up = 0, right = 0, down = matrix[0].length - 1, left = matrix.length - 1;

        while (up <= down && right <= left) {

            // up
            for (int i = up; i <= down; i++) {
                list.add(matrix[right][i]);
            }

            // right
            for (int i = right + 1; i <= left; i++) {
                list.add(matrix[i][down]);
            }

            // 只有一行，不执行
            if (up != left) {
                // down
                for (int i = down - 1; i >= up; i--) {
                    list.add(matrix[left][i]);
                }
            }

            if (right != down) {
                // left
                for (int i = left - 1; i > right; i--) {
                    list.add(matrix[i][up]);
                }
            }

            up++;
            right++;
            down--;
            left--;

        }

        return list;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(printMatrix(new int[][]{{1},{2},{3}}).toArray()));
    }
}

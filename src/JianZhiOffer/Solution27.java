package JianZhiOffer;

import java.util.ArrayList;

public class Solution27 {
    public static int MoreThanHalfNum_Solution(int [] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int length = array.length;

        int cmp = array[0];
        for (int i = 1, count = 1; i < length; i++) {
            count = cmp == array[i] ? count + 1 : count - 1;
            if (count == 0) {
                cmp = array[i];
                count = 1;
            }
        }


        int count = 0;
        for (int val : array) {
            if (val == cmp) {
                count++;
            }
        }

        return count > length / 2 ? cmp : 0;
    }

    public static void main(String[] args) {
        System.out.println(MoreThanHalfNum_Solution(new int[] {1,2,3,4}));
    }
}

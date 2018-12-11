package JianZhiOffer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution1 {
    public static boolean Find(int target, int [][] array) {
        if (array == null || array.length == 0 || array[0].length == 0) {
            return false;
        }
        int length = array.length - 1;
        int x = length, y = 0;
        while (x >= 0 && y <= length) {
            int temp = array[x][y];
            if (target == temp) {
                return true;
            } else if (target > temp) {
                y++;
            } else {
                x--;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Find(7, new int[][] {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}});
    }
}

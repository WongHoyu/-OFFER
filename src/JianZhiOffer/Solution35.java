package JianZhiOffer;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution35 {
    public static ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        if (array == null || array.length == 0) {
            return new ArrayList<>();
        }

        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int temp = array[left] + array[right];
            if (temp == sum) {
                return new ArrayList<>(Arrays.asList(array[left], array[right]));
            } else if (temp > sum) {
                right--;
            } else {
                left++;
            }
        }

        return new ArrayList<>();
    }

    public static void main(String[] args) {
        FindNumbersWithSum(new int[] {1,2,4,7,11,16}, 10);
    }
}

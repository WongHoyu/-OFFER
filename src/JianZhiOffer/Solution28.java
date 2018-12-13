package JianZhiOffer;

import java.util.ArrayList;
import java.util.List;

public class Solution28 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        if (input == null || input.length == 0 || k > input.length || k < 0) {
            return new ArrayList<>();
        }

        ArrayList<Integer> list = new ArrayList<>();

        int left = 0;
        int right = input.length - 1;

        while (left < right) {
            int p = findPartition(input, left, right);
            if (p == k - 1) {
                break;
            } else if (p > k - 1) {
                left += 1;
            } else {
                right -= 1;
            }
        }

        for (int i = 0; i < k; i++) {
            list.add(input[i]);
        }

        return list;
    }

    private int findPartition(int[] nums, int left, int right) {
        int partition = left;
        int pValue = nums[partition];
        // 原地划分
        swap(nums, left, right);

        for (int i = left; i < right; i++) {
            if (nums[i] < pValue) {
                swap(nums, partition, i);
                partition += 1;
            }
        }

        swap(nums, partition, right);

        return partition;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        Solution28 solution28 = new Solution28();
        System.out.println(solution28.GetLeastNumbers_Solution(new int[] {4,5,1,6,2,7,3,8}, 4));
    }



}

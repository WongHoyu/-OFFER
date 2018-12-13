package JianZhiOffer;

public class Solution29 {
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int temp : array) {
            sum += temp;
            maxSum = Math.max(maxSum, sum);
            if (sum < 0) {
                sum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Solution29 solution29 = new Solution29();
        System.out.println(solution29.FindGreatestSumOfSubArray(new int[] {2,-9}));
    }
}

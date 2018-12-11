package JianZhiOffer;

/**
 * 1.最小的数两边都要比他大
 * 2.如果中间的数比右边大，则
 */
public class Solution5 {
    public static int minNumberInRotateArray(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int length = array.length;
        int left = 0;
        int right = length - 1;

        while (left < right) {
            int mid = left + ((right - left) >> 1);

            // 说明 mid 到 right 是递增
            if (array[mid] == array[left] && array[mid] == array[right]) {
                return checkMin(array, left, right);
            } else if (array[mid] <= array[right]) {
                right = mid;
            } else {
                left += 1;
            }
        }

        return array[left];
    }

    public static int checkMin(int[] array, int left, int right) {
        for (int i = left; i <= right; i++) {
            if (array[i] > array[i + 1]) {
                return array[i + 1];
            }
        }
        return array[left];
    }

    public static void main(String[] args) {
        System.out.println(minNumberInRotateArray(new int[]{1,1,1,0,1}));
    }
}

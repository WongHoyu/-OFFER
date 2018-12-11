package JianZhiOffer;

public class Solution12 {
    public void reOrderArray(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }

        // 选择稳定的排序算法
        int length = array.length;
        int temp = 0;
        int flag = 0;
        for (int i = 0; i < length; i++) {
            if (array[i] % 2 != 0) {
                temp = array[i];
                for (int j = i; j > flag; j--) {
                    array[j] = array[j - 1];
                }

                array[flag] = temp;
                flag += 1;
            }
        }
    }
}

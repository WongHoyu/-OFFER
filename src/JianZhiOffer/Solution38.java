package JianZhiOffer;

import java.util.Arrays;

public class Solution38 {
    public boolean isContinuous(int [] numbers) {
        if (numbers == null || numbers.length == 0) {
            return false;
        }

        Arrays.sort(numbers);

        int zeroCount = 0;
        for (int num : numbers) {
            if (num == 0) {
                zeroCount++;
            }
        }

        int length = numbers.length;
        for (int i = zeroCount; i < length - 1; i++) {
            if (numbers[i + 1] == numbers[i]) {
                return false;
            }
            zeroCount -= numbers[i + 1] - numbers[i] - 1;
        }

        return zeroCount >= 0;
    }
}

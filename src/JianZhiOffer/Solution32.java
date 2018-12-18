package JianZhiOffer;


import java.util.HashMap;
import java.util.concurrent.locks.Lock;

public class Solution32 {
    public static int GetUglyNumber_Solution(int index) {
        if (index <= 6) {
            return index;
        }

        int i2 = 0, i3 = 0, i5 = 0;
        int[] dp = new int[index];
        dp[0] = 1;
        int next2 = 0, next3 = 0, next5 = 0;

        for (int i = 1; i < index; i++) {
            next2 = dp[i2] * 2;
            next3 = dp[i3] * 3;
            next5 = dp[i5] * 5;

            dp[i] = Math.min(next2, Math.min(next3, next5));
            int temp = dp[i];
            if (temp == next2) {
                i2 += 1;
            }
            if (temp == next3) {
                i3 += 1;
            }
            if (temp == next5) {
                i5 += 1;
            }
        }

        return dp[index - 1];
    }

    public static void main(String[] args) {
        System.out.println(GetUglyNumber_Solution(7));
    }
}

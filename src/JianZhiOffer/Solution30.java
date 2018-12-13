package JianZhiOffer;

public class Solution30 {
    public int NumberOf1Between1AndN_Solution(int n) {
        /*
         * 1. i = 1, 10, 100, ... 表示个位, 十位, 百位, ...
         * 2. 将 n 分开每个位数进行计算，such as 31165 -> a:311 b:65
         * 3. 如果第 i 位为 >= 2, 则1的个数为 (a / 10 + 1) * i
         * 4. 如果第 i 位为 == 1, 则1的个数为 (a / 10) * i + b + 1
         * 5. 如果第 i 位为 == 0, 则1的个数为 (a / 10) * 1
         */

        int count = 0;
        for (int i = 1; i <= n; i *= 10) {
            int a = n / i;
            int b = n % i;

            count += (a + 8) / 10 * i + ((a % 10 == 1) ? b + 1 : 0);
        }

        return count;

    }
}

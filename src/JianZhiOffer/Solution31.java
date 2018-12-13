package JianZhiOffer;

import java.util.Arrays;

public class Solution31 {
    public static String PrintMinNumber(int [] numbers) {
        if (numbers == null || numbers.length == 0) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        int length = numbers.length;
        String[] num = new String[length];

        for (int i = 0; i < length; i++) {
            num[i] = numbers[i] + "";
        }

        Arrays.sort(num, (s1, s2)->(s1 + s2).compareTo(s2 + s1));
        for (String temp : num) {
            result.append(temp);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(PrintMinNumber(new int[] {3,2,3}));
    }
}

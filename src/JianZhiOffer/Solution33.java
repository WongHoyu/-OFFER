package JianZhiOffer;

import java.util.BitSet;

public class Solution33 {
    public int FirstNotRepeatingChar(String str) {
        if (str == null || str.length() == 0) {
            return -1;
        }

        // ASCII 最多可表示 256个字符
        // 实际上只有128个字符
        char[] temp = new char[256];
        int length = str.length();

        for (int i = 0; i < length; i++) {
            temp[str.charAt(i)]++;
        }

        for (int i = 0; i < length; i++) {
            if (temp[str.charAt(i)] == 1) {
                return i;
            }
        }

        return -1;
    }

    public int FirstNotRepeatingChar2(String str) {
        if (str == null || str.length() == 0) {
            return -1;
        }

        BitSet b1 = new BitSet(256);
        BitSet b2 = new BitSet(256);

        for (char c : str.toCharArray()) {
            if (!b1.get(c) && !b2.get(c)) {
                // 0 0 -> 0 1
                b1.set(c);
            } else if (b1.get(c) && !b2.get(c)) {
                // 0 1 -> 1 1
                b2.set(c);
            }
        }

        int length = str.length();
        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            if (b1.get(c) && !b2.get(c)) {
                return i;
            }
        }

        return -1;
    }
}

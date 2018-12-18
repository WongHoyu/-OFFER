package JianZhiOffer;

import java.util.HashMap;
import java.util.Map;

public class Solution33 {
    public int FirstNotRepeatingChar(String str) {
        if (str == null || str.length() == 0) {
            return -1;
        }
        Map<Character,Integer> map = new HashMap<>();
        char[] temp = str.toCharArray();
        int length = temp.length;
        for (int i = 0; i < length; i++) {
            char c = temp[i];
            if (map.containsKey(c)) {
                map.remove(c);
            } else {
                map.put(c, i);
            }
        }

        int minIndex = 10001;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            minIndex = Math.min(minIndex, entry.getValue());
        }

        return minIndex;
    }
}

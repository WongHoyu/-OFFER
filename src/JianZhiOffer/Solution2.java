package JianZhiOffer;

public class Solution2 {
    public String replaceSpace(StringBuffer str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        String result = "";

        for (int i = 0; i < length; i++) {
            char temp = str.charAt(i);
            if (temp == ' ') {
                result += "%20";
            } else {
                result += String.valueOf(temp);
            }
        }

        return result;
    }
}

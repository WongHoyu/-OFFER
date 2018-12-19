package JianZhiOffer;

public class Solution36 {
    public String LeftRotateString(String str,int n) {
        if (str == null || str.length() == 0) {
            return str;
        }
        char[] temp = str.toCharArray();
        n %= str.length();
        int length = temp.length - 1;
        reverse(temp, 0, length);
        reverse(temp, 0, length - n);
        reverse(temp, length - n + 1, length);

        return new String(temp);
    }

    private void reverse(char[] temp, int i, int j) {
        while (i < j) {
            swap(temp, i, j);
            i++;
            j--;
        }
    }

    private void swap(char[] temp, int i, int j) {
        char c = temp[i];
        temp[i] = temp[j];
        temp[j] = c;
    }
}

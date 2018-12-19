package JianZhiOffer;

public class Solution37 {
    public String ReverseSentence(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }

        char[] temp = str.toCharArray();
        int i = 0, j = 0, length = str.length();
        while (j <= length) {
            if (j == length || temp[j] == ' ') {
                reverse(temp, i, j - 1);
                i = j + 1;
            }
            j++;
        }

        reverse(temp, 0, length - 1);

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

    public static void main(String[] args) {
        Solution37 solution37 = new Solution37();
        System.out.println(solution37.ReverseSentence("I am a student."));
    }
}

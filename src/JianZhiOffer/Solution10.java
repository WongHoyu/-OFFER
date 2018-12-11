package JianZhiOffer;

public class Solution10 {
    public static int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            n &= (n - 1);
            count += 1;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(NumberOf1(1));
    }
}

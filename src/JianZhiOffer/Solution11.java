package JianZhiOffer;

public class Solution11 {
    public static double Power(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }

        double result = base;
        int count = Math.abs(exponent);
        while (count > 1) {
            result *= base;
            count--;
        }

        return exponent > 0 ? result : 1 / result;
    }

    public static void main(String[] args) {
        System.out.println(Power(2,-3));
    }
}

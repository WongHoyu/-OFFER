package JianZhiOffer;

import java.util.Stack;

/**
 * 1 2 3 4 5
 * 4 5 3 2 1
 * 4 3 5 1 2
 */
public class Solution22 {
    public static boolean IsPopOrder(int [] pushA,int [] popA) {
        if (pushA == null || popA == null || pushA.length == 0 || popA.length == 0) {
            return false;
        }
        int length = pushA.length;
        Stack<Integer> stack = new Stack<>();
        int popAIndex = 0;

        for (int i = 0; i < length; i++) {
            stack.push(pushA[i]);
            while (popAIndex < length && !stack.isEmpty() && stack.peek() == popA[popAIndex]) {
                stack.pop();
                popAIndex++;
            }

        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(IsPopOrder(new int[] {1}, new int[] {}));
    }
}

package JianZhiOffer;

import java.util.Stack;

public class Solution20 {

    private Stack<Integer> tempStack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();


    public void push(int node) {
        tempStack.push(node);
        minStack.push(minStack.isEmpty() ? node : Math.min(minStack.peek(), node));
    }

    public void pop() {
        tempStack.pop();
        minStack.pop();
    }

    public int top() {
        return tempStack.peek();
    }

    public int min() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        Solution20 solution20 = new Solution20();
        solution20.push(3);
        System.out.println(solution20.min());
        solution20.push(4);
        System.out.println(solution20.min());
        solution20.push(2);
        System.out.println(solution20.min());
        solution20.push(3);
        System.out.println(solution20.min());
        solution20.pop();
        System.out.println(solution20.min());
        solution20.pop();
        System.out.println(solution20.min());
    }
}

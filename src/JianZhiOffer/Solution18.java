package JianZhiOffer;

import java.util.Iterator;
import java.util.Stack;

public class Solution18 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() throws Exception {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        if (stack2.isEmpty()) {
            throw new Exception("Queue is empty");
        }

        return stack2.pop();
    }

    public static void main(String[] args) throws Exception {
        Solution18 solution18 = new Solution18();
        solution18.push(1);
        solution18.push(2);
        solution18.push(3);
        System.out.println(solution18.pop());
    }
}

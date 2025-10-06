package Assignment8;
import java.util.*;
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String c : tokens) {
            if (c.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (c.equals("-")) {
                int second = stack.pop();
                int first = stack.pop();
                stack.push(first - second);
            } else if (c.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if (c.equals("/")) {
                int second = stack.pop();
                int first = stack.pop();
                stack.push(first / second);
            } else {
                stack.push(Integer.parseInt(c));
            }
        }

        return stack.peek();        
    }
}
/*
 * Time Complexity: O(n)
 * - We iterate through each token exactly once.
 * - Each operation (push, pop, arithmetic) takes constant time.
 * - So total time is linear in the number of tokens.

 * Space Complexity: O(n)
 * - In the worst case, all tokens are operands (no operators), so we push all onto the stack.
 * - Stack size grows linearly with input size.
 */
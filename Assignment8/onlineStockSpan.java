package Assignment8;


import java.util.Stack;

class StockSpanner {
    private Stack<int[]> stack;

    public StockSpanner() {
        stack = new Stack<>();
    }

    public int next(int price) {
        int span = 1;
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1]; 
        }
        stack.push(new int[]{price, span}); 
        return span;
    }
}
/*
 * Time Complexity: O(1) amortized per call to next()
 * - Each price is pushed and popped from the stack at most once.
 * - So across n calls, total operations are O(n), giving O(1) amortized time.

 * Space Complexity: O(n)
 * - In the worst case (strictly decreasing prices), all prices are stored.
 * - Stack holds at most n elements, each with [price, span].
 */

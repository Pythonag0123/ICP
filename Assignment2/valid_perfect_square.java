package Assignment2;

class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 0) return false;
        
        int sqrtInt = (int) Math.sqrt(num);
        return sqrtInt * sqrtInt == num;
    }
}
// Time complexity: O(1)

// Space complexity: O(1)

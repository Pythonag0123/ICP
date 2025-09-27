package Assignment2;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;

        
        for (int count = 0; count < k; count++) {
            int maxIndex = 0;

            
            for (int i = 1; i < n; i++) {
                if (nums[i] > nums[maxIndex]) {
                    maxIndex = i;
                }
            }

            
            if (count == k - 1) {
                return nums[maxIndex];
            }

            
            nums[maxIndex] = Integer.MIN_VALUE;
        }

        return -1;
    }
}

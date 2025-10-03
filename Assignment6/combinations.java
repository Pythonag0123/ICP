import java.util.*;
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> comb = new ArrayList<>();

        backtrack(1, comb, res, n, k);
        return res;
    }

    private void backtrack(int start, List<Integer> comb, List<List<Integer>> res, int n, int k) {
        if (comb.size() == k) {
            res.add(new ArrayList<>(comb));
            return;
        }

        for (int num = start; num <= n; num++) {
            comb.add(num);
            backtrack(num + 1, comb, res, n, k);
            comb.remove(comb.size() - 1);
        }
    } 
}
// n = total numbers to choose from
// k = size of each combination

//  Time Complexity: O(C(n, k) × k)
// - C(n, k) = number of valid combinations = n! / (k! × (n - k)!)
// - Each combination takes O(k) time to copy into the result list

//  Space Complexity: O(k + C(n, k) × k)
// - O(k) for recursion stack and temporary list during backtracking
// - O(C(n, k) × k) for storing all combinations in the result list
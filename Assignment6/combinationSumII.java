import java.util.*;
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();

        dfs(candidates, target, 0, new ArrayList<Integer>(), res);
        return res;
    }

    private void dfs(int[] candidates, int target, int start, List<Integer> comb, List<List<Integer>> res) {
        if (target < 0) {
            return;
        }

        if (target == 0) {
            res.add(new ArrayList<Integer>(comb));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i-1]) {
                continue;
            }

            if (candidates[i] > target) {
                break;
            }

            comb.add(candidates[i]);
            dfs(candidates, target - candidates[i], i + 1, comb, res);
            comb.remove(comb.size() - 1);
        }
    }
}


// n = number of elements in candidates[]
// target = desired sum
// comb = current combination being built
// start = current index in candidates[]

//  Time Complexity: O(2^n)
// - Each element has two choices: include or skip
// - Pruning via sorting and duplicate skipping improves practical runtime
// - Worst-case still exponential due to subset exploration

//  Space Complexity: O(n × k)
// - O(k) recursion depth where k = average size of valid combinations
// - O(n × k) total space to store all valid combinations in res
// - Temporary list comb uses O(k) space per recursive path
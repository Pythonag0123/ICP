
import java.util.*;
class Solution {
    public List<List<Integer>> subsets(int[] nums){
        // ans list me hum saare subsets store karenge
        List<List<Integer>> ans = new ArrayList<>();
        // ll ek temporary list hai jo current subset ko store karegi
        List<Integer> ll = new ArrayList<>();
        // recursion start karte hain index 0 se
        solve(0, nums, ans, ll);
        return ans;
    }

    public static void solve(int idx, int[] nums, List<List<Integer>> ans, List<Integer> ll){
        // Base case: agar index array ke length ke barabar hai
        if(idx == nums.length){
            // ll ka copy ans me add kar do (kyunki ll change hoti rahegi recursion me)
            ans.add(new ArrayList<>(ll));
            return;
        }

        // 1. Include current element nums[idx] in subset
        ll.add(nums[idx]);
        solve(idx + 1, nums, ans, ll);

        // Backtrack: last element remove kar do
        ll.remove(ll.size() - 1);

        // 2. Exclude current element nums[idx] from subset
        solve(idx + 1, nums, ans, ll);
    }
}

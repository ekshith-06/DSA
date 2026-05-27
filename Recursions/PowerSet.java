import java.util.*;

class Solution {

    public static void generatePowerSet(int index, List<Integer> subSet, List<List<Integer>> ans, int[] nums, int n) {
        if (index == n) {
            ans.add(new ArrayList<>(subSet));
            return;
        }
        subSet.add(nums[index]);
        generatePowerSet(index + 1, subSet, ans, nums, n);
        subSet.remove(subSet.size() - 1);
        generatePowerSet(index + 1, subSet, ans, nums, n);
    }

    public List<List<Integer>> powerSet(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subSet = new ArrayList<>();
        generatePowerSet(0, subSet, ans, nums, nums.length);
        return ans;

        // your code goes here
    }
}

public class PowerSet {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { 1, 2, 3 };
        List<List<Integer>> result = sol.powerSet(nums);

        // Print the result
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }
}

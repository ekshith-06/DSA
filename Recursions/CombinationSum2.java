import java.util.*;

class Solution {
    public static int getUpperBound(int[] a, int l, int h, int k) {
        while (l <= h) {
            int m = l + (h - l) / 2;
            if (a[m] <= k)
                l = m + 1;
            else
                h = m - 1;
        }
        return h;
    }

    public static void getCombination(int index, int n, int sum, int reqSum, int[] candidates, List<List<Integer>> ans,
            List<Integer> currList) {
        if (sum == reqSum) {
            ans.add(new ArrayList<>(currList));
            return;
        }
        if (index > n || sum > reqSum)
            return;
        sum += candidates[index];
        currList.add(candidates[index]);
        getCombination(index + 1, n, sum, reqSum, candidates, ans, currList);
        currList.remove(currList.size() - 1);
        sum -= candidates[index];
        // int i=index;
        // for(;i<candidates.length-1;i++){
        // if(candidates[i+1]!=candidates[i]) break;
        // }
        getCombination(getUpperBound(candidates, 0, n, candidates[index]) + 1, n, sum, reqSum, candidates, ans,
                currList);
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> currList = new ArrayList<>();
        Arrays.sort(candidates); // We Are Sorting the array Inorder to skip the duplicates further..
        getCombination(0, candidates.length - 1, 0, target, candidates, ans, currList);
        return ans;
        // your code goes here
    }
}

public class CombinationSum2{
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] candidates = { 10, 1, 2, 7, 6, 1, 5 };
        int target = 8;
        List<List<Integer>> result = sol.combinationSum2(candidates, target);
        System.out.println(result); // Output: [[1, 1, 6], [1, 2, 5], [1, 7], [2, 6]]
    }
}

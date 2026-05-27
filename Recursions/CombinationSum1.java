import java.util.*;
class Solution {
    public static void getCombinations(int index,int []candidates,int target,List<List<Integer>> ans,int sum,List<Integer>currList,int n){
        if(sum==target){
            ans.add(new ArrayList<>(currList));
            return;
        }
        if(index>n || sum>target) return;
        sum+=candidates[index];
        currList.add(candidates[index]);
        getCombinations(index,candidates,target,ans,sum,currList,n);
        currList.remove(currList.size()-1);
        sum-=candidates[index];
        getCombinations(index+1,candidates,target,ans,sum,currList,n);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<List<Integer>> ans = new ArrayList <>();
       List<Integer>currList=new ArrayList<>();
       getCombinations(0,candidates,target,ans,0,currList,candidates.length-1);
       return ans;
    }
}
public class CombinationSum1 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] candidates = { 2, 3, 6, 7 };
        int target = 7;
        List<List<Integer>> result = sol.combinationSum(candidates, target);
        System.out.println(result); // Output: [[2, 2, 3], [7]]
    }
}

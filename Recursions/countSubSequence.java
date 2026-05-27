import java.util.*;
class Solution {
    public static int getCount(int []nums,int index,int reqSum,int sum,int n){
        if(sum==reqSum) return 1;
        if(index>n || sum>reqSum) return 0;
        sum+=nums[index];
        int take=getCount(nums,index+1,reqSum,sum,n);
        sum-=nums[index];
        int notTake=getCount(nums,index+1,reqSum,sum,n);
        return take+notTake;
    }
    public int countSubsequenceWithTargetSum(int[] nums, int k) {
        return getCount(nums,0,k,0,nums.length-1);
    }
}

public class countSubSequence {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { 1, 2, 3 };
        int k = 5;
        int result = sol.countSubsequenceWithTargetSum(nums, k);
        System.out.println(result); // Output: 1 (because the subsequence [2, 3] sums to 5)
        
    }
}

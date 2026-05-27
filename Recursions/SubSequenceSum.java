class Solution {
    public static boolean isAvail(int []nums,int index ,int n, int reqSum,int sum)
    {
        if(sum==reqSum) return true;
        if(sum>reqSum || index>n) return false;
        sum+=nums[index];
        boolean path1=isAvail(nums,index+1,n,reqSum,sum);
        sum-=nums[index];
        boolean path2=isAvail(nums,index+1,n,reqSum,sum);
        return path1 || path2;
    }
    public boolean checkSubsequenceSum(int[] nums, int k) {
        return isAvail(nums,0,nums.length-1,k,0);
    }
}

public class SubSequenceSum {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { 1, 2, 3 };
        int k = 5;
        boolean result = sol.checkSubsequenceSum(nums, k);
        System.out.println(result); // Output: true (because the subsequence [2, 3] sums to 5)
    }
}
import java.util.*;
class Solution {
    public static void getSum(int []nums,List <Integer> ans,int index,int n,int sum){
        if(index>n){
            ans.add(sum);
            return;
        }
        sum+=nums[index];
        getSum(nums,ans,index+1,n,sum);
        sum-=nums[index];
        getSum(nums,ans,index+1,n,sum);
    }
    public List<Integer> subsetSums(int[] nums) {
        List <Integer> ans=new ArrayList<>();
        getSum(nums,ans,0,nums.length-1,0);
        return ans;
        //your code goes here
    }
}
public class SubSets1{
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { 1, 2, 3 };
        List<Integer> result = sol.subsetSums(nums);
        System.out.println(result); // Output: [0, 3, 2, 5, 1, 4, 3, 6]
    }
}

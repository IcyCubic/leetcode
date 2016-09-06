package solutions;
/*
You are a professional robber planning to rob houses along a street. Each 
house has a certain amount of money stashed, the only constraint stopping 
you from robbing each of them is that adjacent houses have security 
system connected and it will automatically contact the police if two 
adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of 
each house, determine the maximum amount of money you can rob tonight 
without alerting the police.

Credits:
Special thanks to @ifanchu for adding this problem and creating all test cases. Also thanks to @ts for adding additional test cases.
*/
public class Q198_HouseRobber {
    public int rob(int[] nums) {
        if (nums.length==0) return 0;
        if (nums.length ==1) return nums[0];
        
        int[] mark = new int[nums.length];
        
        mark[0] = nums[0];
        mark[1] = Math.max(nums[0],  nums[1]);
        
        for (int i = 2; i < nums.length; i++){
        	mark[i] = Math.max(nums[i]+mark[i-2], mark[i-1]);
        }
        return mark[nums.length-1];
    }
}

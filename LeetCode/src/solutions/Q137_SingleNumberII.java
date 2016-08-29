package solutions;

import java.util.HashSet;
import java.util.Set;

/*
Given an array of integers, every element appears three times except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory? 
*/
public class Q137_SingleNumberII {
    public int singleNumber(int[] nums) {
    	int result = 0;
    	Set<Integer> p1 = new HashSet<Integer>();
    	Set<Integer> p2 = new HashSet<Integer>();
    	
    	for (int i = 0; i < nums.length; i++){
    		if (!p1.contains(nums[i]))
    			p1.add(nums[i]);
    		else if (!p2.contains(nums[i]))
    			p2.add(nums[i]);
    		else if (p2.contains(nums[i]) && p1.contains(nums[i])){
    			p1.remove(nums[i]);
    			p2.remove(nums[i]);
    		}    			
    	}
    	for (int a : p1){
    		result = a;
    	}    	    	
    	return result;
    }
}

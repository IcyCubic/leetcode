package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? 
Find all unique triplets in the array which gives the sum of zero.

Note: The solution set must not contain duplicate triplets.

For example, given array S = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]

*/
public class Q015_3Sum {
    public List<List<Integer>> threeSum(int[] nums) {    	
    	List<List<Integer>> result = new ArrayList<>();
    	if (nums.length < 3 || nums == null) return result;
    	Arrays.sort(nums);
    	for (int x : nums){
    		System.out.print(x+" ");
    	}
    	System.out.println();
    	
    	for (int index = 0, max = nums.length; index < max; index++){
    		if (index > 0 && nums[index] == nums[index-1]){ // skip if this number is the same as the one before
    			continue;
    		}
    		int target = 0 - nums[index];  // a + b + c = 0; b + c = 0 - a
    		int start = index + 1;
    		int end = max - 1;
    		while(start < end) {    		
	    		if (nums[start] + nums[end] == target){
	    			System.out.println("index: "+index+" start: "+start+" end: "+end);
	    			result.add(Arrays.asList(nums[index], nums[start], nums[end]));
	    			while(start < end && nums[start] == nums[start +1]) { // skip if this number is the same as the one after
	    				start++; 
	    			}
	    			while(start < end && nums[end] == nums[end -1]) { // skip if this number is the same as the one before
	    				end--;  
	    			}
	    			start++;
	    			end--;
	    		} else if (nums[start] + nums[end] < target){
	    			start++;
	    		} else {
	    			end--;
	    		}
    		}
    	} 	
        return result;
    }
    
    public static void main(String[] args){
    	Q015_3Sum ts = new Q015_3Sum();
//		List<List<Integer>> result = ts.threeSum(new int[] {-2, 0, 1, 1, 2 });
    	List<List<Integer>> result = ts.threeSum(new int[] {-1, 0, 1, 2, -1, -4});    	
    	System.out.println("[");
    	for (List<Integer> list : result){
    		System.out.print("[");    		
    		for (Integer number : list){
    			System.out.print(number);
    			if (list.indexOf(number) != (list.size() -1)){
    				System.out.print(",");
    			}
    		}
    		if (result.indexOf(list) != (result.size() -1)){  
        		System.out.println("],");	
    		} else {
    			System.out.println("]");
    		}
    	}
    	System.out.println("]");
    }
}

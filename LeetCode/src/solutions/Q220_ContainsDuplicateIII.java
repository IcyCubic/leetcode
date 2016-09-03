package solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*
Given an array of integers, find out whether there are two distinct 
indices i and j in the array such that the difference between nums[i] 
and nums[j] is at most t and the difference between i and j is at 
most k. 

----
need to optimize. Technically works, but takes too long
*/
public class Q220_ContainsDuplicateIII {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
        	if (i > 0){
	        	for (Map.Entry<Integer, Integer> e : map.entrySet()){
	        		long dt = Math.abs((long)nums[i] - (long)e.getKey());
	        		if (dt <= t && Math.abs(i - e.getValue()) <= k)
	        			return true;        			
	        	}
        	}
        	map.put(nums[i], i);
        }    	
    	return false;
    }
    public static void main(String[] args){
    	Q220_ContainsDuplicateIII test = new Q220_ContainsDuplicateIII();
    	boolean a = test.containsNearbyAlmostDuplicate(new int[]{-1,2147483647}, 1, 2147483647);
    	System.out.println(a);
    }
}

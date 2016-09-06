package solutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

Note:

    Each element in the result must be unique.
    The result can be in any order.
*/
public class Q349_IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {

//        Set<Integer> set1 = new HashSet<Integer>();
//        Set<Integer> set2 = new HashSet<Integer>();
//        
//        for (int i : nums1){
//        	set1.add(i);
//        }
//        for (int i : nums2){
//        	if (set1.contains(i))
//        		set2.add(i);
//        }
//        int[] result = new int[set2.size()];
//        int count = 0;
//        for (int i : set2){
//        	result[count] = i;
//        	count++;
//        }        	
//        return result;
// ------------------------
    	Set<Integer> set = new HashSet<>();
    	Arrays.sort(nums2);
    	for (int n : nums1){
    		if (search(nums2, n)){
    			set.add(n);
    		}
    	}
	    int[] result = new int[set.size()];
	    int count = 0;
	    for (int i : set){
	      	result[count] = i;
	      	count++;
	    }        	
	    return result;
    }
    private boolean search(int[] nums, int target){
    	int low = 0;
    	int high = nums.length-1;
    	while (low <= high){
    		int mid = (low + high) / 2;
    		if (nums[mid]==target) return true;
    		if (nums[mid] > target)
    			high = mid - 1;
    		else
    			low = mid + 1;
    	}
    	return false;
    }    
}

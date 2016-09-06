package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].

Note:

    Each element in the result should appear as many times as it shows in
    both arrays.
    The result can be in any order.

Follow up:

    What if the given array is already sorted? How would you optimize your algorithm?
    What if nums1's size is small compared to nums2's size? Which algorithm is better?
    What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
*/
public class Q350_IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for (int i : nums1){
        	list.add(i);
        }
        for (int i : nums2){
        	if (list.contains(i)){
        		result.add(i);
        		list.remove((Integer)i);
        	}
        }
        int[] res = new int[result.size()];
        int count = 0;
        for (Integer i : result){
        	res[count++] = i;
        }
        return res;
    }
    //unused
    private boolean search(int[] nums, int target){
    	Arrays.sort(nums);
    	int low = 0;
    	int high = nums.length-1;
    	int mid = (low + high) / 2;
    	while (low <= high){
    		if (nums[mid]==target) return true;
    		else if (nums[mid] > target) high = mid - 1;
    		else low = mid + 1;
    	}    	
    	return false;
    }
}

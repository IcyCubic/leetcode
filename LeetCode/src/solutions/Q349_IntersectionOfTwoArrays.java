package solutions;

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

        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        
        for (int i : nums1){
        	set1.add(i);
        }
        for (int i : nums2){
        	if (set1.contains(i))
        		set2.add(i);
        }
        int[] result = new int[set2.size()];
        int count = 0;
        for (int i : set2){
        	result[count] = i;
        	count++;
        }        	
        return result;
    }
}

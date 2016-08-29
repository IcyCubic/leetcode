package solutions;

import java.util.HashMap;
import java.util.Map;

/*
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

Credits:
Special thanks to @ts for adding this problem and creating all test cases.

---
iterate through the array
track elements
track number of times an element appears
return highest number
*/
public class Q169_MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
        	Integer x = nums[i];
        	if (count.containsKey(x)) // if exists in map, +1 to count
        		count.replace(x, count.get(x)+1);        		
        	else
        		count.put(x, 1); // if not, put it in map with a count of 1
        }
        Map.Entry<Integer, Integer> max = null;
        for (Map.Entry<Integer, Integer> entry : count.entrySet()){
        	if (max == null || entry.getValue().compareTo(max.getValue()) > 0)
        		max = entry;

        }
        return max.getKey();
    }
}
/*/hurr
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
*/

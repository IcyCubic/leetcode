package solutions;

import java.util.HashSet;
import java.util.Set;

/*
Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory? */
public class Q136_SingleNumber {
//    public int singleNumber(int[] nums) {
//        int result = 0;
//        Set<Integer> container = new HashSet<Integer>();
//        for (int i = 0; i < nums.length; i++){
//        	if (container.contains(nums[i])) container.remove(nums[i]);
//        	else container.add(nums[i]);
//        }
//        for (int a : container){
//        	result = a;
//        }
//        return result;
//    }
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++)
        	result = result ^ nums[i];
        return result;
    }
}

package solutions;

import java.util.Arrays;

/*
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold 
additional elements from nums2. The number of elements initialized in nums1 and nums2 
are m and n respectively.
*/
public class Q088_MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    	int in = 0;    	
    	for (int i = m; i < m + n; i++){
    		nums1[i] = nums2[in];
    		in++;
    	}
//        Arrays.sort(nums1);
    	for (int i = 0; i < nums1.length; i++){
    		for (int j = 0; j < nums1.length; j++){
    			int temp = 0;    			
    			System.out.print("i["+i+"]: "+nums1[i]+" j["+j+"]: "+ nums1[j]+" || ");
    			if (nums1[i] < nums1[j]){
    				temp = nums1[i];
    				nums1[i] = nums1[j];
    				nums1[j] = temp;
    			}
    			for (int k : nums1) System.out.print(k);
    			System.out.println();
    		}
    	}
    }
    public static void main(String[] args){
    	Q088_MergeSortedArray test = new Q088_MergeSortedArray();
    	int[] trial = new int[]{3,5,0,0}; 
		test.merge(trial, 2, new int[]{1,2},2);
    	for (int a : trial) System.out.println(a);    	
    }
}

package solutions;

import java.util.ArrayList;
import java.util.List;

/*
Given a singly linked list, determine if it is a palindrome.

Follow up:
Could you do it in O(n) time and O(1) space?
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/*
iterate through linked list
save values to arraylist
determine if arraylist is a palindrome
*/ 
public class Q234_PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
    	if (head == null) return true;
    	List<Integer> list = new ArrayList<Integer>();
    	while (head != null){
    		list.add(head.val); // save values to arraylist
    		head = head.next; // iterate linked list
    	}
    	Integer[] array = list.toArray(new Integer[0]);
    	int revIndex = array.length -1;
    	for (int i = 0; i < array.length; i++){
    		if (!(array[i].equals(array[revIndex--]))) return false;
    	}
        return true;
    }
}

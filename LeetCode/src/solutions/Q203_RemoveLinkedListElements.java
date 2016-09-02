package solutions;
/*
Remove all elements from a linked list of integers that have value val.

Example
Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5

Credits:
Special thanks to @mithmatt for adding this problem and creating all 
test cases.
---
Needs:
stub pointer for the result
current pointer
next pointer 
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Q203_RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
    	if (head == null) return null;    	
        ListNode temp = new ListNode(0);
        temp.next = head;        
        ListNode peeker = temp; // peeks at the next item
        while (peeker.next != null){            
        	if (peeker.next.val == val)
        		peeker.next = peeker.next.next;        		
        	else
        		peeker = peeker.next;
        }
        return temp.next;
    }
}

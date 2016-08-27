package solutions;
/*
Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3. 
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Q083_RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
    	if (head == null || head.next == null) return head;
        ListNode previous = head;
        ListNode current = head.next;        
        
        while (current != null){
        	if (current.val == previous.val){
        		current = current.next;
        		previous.next = current;
        	}
        	else {
        		current = current.next;
        		previous = previous.next;
        	}
        }        
        return head;
    }
    public static void main(String[] args){
    	Q083_RemoveDuplicatesFromSortedList test = new Q083_RemoveDuplicatesFromSortedList();
    	ListNode head = new ListNode(1);
    	head.next = new ListNode(2);
    	head.next.next = new ListNode(3);
    	head.next.next.next = new ListNode(5);
    	head.next.next.next.next = new ListNode(5);
    	
    	ListNode result = test.deleteDuplicates(head);
    	while (result != null){
    		System.out.println(result.val + " ");
    		result = result.next;
    	}
    }
}

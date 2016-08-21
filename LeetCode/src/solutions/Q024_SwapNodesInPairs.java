package solutions;
/*

Given a linked list, swap every two adjacent nodes and return its head.

For example,
Given 1->2->3->4, you should return the list as 2->1->4->3.

Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed. 
*/
public class Q024_SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode result = new ListNode(9999);
    	result.next = head;
    	ListNode pointer = result;
    	
        while (pointer.next != null && pointer.next.next != null){
        	ListNode one = pointer.next;
        	ListNode two = pointer.next.next;
        	pointer.next = two;
        	one.next = two.next;
        	two.next = one;
        	pointer = pointer.next.next;
    	}
    	return result.next;
    }
}

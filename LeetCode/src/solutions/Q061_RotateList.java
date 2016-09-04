package solutions;
/*
Given a list, rotate the list to the right by k places, where k is non-negative.

For example:
Given 1->2->3->4->5->NULL and k = 2,
return 4->5->1->2->3->NULL.
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Q061_RotateList {
    public ListNode rotateRight(ListNode head, int k) {
    	if (head == null || head.next == null) return head;
        ListNode ph = new ListNode(0);
        ph.next = head;
        ListNode counter = ph;
        int len = 0;
        while (counter.next != null){
        	len++;
        	counter = counter.next;
        }
        for (int i = 0; i < k%len; i++){        	
        	ListNode anchor = ph.next;
        	ListNode scout = ph.next.next;
        	while (scout.next != null){
        		scout = scout.next;
        		anchor = anchor.next;        		        		
        	}
        	scout.next = ph.next;
        	ph.next = scout;
        	anchor.next = null;        	
        }        
        return ph.next;
    }
}

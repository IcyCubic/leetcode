package solutions;
// Reverse a singly linked list.
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Q206_ReverseLinkedList {
//    public ListNode reverseList(ListNode head) { //[h][2][3][4][5]
//        // if head is null or only contains 1 node, return head
//    	if (null == head || null == head.next) return head;
//    	// placeholder node to start the result linked list
//    	ListNode ph = new ListNode(999); // [ph] anchor for result
//    	ph.next = head; // [ph]>[head]>[2]>[3]>[4]>[5]
//    	ListNode previous = ph; // [ph pre] [h] [2] [3] [4] [5]
//    	ListNode current = head; // [ph pre] [h & c] [2] [3] [4] [5]
//    	while (head.next != null){ // while the current node being looked at has a next 
//    		ListNode move = current.next; // [ph pre] [h & c] [m] [3] [4] [5]
//    		current.next = move.next; // link c1 to 3, delinking m2
//    		move.next = previous.next; // m2.next is now linked to h1
//    		previous.next = move; // 
//    	}
//    	
//    	// return the result list from the placeholder node
//    	return ph.next;
//    }
    public ListNode reverseList(ListNode head) { //[h][2][3][4][5]
        // if head is null or only contains 1 node, return head
    	if (null == head || null == head.next) return head;
    	// placeholder node to start the result linked list
    	ListNode ph = new ListNode(999); // [ph] anchor for result
    	ph.next = head; // [ph]>[head]>[2]>[3]>[4]>[5]
    	
    	while (head.next != null){ // while the current node being looked at has a next 
    		ListNode move = head.next; // [ph pre] [h & c] [m] [3] [4] [5]
    		head.next = move.next; // link c1 to 3, delinking m2
    		move.next = ph.next; // m2.next is now linked to h1
    		ph.next = move; // 
    	}
    	
    	// return the result list from the placeholder node
    	return ph.next;
    }
}

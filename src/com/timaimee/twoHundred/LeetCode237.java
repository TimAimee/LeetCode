package com.timaimee.twoHundred;

/**
 * @author timaimee
 * @date 2016-06-14 22:30
 * @des Delete Node in a Linked List
 *
 */
public class LeetCode237 {
	public static void main(String[] args) {
		ListNode head0 = new ListNode(0);
		ListNode head1 = new ListNode(1);
		ListNode head2 = new ListNode(2);
		ListNode head3 = new ListNode(3);
		ListNode head4 = new ListNode(4);
		ListNode head5 = new ListNode(5);
		ListNode head6 = new ListNode(6);
		head0.next = head1;
		head1.next = head2;
		head2.next = head3;
		head3.next = head4;
		head4.next = head5;
		head5.next = head6;
		deleteNode(head0);
	}

	// 4ms
	public static void deleteNode(ListNode node) {
		if (node.next != null) {
			node.val = node.next.val;
			node.next = node.next.next;
		}
	}

}

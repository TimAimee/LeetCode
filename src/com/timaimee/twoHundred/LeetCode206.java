package com.timaimee.twoHundred;

import java.util.ArrayList;

/**
 * @author timaimee
 * @date 2016-05-24 22:22
 * @des Reverse Linked List
 */
public class LeetCode206 {

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
		ListNode head = reverseList(head0);
		System.out.println("\n");
		while (head != null) {
			System.out.println(head.val);
			if (head.next != null) {
				head = head.next;
			} else {
				break;
			}
		}
	}

	// 2ms,save in the arraylist,and reverse
	public static ListNode reverseList(ListNode head) {
		ArrayList<ListNode> aList = new ArrayList<>();
		while (head != null) {
			aList.add(head);
			if (head.next != null) {
				head = head.next;
			} else {
				break;
			}
		}
		for (int i = aList.size() - 1; i >= 1; i--) {
			aList.get(i).next = aList.get(i - 1);
		}
		head = aList.get(aList.size() - 1);
		aList.get(0).next = null;
		return head;
	}

	// 0ms first get the nextTmp,and then replace the currnext to preTemp.
	public ListNode reverseListByIterative(ListNode head) {
		ListNode prev = null;
		ListNode curr = head;
		while (curr != null) {
			ListNode nextTemp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextTemp;
		}
		return prev;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

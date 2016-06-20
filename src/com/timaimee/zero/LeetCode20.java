package com.timaimee.zero;

import com.timaimee.model.ListNode;

/**
 * @author timaimee
 * @date 2016-05-29 23:51
 * @des Reverse Integer
 */
public class LeetCode20 {
	public static void main(String[] args) {

		ListNode heada0 = new ListNode(0);
		ListNode heada1 = new ListNode(1);
		ListNode heada2 = new ListNode(4);
		ListNode heada3 = new ListNode(3);

		ListNode headb0 = new ListNode(4);
		ListNode headb1 = new ListNode(2);
		ListNode headb2 = new ListNode(6);
		heada0.next = heada1;
		heada1.next = heada2;

		headb0.next = headb1;
		headb1.next = headb2;

		heada0 = mergeTwoLists(heada0, headb0);

		while (heada0 != null) {
			System.out.println(heada0.val);
			heada0 = heada0.next;
		}
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		ListNode head = null;
		ListNode end = null;
		ListNode first = l1;
		ListNode second = l2;
		while (first != null && second != null) {
			int temp1 = first.val;
			int temp2 = second.val;
			if (temp1 <= temp2) {
				if (head == null) {
					head = first;
					end = head;
				} else {
					end.next = first;
					end = end.next;
				}
				first = first.next;
			} else {
				if (head == null) {
					head = second;
					end = head;
				} else {
					end.next = second;
					end = end.next;
				}
				second = second.next;
			}

		}
		// 两个链表的长度不同时，当一方遍历完毕，另一方剩余的元素全部接到新的链表中
		if (first != null) {
			end.next = first;
		}
		if (second != null) {
			end.next = second;
		}
		return head;
	}
}

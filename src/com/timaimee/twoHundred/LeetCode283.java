package com.timaimee.twoHundred;

import java.util.ArrayList;

import javax.swing.text.StyledEditorKit.ForegroundAction;

/**
 * @author timaimee
 * @date 2016-05-27 22:56
 * @des Move Zeroes
 *
 */
public class LeetCode283 {
	public static void main(String[] args) {
		int[] arr = new int[] { 0, 0, 0, 2, 0, 1, 2 };
		moveZero(arr);
	}

	// 1ms
	public static void moveZero(int[] nums) {
		int p1 = 0;
		int p2 = 0;
		for (; p1 < nums.length; p1++) {
			if (nums[p1] != 0) {
				nums[p2] = nums[p1];
				p2++;
			}
		}
		for (; p2 < nums.length; p2++) {
			nums[p2] = 0;
		}
	}

	// 3ms
	public static void moveZeroes(int[] nums) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				arrList.add(nums[i]);
				nums[i] = 0;
			}
		}
		for (int i = 0; i < arrList.size(); i++) {
			nums[i] = arrList.get(i);
		}

	}

	// 24ms
	public static void moveZeroess(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				for (int j = i; j < nums.length; j++) {
					if (nums[j] != 0) {
						int temp = nums[i];
						nums[i] = nums[j];
						nums[j] = temp;
						break;
					}
				}
				getStr(nums);
			}
		}

	}

	public static void getStr(int[] nums) {
		System.out.print("\n");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ",");
		}
	}
}

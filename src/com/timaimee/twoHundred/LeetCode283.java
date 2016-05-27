package com.timaimee.twoHundred;

import java.util.ArrayList;

/**
 * @author timaimee
 * @date 2016-05-27 22:56
 * @des Move Zeroes
 *
 */
public class LeetCode283 {
	public static void main(String[] args) {
		int[] arr = new int[] { 0, 0, 0, 2, 0, 1, 2 };
		moveZeroes(arr);
	}

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

}

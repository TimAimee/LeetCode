package com.timaimee.twoHundred;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @date 2016-06-13
 * @author timaimee
 * @des Contains Duplicate
 */
public class LeetCode217 {
	public static void main(String[] args) {
		int lenght = 30000;
		int[] data = new int[lenght];
		for (int i = 0; i < lenght; i++) {
			data[i] = i;
		}
		System.out.println(containsDuplicate(data));
	}

	//6ms beat 83%
	public static boolean containsDuplicate(int[] nums) {
		if (nums == null || nums.length <= 1) {
			return false;
		}
		Arrays.sort(nums);
		int temp = nums[0];
		int position = 0;
		while (position < nums.length - 1) {
			position++;
			if (temp == nums[position]) {
				return false;
			} else {
				temp = nums[position];
			}
		}

		return true;
	}

	// user set ,Time Limit Exceeded
	public static boolean containsDuplicateNotPass(int[] nums) {
		Set<Integer> mIntArr = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			mIntArr.add(nums[i]);
		}
		return mIntArr.size() == nums.length;
	}
}

package com.timaimee.zero;

import java.util.Arrays;

/**
 * @author timaimee
 * @date 2016-05-29 23:51
 * @des Plus One
 */
public class LeetCode66 {
	public static void main(String[] args) {
		int[] num = new int[] { 9 };
		System.out.println(Arrays.toString(plusOne(num)));
	}

	// my
	public static int[] plusOne(int[] digits) {
		boolean isTenInFirst = false;
		for (int i = digits.length - 1; i >= 0; i--) {
			if (++digits[i] % 10 != 0) {
				return digits;
			} else {
				digits[i] = 0;
				if (i == 0) {
					isTenInFirst = true;
				}

			}
		}
		if (isTenInFirst) {
			int[] nums = new int[digits.length + 1];
			nums[0] = 1;
			for (int i = 1; i < nums.length; i++) {
				nums[i] = digits[i - 1];
			}
			return nums;
		}
		return digits;
	}

	// more easy to understand
	public static int[] plusoneByTF(int[] digits) {
		for (int i = digits.length - 1; i >= 0; i--) {
			// just to judge the first is 9
			if (0 == i && digits[i] == 9) {
				int[] digits2 = new int[digits.length + 1];
				// first one is 1,another is 0;
				digits2[0] = 1;
				return digits2;
			}
			// judage the number is 9?  make the the num++ or change to zero
			if (digits[i] == 9) {
				digits[i] = 0;
				continue;
			}
			digits[i]++;
			break;
		}
		return digits;
	}

}

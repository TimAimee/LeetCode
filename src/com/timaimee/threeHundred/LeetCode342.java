package com.timaimee.threeHundred;

/**
 * @author timaimee
 * @date 2016-05-28 00:01
 * @des power of four
 */
public class LeetCode342 {
	public static void main(String[] args) {
		System.out.println(isPowerOfFour(3));
	}

	// by me [more use 3 and 2]
	public static boolean isPowerOfFour(int num) {
		// must >0,must power of two,diff power of two
		return num > 0 && (num & (num - 1)) == 0 && (num & 0x55555555) != 0;
	}

}

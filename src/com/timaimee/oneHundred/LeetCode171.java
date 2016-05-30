package com.timaimee.oneHundred;

/**
 * @author timaimee
 * @date 2016-05-29 23:31
 * @des Excel Sheet Column Number
 *
 */
public class LeetCode171 {
	public static void main(String[] args) {
		String str = "ZZZ";
		titleToNumber(str);
	}

	public static int titleToNumber(String s) {
		char[] ch = s.toUpperCase().toCharArray();
		int result = 0;
		int length = ch.length;
		for (int i = 0; i < length; i++) {
			int a = ch[i] - 64;
			result = result + (int) Math.pow(26, length - i - 1) * a;
		}
		return result;
	}
}

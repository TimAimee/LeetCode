package com.timaimee.threeHundred;

/**
 * @author timaimee
 * @date 2016-05-24 21:12
 * @des Reverse String
 */
public class LeetCode344 {
	public static void main(String[] args) {
		System.out.println(reverseString("string"));
	}

	public static String reverseString(String s) {
		StringBuffer sb = new StringBuffer(s);
		return sb.reverse().toString();
	}
}

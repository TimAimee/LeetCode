package com.timaimee.twoHundred;

import java.util.Arrays;

/**
 * @author timaimee
 * @date 2016-05-24 22:22
 * @des Valid Anagram
 *
 */
public class LeetCode242 {
	public static void main(String[] args) {
		System.out.println(isAnagram("abac", "cbaa"));
	}

	// 26个字母出现的次数
	public static boolean isAnagram(String s, String t) {
		char[] sChar = s.toCharArray();
		Arrays.sort(sChar);

		char[] tChar = t.toCharArray();
		Arrays.sort(tChar);

		return new String(sChar).equals(new String(tChar));
	}
}

package com.timaimee.threeHundred;

/**
 * @author timaimee
 * @date 2016-05-24 21:12
 * @des Reverse String
 */
public class LeetCode344 {
	public static void main(String[] args) {
		System.out.println(reverseStringByChar("string"));
	}

	//5ms
	public static String reverseString(String s) {
		StringBuffer sb = new StringBuffer(s);
		return sb.reverse().toString();
	}
	//4ms
	public static String reverseStringByChar(String s) {
		char[] ch = s.toCharArray();
		char temp = '0';
		for (int i = 0; i < ch.length / 2; i++) {
			temp = ch[i];
			ch[i] = ch[ch.length - 1-i];
			ch[ch.length - 1-i] = temp;
		}
		return String.valueOf(ch);

	}
}

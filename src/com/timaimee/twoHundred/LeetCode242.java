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
	
	 public boolean isAnagramOtherWay(String s, String t) {
	        int[] table = new int[26];
	        // 记录字母在第一个单词中出现的次数
	        for(int i = 0; i < s.length(); i++){
	            table[s.charAt(i)-'a']++;
	        }
	        // 减去字母在第二个单词中出现的次数
	        for(int i = 0; i < t.length(); i++){
	            table[t.charAt(i)-'a']--;
	        }
	        // 如果某个计数器不为0，则返回假
	        for(int i = 0; i < 26; i++){
	            if(table[i]!=0) return false;
	        }
	        return true;
	    }
}

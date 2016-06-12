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

	// 26����ĸ���ֵĴ���
	public static boolean isAnagram(String s, String t) {
		char[] sChar = s.toCharArray();
		Arrays.sort(sChar);

		char[] tChar = t.toCharArray();
		Arrays.sort(tChar);

		return new String(sChar).equals(new String(tChar));
	}
	
	 public boolean isAnagramOtherWay(String s, String t) {
	        int[] table = new int[26];
	        // ��¼��ĸ�ڵ�һ�������г��ֵĴ���
	        for(int i = 0; i < s.length(); i++){
	            table[s.charAt(i)-'a']++;
	        }
	        // ��ȥ��ĸ�ڵڶ��������г��ֵĴ���
	        for(int i = 0; i < t.length(); i++){
	            table[t.charAt(i)-'a']--;
	        }
	        // ���ĳ����������Ϊ0���򷵻ؼ�
	        for(int i = 0; i < 26; i++){
	            if(table[i]!=0) return false;
	        }
	        return true;
	    }
}

package com.timaimee.threeHundred;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LeetCode345 {
	public static void main(String[] args) {
		//the two ways is same , --> a e i o u<--, and swap
		System.out.println(reverseVowelsByCaikehe("A man a plan a canal: Panama"));
		System.out.println(reverseVowelsbySCHBS("A man a plan a canal: Panama"));
	}

	public static String reverseVowelsByCaikehe(String s) {
		Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
		char[] chars = s.toCharArray();
		int l = 0, r = chars.length - 1;
		while (l < r) {
			while (l < r && !vowels.contains(Character.toLowerCase(chars[l]))) {
				l++;
			}
			while (l < r && !vowels.contains(Character.toLowerCase(chars[r]))) {
				r--;
			}
			char tmp = chars[l];
			chars[l++] = chars[r];
			chars[r--] = tmp;
		}
		return new String(chars);
	}

	public static String reverseVowelsbySCHBS(String s) {
		if (s == null) {
			throw new IllegalArgumentException();
		}
		if (s.length() <= 1) {
			return s;
		}
		char[] str = s.toCharArray();
		for (int i = 0, j = str.length - 1; i < j; i++, j--) {
			while (i < j && !isVowel(str[i]))
				i++;
			while (i < j && !isVowel(str[j]))
				j--;
			if (i <= j)
				swap(str, i, j);
		}
		return new String(str);
	}

	private static boolean isVowel(char ch) {
		char c = Character.toLowerCase(ch);
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}

	private static void swap(char[] str, int i, int j) {
		char tmp = str[i];
		str[i] = str[j];
		str[j] = tmp;
	}

}

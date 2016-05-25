package com.timaimee.threeHundred;

public class LeetCode345 {
	public static void main(String[] args) {
		System.out.println(reverseVowelsbySCHBS("A man a plan a canal: Panama"));
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

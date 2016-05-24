package com.timaimee.threeHundred;

/**
 * @author timaimee
 * @date 2016-05-24 23:18
 * @des Power of Three
 */
public class LeetCode326 {
	public static void main(String[] args) {
		System.out.println(isPowerOfThreeByjlu_chuang(6));

	}

	//
	public static boolean isPowerOfThreeByjlu_chuang(int n) {
		// 1162261467 是int类型 里面3最大幂的结果
		// 其中因为3是素数
		return n > 0 && 1162261467 % n == 0;
	}

	// use the regular expression ,too slow!
	public static boolean isPowerOfThreeByDietpepsi(int n) {
		return Integer.toString(n, 3).matches("^10*$");
	}
}

package com.timaimee.twoHundred;

/**
 * @author timaimee
 * @date 2016-05-24 22:22
 * @des Count Primes
 */
public class LeetCode204 {

	public static void main(String[] args) {
		System.out.println(countPrimes(499979));
	}

	public static int countPrimes(int n) {
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (isPrimes(i)) {
				//System.out.print(i + ",");
				count++;
			}
		}
		System.out.println("\n");
		return count;
	}

	/**
	 * 质数的判定方法，但是会被判断耗时操作
	 */
	public static boolean isPrimes(int n) {
		boolean isPreimes = true;
		int halfN = n / 2;
		int numer = 2;
		while (halfN >= numer) {
			// System.out.println("n=" + n + ",numer=" + numer);
			if (n % numer == 0) {
				isPreimes = false;
				break;
			}
			numer++;
			isPreimes = true;
		}
		return isPreimes;
	}
}

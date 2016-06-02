package com.timaimee.twoHundred;

/**
 * @author timaimee
 * @date 2016-05-24 22:22
 * @des Happy Number
 *
 */
public class LeetCode202 {
	public static void main(String[] args) {
		System.out.println(isHappy(9));
	}

	// 1ms solution! O(1)space,more esay to understand
	public boolean isHappyByEncoreSummer(int n) {
		if (n == 1 || n == 7)
			return true;
		else if (n < 10)
			return false;
		int d = 0;
		while (n > 0) {
			d += (n % 10) * (n % 10);
			n /= 10;
		}
		return isHappy(d);
	}

	// my 2ms
	private static boolean isHappy(int number) {
		if (number <= 9) {
			number = number * number;
		}
		while (number > 9) {
			number = happlyValue(number);
			if (number == 4) {
				return false;
			}
			if (number <= 9) {
				number = number * number;
			}
		}
		return number == 1 ? true : false;
	}

	private static int happlyValue(int number) {
		int value = 0;
		while (number > 9) {
			int n = number % 10;
			number = number / 10;
			if (number > 9) {
				value = value + n * n;
			} else {
				value = value + n * n + number * number;
			}
		}
		System.out.println("value=" + value);
		return value;
	}
}

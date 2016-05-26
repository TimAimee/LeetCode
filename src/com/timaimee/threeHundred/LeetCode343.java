package com.timaimee.threeHundred;

/**
 * @author timaimee
 * @date 2016-05-26 22:21
 * @des Integer Break
 * @reference http://blog.csdn.net/pathuang68/article/details/6606605
 * @reference http://www.xuebuyuan.com/1588653.html
 */
public class LeetCode343 {
	public static void main(String[] args) {
		System.out.println(integerBreak(3));
	}

	// by me[more use 3 and 2]
	public static int integerBreak(int n) {
		if (n < 1) {
			return n;
		}
		if (n == 2) {
			return 1;
		}
		if (n == 3) {
			return 2;
		}
		int numberTwo = 0;
		int numberThree = 0;
		int numberFour = 0;
		int result = 1;
		int remainder = n % 3;
		if (remainder == 0) {
			numberThree = n / 3;
		} else if (remainder == 1) {
			numberThree = n / 3 - 1;
			numberFour = 1;
		} else {
			numberThree = n / 3;
			numberTwo = 1;
		}
		for (int i = 0; i < numberThree; i++) {
			result = result * 3;
		}
		if (numberTwo != 0) {
			result = result * 2;
		}
		if (numberFour != 0) {
			result = result * 4;
		}
		return result;
	}
}

package com.timaimee.zero;

/**
 * @author timaimee
 * @date 2016-05-23 23:10
 * @des String to  Integer (atoi)
 */
public class LeetCode08 {
	public static void main(String[] args) {
		System.out.println(myAtoi("   +0 123"));
	}

	public static int myAtoi(String str) {
		double value = 0;
		boolean isMinus = false;
		boolean isAdd = false;
		boolean isFirstBlank = true;
		char[] strToChar = str.toCharArray();
		int charLenght = strToChar.length;
		for (int i = 0; i < charLenght; i++) {
			if (strToChar[i] == 32) {
				if (isFirstBlank == false) {
					value = value / Math.pow(10, (charLenght - i));
					break;
				}
				continue;
			} else if (strToChar[i] == 43) {
				isFirstBlank = false;
				if (isMinus || isAdd) {
					return (int) value;
				}
				isAdd = true;
				continue;

			} else if (strToChar[i] == 45) {
				// -
				isFirstBlank = false;
				if (isMinus || isAdd) {
					return (int) value;
				}
				isMinus = true;
				continue;
			} else if (strToChar[i] >= 48 && strToChar[i] <= 57) {
				isFirstBlank = false;
				value = ((strToChar[i] - 48) * Math.pow(10, (charLenght - 1 - i)) + value);
			} else {
				value = value / Math.pow(10, (charLenght - i));
				break;
			}
		}
		if (isMinus) {
			value = -value;
		}
		if (value > Integer.MAX_VALUE) {
			value = Integer.MAX_VALUE;
		}
		if (value <= Integer.MIN_VALUE) {
			value = Integer.MIN_VALUE;
		}
		return (int) value;
	}
}

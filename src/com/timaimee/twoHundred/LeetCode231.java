package com.timaimee.twoHundred;

/**
 * @author timaimee
 * @date 2016-05-24 22:22
 * @des Power of Two
 *
 */
public class LeetCode231 {
	public static void main(String[] args) {
		System.out.println(isPow(-16));
	}

	//4ms
	public static boolean isPow(int n) {
		if (n < 0) {
			return false;
		}
		String str = Integer.toBinaryString(n);
		char[] ch = str.toCharArray();
		if (ch[0] != '1') {
			return false;
		}
		for (int i = 1; i < ch.length; i++) {
			if (ch[i] != '0') {
				return false;
			}
		}
		return true;
	}

	//3ms
	public static boolean isPowerOfTwo(int n) {
		if (n < 0) {
			return false;
		}
		int mask = 1;
		int bits = 0;
		for (int i = 0; i < 32; i++) {
			if ((n & mask) != 0) {
				bits++;
			}
			mask <<= 1;
		}
		if (bits != 1) {
			return false;
		}
		return true;
	}
	//1ms   understand! 4&3=0,8&7=0
	public static boolean isPowerOfTwoBySajeev(int n) {
        if(n < 1) return false;
        return (0 == ((n - 1) & n));
    }

}

package com.timaimee.twoHundred;

/**
 * @author timaimee
 * @date 2016-05-27 22:15
 * @des nim-game
 *
 */
public class LeetCode292 {
	public static void main(String[] args) {
		System.out.println(canWinNim(8));
	}

	public static boolean canWinNim(int n) {
		return (n % 4 == 0) ? false : true;
	}

}

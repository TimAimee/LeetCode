package com.timaimee.oneHundred;

/**
 * @author timaimee
 * @date 2016-05-24 21:52
 * @des Number of 1 Bits
 *
 */
public class LeetCode191 {
	public static void main(String[] args) {
		System.out.println(hammingWeightByNoran(1));
	}

	// by me 18ms
	public static int hammingWeightByMe(int n) {
		int number = 0;
		String str = Integer.toBinaryString(n);
		System.out.println(str);
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '1') {
				number++;
			}
		}
		return number;
	}

	//  more effective  2ms,have try, understander,once n=0000,the programmer is end.amazing
	public static int hammingWeightByNoran(int n) {
	    int sum = 0;
	    while (n != 0) {
	        sum++;
	        n &= (n - 1);
	    }
	    return sum;
	}
	
     //  more effective  2ms , understander!
	public int hammingWeightByTs(int n) {
	    int bits = 0;
	    int mask = 1;
	    for (int i = 0; i < 32; i++) {
	        if ((n & mask) != 0) {
	            bits++;
	        }
	        mask <<= 1;
	    }
	    return bits;
	}
}

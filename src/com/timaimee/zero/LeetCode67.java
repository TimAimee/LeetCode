package com.timaimee.zero;

/**
 * @author timaimee
 * @date 2016-05-27 23:36
 * @des Add Binary
 */
public class LeetCode67 {
	public static void main(String[] args) {
		String a = "000010100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
		String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
	}

	// copy other
	public static String addBinary(String a, String b) { /** i、j分别指向a、b的末尾字符 **/
		int i = a.length() - 1;
		int j = b.length() - 1;
		/** 进位标记 **/
		int carry = 0;
		/** 将String转为char数组 **/
		char[] achar = a.toCharArray();
		char[] bchar = b.toCharArray();
		/** 结果数组 **/
		char[] resultchar = new char[Math.max(achar.length, bchar.length) + 2];
		/** 标记结果数组位置 **/
		int resultIndex = 0;

		while (true) {
			if (i < 0 && j < 0 && carry == 0)
				break;

			int aflag = 0;
			int bflag = 0;

			if (i >= 0)
				aflag = achar[i] - '0';
			if (j >= 0)
				bflag = bchar[j] - '0';

			if (aflag + bflag + carry > 1) {
				resultchar[resultIndex] = (char) ('0' + aflag + bflag + carry - 2);
				carry = 1;
			} else {
				resultchar[resultIndex] = (char) ('0' + aflag + bflag + carry);
				carry = 0;
			}
			resultIndex++;
			i--;
			j--;
		}

		String result = new String(resultchar, 0, resultIndex);
		StringBuffer buffer = new StringBuffer(result);
		result = buffer.reverse().toString();

		return result;
	}
}

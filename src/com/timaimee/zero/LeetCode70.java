package com.timaimee.zero;

/**
 * @author timaimee
 * @date 2016-05-30 22:58
 * @des Climbing Stairs
 * @ref http://blog.csdn.net/tcpipstack/article/details/45173685
 */
public class LeetCode70 {
	public static void main(String[] args) {
		System.out.println(climbStairs(44));
	}

	// think: N[7]=N[6]+N[5]
	public static int climbStairsByRhodey(int n) {
		if (n <= 1)
			return 1;
		int[] a = new int[n + 1];
		a[0] = 1;
		a[1] = 1;
		for (int i = 2; i <= n; i++) {
			a[i] = a[i - 1] + a[i - 2];
		}
		return a[n];
	}

	// think : N=6 result=C[6,0]+C[5,1]+C[4,2]+C[3,3]
	// think : N=7 result=C[7,0]+C[6,1]+C[5,2]+C[4,3]
	public static int climbStairs(int n) {
		if (n <= 0) {
			return 0;
		}
		double result = 0;
		int length = n / 2 + 1;
		for (int i = 0; i < length; i++) {
			result = result + C(n - i, i);
		}
		return (int) result;
	}

	public static double C(double n, double m) {
		if (m == 0) {
			return 1;
		}
		double result1 = n;
		double result2 = m;
		double lenght = m;
		for (int i = 0; i < lenght - 1; i++) {
			result1 = result1 * (n - 1);
			result2 = result2 * (m - 1);
			m = m - 1;
			n = n - 1;
		}
		return result1 / result2;
	}
}

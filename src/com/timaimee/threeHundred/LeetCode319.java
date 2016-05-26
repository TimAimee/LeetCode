package com.timaimee.threeHundred;

/**
 * @author timaimee
 * @date 2016-05-26 23:16
 * @des Bulb Switcher
 */
public class LeetCode319 {
	public static void main(String[] args) {
		System.out.println("\n numer==one:" + bulbSwitch(3));
	}

	/**
	 * need find the ruler!
	 * @reference http://www.2cto.com/kf/201603/491464.html
	 * @param n
	 * @return
	 */
	public static int buldSwitchBy(int n) {
		int wheel = 2;
		int result = 0;
		int trackvehicle = 0;
		boolean isNotWheel = true;
		while (trackvehicle < n) {
			if (isNotWheel) {
				trackvehicle++;
				result++;
				isNotWheel = !isNotWheel;
			} else {
				trackvehicle += wheel;
				wheel += 2;
				isNotWheel = !isNotWheel;
			}
		}
		return result;
	}

	// Time Limit Exceeded 99999
	public static int bulbSwitch(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = 1;
		}
		// getArr(1, arr);
		int length = n / 2;
		if (n % 2 != 0) {
			length = length + 1;
		}
		// half left
		for (int i = 2; i <= length; i++) {
			for (int j = i; j <= n; j++) {
				if (j % i == 0) {
					arr[j - 1] = (arr[j - 1] == 0) ? 1 : 0;
				}
			}
			// getArr(i, arr);
		}
		// half right
		int numer = 0;
		// System.out.println("\n---------");
		for (int i = length + 1; i <= arr.length; i++) {
			arr[i - 1] = (arr[i - 1] == 0) ? 1 : 0;
			// getArr(i, arr);
		}
		// all
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				numer++;
			}
		}
		return numer;
	}

	public static void getArr(int number, int arr[]) {
		System.out.print("[" + number + "]:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	}
}

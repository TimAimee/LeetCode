package com.timaimee.algo.sort;

import java.util.Arrays;

/***
 * 
 * @author timaimee
 * @date 2016-12-01
 * @descripte 主要思想是比较跟交换;每一次的循环比较都将最大的数挑选出来，每比较一次后，所要可能交换的最大次数少1;
 *            时间复杂度：最好的情况，关键字比较次数 n-1,记录移动次数 0，所以是o(n);
 *                     最差的情况，关键字比较次数n*(n-1)/2,记录移动次数 3n*(n-1)/2,所以是o(n*n),
 *
 */
public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = new int[] { 51, 12, 46, 48, 59, 23, 15 };
		System.out.println(Arrays.toString(sort(arr)));
	}

	public static int[] sort(int arr[]) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0 ; j < arr.length-i-1; j++) {//第二次循环要注意减i，以减少比较的次数
				if (arr[j+1] < arr[j]) {			
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			System.out.println(Arrays.toString( arr));
		}
		return arr;
	}

}

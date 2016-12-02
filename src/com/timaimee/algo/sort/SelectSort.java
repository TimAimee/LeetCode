package com.timaimee.algo.sort;

import java.util.Arrays;

/**
 * 
 * @author timaimee
 * @date 2016-12-02
 * @descripte 选择排序的基本思想是比较及交换，与冒泡排序的思想有点类似,
 *            时间复杂度(比较)：最优n*(n-1)/2, 最差n*(n-1)/2
 *            时间复杂度(替换)：最优0, 最差n*(n-1)/2
 *            平均复杂度:o(n*2)
 *            最好复杂度:o(n*2)
 *            最差复杂度:o(n*2)
 *            区别于冒泡：
 *            相同点在于都是两层循环，每次循环都是拿当下最大（小）的值 
 *            不同点在于比较每次比较后只进行一次替换; 而冒泡排序是两两替换，可能进行多次替换
 *            冒泡的优点在于如果是最优的情况下，关键字的比较只要o(n)
 */
public class SelectSort {
	public static void main(String[] args) {
		int arr[] = new int[] { 10, 2, 1, 48, 3, 56, 8, 59, 3, 2, 15, 4 };
		System.out.println(Arrays.toString(sort(arr)));
	}

	private static int[] sort(int arr[]) {
		int minPosition = 0, temp = 0;
		for (int i = 0; i < arr.length; i++) {
			minPosition=i;//这行很关键
			for (int j = i; j < arr.length; j++) {
				if (arr[minPosition] > arr[j]) {
					minPosition = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[minPosition];
			arr[minPosition] = temp;
		}
		return arr;
	}
}

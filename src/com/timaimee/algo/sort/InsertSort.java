package com.timaimee.algo.sort;

import java.util.Arrays;

/***
 * 
 * @author timaimee
 * @date 2016-12-08
 * @descripte 插入排序，主要思想将数据插入到一个排好序的数据中,排好序的长度一直在增长
 *            时间复杂度    最好情况 只要 比较n-1次就好了
 *            		        最坏情况 要比较n*(n-1)/2
 *                     平均情况o(n*n)
 *             适用情况     量级小于千，不适合对于数据量比较大的排序应用
 *             备注            插入排序在工业级库中也有着广泛的应用，在STL的sort算法和stdlib的qsort算法中，都将插入排序作为快速排序的补充，用于少量元素的排序（通常为8个或以下）
 */
public class InsertSort {
	public static void main(String[] args) {
		int[] arr = new int[] { 51, 12, 46, 48, 59, 23, 15 };
		insertSort(arr);
	}

	private static void insertSort(int arr[]) {
		System.out.println("insertSort-" + Arrays.toString(arr));
		int position = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] > arr[i]) {
				int temp = arr[i];// 如果当前值少于前面的值，那它就是要被替换值
				for (position = i - 1; position >= 0&&arr[position] > temp; position--) {
					arr[position+1]=arr[position]; //把大值往后面挪，此时会有最2个相同的最靠左的大于temp的值，
				}
				arr[position+1]=temp;//把替换值放到改放的位置
			}
		}
		System.out.println("insertSort-" + Arrays.toString(arr));
	}
}

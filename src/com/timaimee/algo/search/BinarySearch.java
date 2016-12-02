package com.timaimee.algo.search;

/**
 * 二分法查找
 * 
 * @author timaimee
 * @date 2016-12-01
 * @descripe 二分法又称对半查找，是针对一组有序线性表的查找方法;缺点：要求是线性表，要求有序;时间复杂度：最做优情况 O（1）,最差情况(log2 n)
 * 
 */
public class BinarySearch {
	public static void main(String[] args) {
		int value = 10;
		int arr[] = new int[] { 1, 5, 8, 10, 12, 35, 37, 45, 56, 58, 69, 78 };
		System.out.println(getPosition(value, arr));
	}

	public static int getPosition(int value, int arr[]) {
		int head = 0;
		int end = arr.length - 1;
		while (end >= head) {
			int middle = (head + end) / 2;
			if (value == arr[middle]) {
				return middle;
			} else if (value < arr[middle]) {
				end = middle - 1;
			} else {
				head = middle + 1;
			}
		}
		return -1;
	}
}

package com.timaimee.algo.search;

/**
 * ���ַ�����
 * 
 * @author timaimee
 * @date 2016-12-01
 * @descripe ���ַ��ֳƶ԰���ң������һ���������Ա�Ĳ��ҷ���;ȱ�㣺Ҫ�������Ա�Ҫ������;ʱ�临�Ӷȣ���������� O��1��,������(log2 n)
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

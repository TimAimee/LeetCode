package com.timaimee.algo.sort;

import java.util.Arrays;

/**
 * 
 * @author timaimee
 * @date 2016-12-02
 * @descripte ѡ������Ļ���˼���ǱȽϼ���������ð�������˼���е�����,
 *            ʱ�临�Ӷ�(�Ƚ�)������n*(n-1)/2, ���n*(n-1)/2
 *            ʱ�临�Ӷ�(�滻)������0, ���n*(n-1)/2
 *            ƽ�����Ӷ�:o(n*2)
 *            ��ø��Ӷ�:o(n*2)
 *            ���Ӷ�:o(n*2)
 *            ������ð�ݣ�
 *            ��ͬ�����ڶ�������ѭ����ÿ��ѭ�������õ������С����ֵ 
 *            ��ͬ�����ڱȽ�ÿ�αȽϺ�ֻ����һ���滻; ��ð�������������滻�����ܽ��ж���滻
 *            ð�ݵ��ŵ�������������ŵ�����£��ؼ��ֵıȽ�ֻҪo(n)
 */
public class SelectSort {
	public static void main(String[] args) {
		int arr[] = new int[] { 10, 2, 1, 48, 3, 56, 8, 59, 3, 2, 15, 4 };
		System.out.println(Arrays.toString(sort(arr)));
	}

	private static int[] sort(int arr[]) {
		int minPosition = 0, temp = 0;
		for (int i = 0; i < arr.length; i++) {
			minPosition=i;//���кܹؼ�
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

package com.timaimee.algo.sort;

import java.util.Arrays;

/***
 * 
 * @author timaimee
 * @date 2016-12-01
 * @descripte ��Ҫ˼���ǱȽϸ�����;ÿһ�ε�ѭ���Ƚ϶�����������ѡ������ÿ�Ƚ�һ�κ���Ҫ���ܽ�������������1;
 *            ʱ�临�Ӷȣ���õ�������ؼ��ֱȽϴ��� n-1,��¼�ƶ����� 0��������o(n);
 *                     ����������ؼ��ֱȽϴ���n*(n-1)/2,��¼�ƶ����� 3n*(n-1)/2,������o(n*n),
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
			for (int j = 0 ; j < arr.length-i-1; j++) {//�ڶ���ѭ��Ҫע���i���Լ��ٱȽϵĴ���
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

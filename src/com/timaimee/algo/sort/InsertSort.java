package com.timaimee.algo.sort;

import java.util.Arrays;

/***
 * 
 * @author timaimee
 * @date 2016-12-08
 * @descripte ����������Ҫ˼�뽫���ݲ��뵽һ���ź����������,�ź���ĳ���һֱ������
 *            ʱ�临�Ӷ�    ������ ֻҪ �Ƚ�n-1�ξͺ���
 *            		        ���� Ҫ�Ƚ�n*(n-1)/2
 *                     ƽ�����o(n*n)
 *             �������     ����С��ǧ�����ʺ϶����������Ƚϴ������Ӧ��
 *             ��ע            ���������ڹ�ҵ������Ҳ���Ź㷺��Ӧ�ã���STL��sort�㷨��stdlib��qsort�㷨�У���������������Ϊ��������Ĳ��䣬��������Ԫ�ص�����ͨ��Ϊ8�������£�
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
				int temp = arr[i];// �����ǰֵ����ǰ���ֵ����������Ҫ���滻ֵ
				for (position = i - 1; position >= 0&&arr[position] > temp; position--) {
					arr[position+1]=arr[position]; //�Ѵ�ֵ������Ų����ʱ������2����ͬ�����Ĵ���temp��ֵ��
				}
				arr[position+1]=temp;//���滻ֵ�ŵ��ķŵ�λ��
			}
		}
		System.out.println("insertSort-" + Arrays.toString(arr));
	}
}

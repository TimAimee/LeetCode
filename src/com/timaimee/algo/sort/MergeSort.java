package com.timaimee.algo.sort;

import java.util.Arrays;

/**
 * 
 * @author timaimee
 * @date 2016-12-11
 * @descripte �ϲ�����Ļ���˼���Ƿ��η�,�Ȱ����з��θ���С�飬�ź�����ٺϲ��źõ����У�
 *            ��ֵ�����Ĵ����� �Ƚϴ�������(nlogn)/2��(nlogn)-n+1
 *            ʱ�临�Ӷ�Ϊo(nlogn) 
 *            ��ø��Ӷ�:o(nlogn) 
 *            ���Ӷ�:o(nlogn) 
 *            �鲢�㷨�ĺô��Ǵ��㷨�ȶ������ǱȽ�ռ���ڴ档
 */
public class MergeSort {
	public static void main(String[] args) {
		int[] arr = new int[] { 51, 12, 46, 48, 59, 23, 15 };
		System.out.println(Arrays.toString(sort(arr, 0, arr.length-1)));
	}

	private static int[] sort(int[] arr, int low, int high) {
		int middle = (low + high) / 2;
		if (low < high) {
			sort(arr, low, middle);
			sort(arr, middle + 1, high);
			merge(arr, low, middle, high);
		}
		return arr;
	}

	private static void merge(int[] arr, int low, int mid, int high) {
		int[] temp = new int[high - low + 1];
		int i = low;// ��ָ��
		int j = mid + 1;// ��ָ��  
		int k = 0;
		while (i <= mid && j <= high) {
			// �ѽ�С�������Ƶ���������  
			 temp[k++]=arr[j]>arr[i]?arr[i++]:arr[j++];
		}
		while(i<=mid){
			 // �����ʣ������������� [���ź����] 
			temp[k++]=arr[i++];
		}
		while(j<=high){
			 // ���ұ߱�ʣ������������� [���ź����]  
			temp[k++]=arr[j++];
		}
		for(int m=0;m<temp.length;m++){
			// ���������е�������nums����  
			arr[m+low]=temp[m];
		}
	}
}

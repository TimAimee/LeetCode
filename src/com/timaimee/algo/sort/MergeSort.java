package com.timaimee.algo.sort;

import java.util.Arrays;

/**
 * 
 * @author timaimee
 * @date 2016-12-11
 * @descripte 合并排序的基本思想是分治法,先把序列分治个最小块，排好序后，再合并排好的序列，
 *            赋值操作的次数是 比较次数介于(nlogn)/2和(nlogn)-n+1
 *            时间复杂度为o(nlogn) 
 *            最好复杂度:o(nlogn) 
 *            最差复杂度:o(nlogn) 
 *            归并算法的好处是此算法稳定，但是比较占用内存。
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
		int i = low;// 左指针
		int j = mid + 1;// 右指针  
		int k = 0;
		while (i <= mid && j <= high) {
			// 把较小的数先移到新数组中  
			 temp[k++]=arr[j]>arr[i]?arr[i++]:arr[j++];
		}
		while(i<=mid){
			 // 把左边剩余的数移入数组 [已排好序的] 
			temp[k++]=arr[i++];
		}
		while(j<=high){
			 // 把右边边剩余的数移入数组 [已排好序的]  
			temp[k++]=arr[j++];
		}
		for(int m=0;m<temp.length;m++){
			// 把新数组中的数覆盖nums数组  
			arr[m+low]=temp[m];
		}
	}
}

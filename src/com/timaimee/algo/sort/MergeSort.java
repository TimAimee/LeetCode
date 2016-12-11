package com.timaimee.algo.sort;

import java.util.Arrays;

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
			 // 把左边剩余的数移入数组  
			temp[k++]=arr[i++];
		}
		while(j<=high){
			 // 把右边边剩余的数移入数组  
			temp[k++]=arr[j++];
		}
		for(int m=0;m<temp.length;m++){
			// 把新数组中的数覆盖nums数组  
			arr[m+low]=temp[m];
		}
	}
}

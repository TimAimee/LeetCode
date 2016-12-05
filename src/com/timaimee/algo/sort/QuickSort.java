package com.timaimee.algo.sort;

import java.util.Arrays;

/**
 * @author Timaimee
 * @date 2016-12-05
 * @descripte ��������Ĳ��õ��Ƿ��ε�˼�룬��ȡһ�����Ϊ��׼ֵ�����������׼Ϊ��׼��Ȼ�󽫱ȴ�ķ�һ�ߣ�����С�ķ�һ�ߣ��ٰ���������ݹ���ã�
 *            ֱ�ӽ��� ʱ�临�Ӷȣ����������o(n*n),ƽ�������o(n log n)
 */
public class QuickSort {

	public static void main(String[] args) {
		int arr[] = new int[] { 10, 2, 1, 48, 56, 8, 8,59, 3,  15, 14};
		System.out.println(Arrays.toString(quickSort(arr,0,arr.length-1)));
	}

	private static int[] quickSort(int arr[],int start,int end) {
		if(start<end){
			int basePostion=partition1(arr, start, end);
//			int basePostion=partition2(arr, start, end);
			quickSort(arr, start, basePostion-1);
			quickSort(arr, basePostion+1, end);
		}
		return arr;
	}

	
	 /**
     * ������鷽��1
     *
     * @param arr   Ҫ��ֵ�����
     * @param low �����ֵ���ʼ���� ����0��ʼ��
     * @param high   �����ֵĽ�������
     */
    public static int partition1(int[] arr, int low, int high) {

        //ѡȡ��׼Ԫ�أ��������������һ��λ�ã���Ϊ��׼
        int base = arr[high];
        
        //��¼���Ȼ�׼Ԫ��С�ı������������Ǽ���Ҫ�Ƚϵ�Ԫ�ض���С�ڻ�׼Ԫ�أ�����ͨ���Ƚ�
        //�Ͱ�С�ڻ�׼Ԫ�ص�����ȫ���ҵ���n=start��ʾ�ľ���Ĭ��û��С�ڻ�׼Ԫ�ء�
        int n = low;

        //��׼Ԫ�ز���������Ƚ�
        for (int i = low; i < high; i++) {
            if (arr[i] < base) {
                //��С�ڻ�׼Ԫ�صķŵ���׼�����
                	exchange(arr, i, n);
                n++;
            }
        }
        //�������֮�󣬽���׼Ԫ�طŵ�Ӧ�õ�λ����
        exchange(arr, n, high);
        return n;
    }

    /**
     * ����������ָ��λ�õ�����Ԫ��
     *
     * @param array
     * @param index1
     * @param index2
     */
    public static void exchange(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    /**
     * ������鷽��2
     *
     * @param arr   Ҫ��ֵ�����
     * @param low �����ֵ���ʼ���� ����0��ʼ��
     * @param high   �����ֵĽ�������
     */
	private static int partition2(int[] arr, int low, int high) {
		 int pivot = arr[low];     //�����¼
		    while (low<high){
		        while (low<high && arr[high]>=pivot) --high;
		        arr[low]=arr[high];             //����������С�ļ�¼�����

		        while (low<high && arr[low]<=pivot) ++low;
		        arr[high] = arr[low];           //�����������ļ�¼���Ҷ�

		    }
		    //ɨ����ɣ����ᵽλ
		    arr[low] = pivot;
		    //���ص��������λ��
		    return low;
	}
}

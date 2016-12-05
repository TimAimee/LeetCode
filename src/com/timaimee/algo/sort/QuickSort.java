package com.timaimee.algo.sort;

import java.util.Arrays;

/**
 * @author Timaimee
 * @date 2016-12-05
 * @descripte 快速排序的采用的是分治的思想，先取一个最后为基准值，再以这个基准为标准，然后将比大的放一边，比他小的放一边，再按这个方案递归调用，
 *            直接结束 时间复杂度：最差的情况是o(n*n),平均的情况o(n log n)
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
     * 拆分数组方法1
     *
     * @param arr   要拆分的数组
     * @param low 数组拆分的起始索引 （从0开始）
     * @param high   数组拆分的结束索引
     */
    public static int partition1(int[] arr, int low, int high) {

        //选取基准元素，这里我们以最后一个位置，作为基准
        int base = arr[high];
        
        //记录，比基准元素小的变量，这里我们假设要比较的元素都不小于基准元素，这样通过比较
        //就把小于基准元素的数据全部找到，n=start表示的就是默认没有小于基准元素。
        int n = low;

        //基准元素不参与遍历比较
        for (int i = low; i < high; i++) {
            if (arr[i] < base) {
                //将小于基准元素的放到基准的左边
                	exchange(arr, i, n);
                n++;
            }
        }
        //遍历完成之后，将基准元素放到应该的位置上
        exchange(arr, n, high);
        return n;
    }

    /**
     * 交换数组中指定位置的两个元素
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
     * 拆分数组方法2
     *
     * @param arr   要拆分的数组
     * @param low 数组拆分的起始索引 （从0开始）
     * @param high   数组拆分的结束索引
     */
	private static int partition2(int[] arr, int low, int high) {
		 int pivot = arr[low];     //枢轴记录
		    while (low<high){
		        while (low<high && arr[high]>=pivot) --high;
		        arr[low]=arr[high];             //交换比枢轴小的记录到左端

		        while (low<high && arr[low]<=pivot) ++low;
		        arr[high] = arr[low];           //交换比枢轴大的记录到右端

		    }
		    //扫描完成，枢轴到位
		    arr[low] = pivot;
		    //返回的是枢轴的位置
		    return low;
	}
}

package com.timaimee.oneHundred;

/**
 * @author timaimee
 * @date 2016-06-14 23:06
 * @des House Robber
 *
 */
public class LeetCode198 {
	public static void main(String[] args) {
		int[] arr = new int[] { 8, 3, 6, 15, 4, 9, 7,10 };
		System.out.println(rob(arr));
	}

	public static int rob(int[] nums) {
		int take = 0;
		int maxProfit = 0;
		int nonTake = 0;
		for (int i = 0; i < nums.length; ++i) {
			take = nonTake + nums[i];
			nonTake = maxProfit;
			
			System.out.println("------------------take="+take);
			System.out.println("nonTake="+nonTake);
			
			maxProfit = Math.max(take, nonTake);
			
			System.out.println("maxProfit="+maxProfit);
		}
		return maxProfit;
	}

}

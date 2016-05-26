package com.timaimee.threeHundred;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author timaimee
 * @date 2016-05-26 21:42
 * @des Intersection of Two Arrays
 */
public class LeetCode349 {
	public static void main(String[] args) {
		int[] nums1 = new int[] { 1, 2, 3, 2, 5, 6 };
		int[] nums2 = new int[] { 10, 2, 3, 40, 50, 60 };
		intersection(nums1, nums2);
	}

	// my way 19ms o(n*n)
	public static int[] intersection(int[] nums1, int[] nums2) {
		long time = System.currentTimeMillis();
		List<Integer> mInteger = new ArrayList<Integer>();
		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				if (nums1[i] == nums2[j]) {
					if (!mInteger.contains(nums1[i])) {
						mInteger.add(nums1[i]);
					}
					continue;
				}
			}
		}
		int[] arr = new int[mInteger.size()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = mInteger.get(i);
		}
		System.out.println(System.currentTimeMillis() - time);
		return arr;

	}

	// other way use two set o(n)
	public static int[] otherWayBy(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet<>();
		Set<Integer> intersect = new HashSet<>();
		for (int i = 0; i < nums1.length; i++) {
			set.add(nums1[i]);
		}
		for (int i = 0; i < nums2.length; i++) {
			if (set.contains(nums2[i])) {
				intersect.add(nums2[i]);
			}
		}
		int[] result = new int[intersect.size()];
		int i = 0;
		for (Integer num : intersect) {
			result[i++] = num;
		}
		return result;
	}

	// other way use set and arraylist 5ms time complexity o(n)
	public static int[] otherWayByMitulshr(int[] nums1, int[] nums2) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		// Add all elements to set from array 1
		for (int i = 0; i < nums1.length; i++)
			set.add(nums1[i]);
		for (int j = 0; j < nums2.length; j++) {
			// If present in array 2 then add to res and remove from set
			if (set.contains(nums2[j])) {
				res.add(nums2[j]);
				set.remove(nums2[j]);
			}
		}
		// Convert ArrayList to array
		int[] arr = new int[res.size()];
		for (int i = 0; i < res.size(); i++)
			arr[i] = res.get(i);
		return arr;
	}

	// other way use JAVA8
	public static int[] otherWayUseJAVA8(int[] nums1, int[] nums2) {
		// Set<Integer> set =
		// Arrays.stream(nums2).boxed().collect(Collectors.toSet());
		// return Arrays.stream(nums1).distinct().filter(e ->
		// set.contains(e)).toArray();
		return nums1;
	}
}

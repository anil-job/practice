package com.trivedi.hardik.leetcode;

import java.util.Arrays;

/**
 * Given an array of 2n integers, your task is to group these integers into n
 * pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of
 * min(ai, bi) for all i from 1 to n as large as possible.
 * 
 * @author hatrivedi
 * @date Dec 10, 2018
 * @since 2.5
 */
public class ArrayPartition1 {
	public int arrayPairSum(int[] nums) {
		Arrays.sort(nums);
		int sum = 0;
		for (int i = 0; i < nums.length; i += 2) {
			sum += nums[i];
		}
		return sum;
	}
}

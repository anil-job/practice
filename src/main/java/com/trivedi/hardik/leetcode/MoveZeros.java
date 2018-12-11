package com.trivedi.hardik.leetcode;

/**
 * Given an array nums, write a function to move all 0's to the end of it while
 * maintaining the relative order of the non-zero elements.
 * 
 * @author hatrivedi
 * @date Dec 10, 2018
 * @since 2.5
 */
public class MoveZeros {
	public void moveZeroes(int[] nums) {
		int index = 0;
		for (int num : nums) {
			if (num != 0) {
				nums[index++] = num;
			}
		}
		while (index < nums.length) {
			nums[index++] = 0;
		}
	}
}

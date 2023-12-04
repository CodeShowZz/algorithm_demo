package com.algorithm.sort;

import com.algorithm.util.ArrayUtil;

import java.util.Arrays;

/**
 * @description:
 * @author: Linhuang
 * @date: 2023-12-04 17:54
 */
public class InsertSort {

    public static  void insertSort(int[] nums) {

        if (nums == null || nums.length == 0 || nums.length == 1) {
            return;
        }
        int len = nums.length;
        for (int i = 1; i < len; i++) {
            for (int j = i; j >= 1; j--) {
                if (nums[j] < nums[j - 1]) {
                    ArrayUtil.swap(nums, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] data = {9, 8, 3, 7, 5, 6, 4, 1};
        InsertSort.insertSort(data);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }
}
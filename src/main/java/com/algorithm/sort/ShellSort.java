package com.algorithm.sort;

import com.algorithm.util.ArrayUtil;

import java.util.Arrays;

/**
 * @description:
 * @author: Linhuang
 * @date: 2023-12-04 17:53
 */
public class ShellSort {

    public void shellSort(int[] nums, int n) {
        int len = nums.length;
        for (int interval = n / 2; interval > 0; interval /= 2) {
            for (int i = interval; i < len; i++) {
                for (int j = i; j > 0 && j - interval >= 0; j = j - interval) {
                    if (nums[j] < nums[j - interval]) {
                        ArrayUtil.swap(nums, j, j - interval);
                    } else {
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] data = {9, 8, 3, 7, 5, 6, 4, 1};
        int size = data.length;
        ShellSort ss = new ShellSort();
        ss.shellSort(data, size);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }
}
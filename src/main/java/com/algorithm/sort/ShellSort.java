package com.algorithm.sort;

import com.algorithm.util.ArrayUtil;

import java.util.Arrays;

/**
 * @description:
 * @author: Linhuang
 * @date: 2023-12-04 17:53
 */
public class ShellSort {

    /**
     * 希尔排序由插入排序演变而来,需要特别注意的是j在通用场景下的判断条件的边界值
     * @param nums
     * @param n
     */
    public void shellSort(int[] nums, int n) {
        int len = nums.length;
        for (int interval = n / 2; interval > 0; interval /= 2) {
            for (int i = interval; i < len; i++) {
                for (int j = i;  j >= interval; j = j - interval) {
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
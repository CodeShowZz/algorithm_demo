package com.algorithm.sort;

import java.util.Arrays;

/**
 * @description:
 * @author: Linhuang
 * @date: 2023-12-06 9:26
 */
public class MergeSort {

    public static void merge(int[] arr, int left, int middle, int right) {
        int lenL = middle - left + 1;
        int lenR = right - middle;
        int[] L = new int[lenL];
        int[] R = new int[lenR];
        for (int i = 0; i < lenL; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < lenR; j++) {
            R[j] = arr[middle + j + 1];
        }
        int i = 0;
        int j = 0;
        int k = left;
        while (i < lenL && j < lenR) {
            if (L[i] > R[j]) {
                arr[k] = R[j];
                j++;
            } else {
                arr[k] = L[i];
                i++;
            }
            k++;
        }
        while (i < lenL) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < lenR) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);
            merge(arr, left, middle, right);
        }
    }

    public static void main(String args[]) {
        int arr[] = {6, 5, 12, 10, 9, 1};

        MergeSort.mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(arr));
    }


}
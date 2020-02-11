package com.learning.algo.sorting;

import java.util.Arrays;

public class ShellSort {

  public static void sort(int arrayToSort[]) {
    int n = arrayToSort.length;

    for (int gap = n / 2; gap > 0; gap /= 2) {
      for (int i = gap; i < n; i++) {
        int key = arrayToSort[i];
        int j = i;
        System.out.println("gap : "+gap +" key "+key +" i  "+i +" j  "+j);
        while (j >= gap && arrayToSort[j - gap] > key) {
          arrayToSort[j] = arrayToSort[j - gap];
          j -= gap;
        }
        arrayToSort[j] = key;
      }
    }
  }

  public static void main(String[] args) {
    int[] arrayToSort = {10, 5, 25, 7, 13, 4, 1};
    sort(arrayToSort);
    System.out.println(Arrays.toString(arrayToSort));
  }
}

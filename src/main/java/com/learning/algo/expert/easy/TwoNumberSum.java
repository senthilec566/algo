package com.learning.algo.expert.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoNumberSum {

  
  public static int[] twoNumberSumTwoLoops(int[] array, int targetSum) {
    // Write your code here.
        for(int i=0; i<array.length;i++){
            for(int j=i+1; j <array.length; j++){
                int sum = array[i]+array[j];
                if(sum == targetSum){
                    return new int[] { array[i], array[j] };
                }
            }
        }
    return new int[] {};
  }
  
  public static int[] twoNumberSumHashMap(int[] array, int targetSum) {
    // x+y = target
    // y = target -x 
    Map <Integer,Integer> elementsMap = new HashMap<Integer,Integer>();
    for(int i =0 ; i < array.length-1; i++){
      int num = targetSum - array[i];
      if(elementsMap.containsKey(num)){
        return new int[] {array[elementsMap.get(num)], array[i]};
      }else{
        elementsMap.put(array[i], i);
      }
    }
    return new int[] {};
  }
  
  public static int[] twoNumberSumSorting(int[] array, int targetSum) {
    // sort array
    Arrays.sort(array);
    System.out.println(Arrays.toString(array));
    int leftIndex = 0;
    int rightIndex = array.length-1;
    while( leftIndex < rightIndex){
      int sum = array[leftIndex]+ array[rightIndex];
      if(sum == targetSum){
        return new int[]{array[leftIndex], array[rightIndex]};
      }else if(sum < targetSum){
        leftIndex++;
      }else{
        rightIndex--;
      }
    }
    return new int[] {};
  }
  
  
  public static void main(String[] args) {
    int[] array = {5,-4,8,11,1,-1,6};
    System.out.println(Arrays.toString(twoNumberSumTwoLoops(array, 10)));
    System.out.println(Arrays.toString(twoNumberSumHashMap(array, 10)));
    System.out.println(Arrays.toString(twoNumberSumSorting(array, 17)));
  }
}

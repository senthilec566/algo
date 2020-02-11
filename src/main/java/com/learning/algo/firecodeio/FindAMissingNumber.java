package com.learning.algo.firecodeio;

import java.util.Arrays;

public class FindAMissingNumber {

  public static void main(String[] args) {
    int[] arr = {1,6,9,4,2,7,8,3};
    System.out.println(findMissingNumber(arr));
    System.out.println(findMissingNbrUsingSum(arr));
    System.out.println(findMissingNbrWithXOR(arr));
  }
  
  public static int findMissingNumber(int[] arr) {
    int missingNumber = -1;
    Arrays.sort(arr);
    for(int i=1; i< arr.length; i++){
      int previousElement = arr[i-1];
      int currentElement = arr[i];
      if((currentElement-1) == previousElement){
       continue;
      }else{
        missingNumber = arr[i]-1;
        break;
      }
    }
    return missingNumber; 
  }
  
  public static int findMissingNbrUsingSum(int[] arr){
    int n = arr[arr.length - 1];
    int sumOfNbrs = n*(n+1)/2;
    int sumActual = 0;
    for(int nbr: arr){
      sumActual += nbr;
    }
    return (sumOfNbrs-sumActual);
  }
  
  public static int findMissingNbrWithXOR(int[] arr){
    int a = 0;
    int b = 0;
    int n = arr.length+1;
    for (int i = 0; i < n-1 ; i++){
      a = a ^ arr[i];
    }
    for(int i = 1; i <= n; i++){
      b = b ^ i;
    }
    return a ^ b;
  }
}

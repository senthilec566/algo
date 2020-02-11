package com.learning.algo.random;

import java.util.Arrays;

/*
 * 
Write a function:
class Solution { public int solution(int[] A); }
that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
Given A = [1, 2, 3], the function should return 4.
Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:
N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].

 */
public class SmallestInteger {

  public static int solution(int[] A) {
    int smallestInt = 1; 
    if(A.length == 0) return smallestInt;
    Arrays.sort(A);
    System.out.println(Arrays.toString(A));
    if(A[0] > 1) return smallestInt;
    if(A[ A.length - 1] <= 0 ){
      return smallestInt; 
    }
   for(int i = 0; i < A.length; i++){
       if(A[i] == smallestInt){ 
         smallestInt++;
        }    
   }
   return smallestInt;
}
  
  public static void main(String[] args) {
    int[] A = {1, 3, 6, 4, 1, 2};
    System.out.println(solution(A));
  }
}

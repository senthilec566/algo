package com.learning.algo.random;

import java.util.Arrays;

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

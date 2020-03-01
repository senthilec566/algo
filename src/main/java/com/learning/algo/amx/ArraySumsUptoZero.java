package com.learning.algo.amx;

import java.util.Arrays;

class ArraySumsUptoZero {
  
  public static void main(String[] args) {
    System.out.println(Arrays.toString(solution(6)));
  }
  
  public static int[] solution(int N) {
     int[] arr = new int[N];
     if(N == 1){
         arr[0] = 0;
         return arr;
     }
     int element = N/2 ;
     if( N %2 == 0){
         int i = 0;
         while( i < N){
             arr[i] = element;
             arr[i+1] = -element;
             i = i+2;
             element--;
         }
     }else{
      arr[0] = 0;
      int i = 1;
        while( i < N){
            arr[i] = element;
            arr[i+1] = -element;
            i = i+2;
         element--;
        }
     }
     return arr;
 }
}

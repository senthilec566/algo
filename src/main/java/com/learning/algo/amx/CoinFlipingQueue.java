package com.learning.algo.amx;

import java.util.LinkedList;
import java.util.Queue;

public class CoinFlipingQueue {
  
  static Queue<Integer> queue = new LinkedList<Integer>();
  public static void main(String[] args) {
    int[] A = {1,0,1,0,1,1};
    solution(A);
  }
  
  public static int solution(int[] A) {
    int coinFlipCount = 0;
    for(int i =0 ; i < A.length; i++){
      queue.add(A[i]);
    }
    for(int i =0; i<queue.size(); i++){
      if(A[i]==queue.peek()){
        
      }
    }
    System.out.println(coinFlipCount);
    return coinFlipCount;
  }  
}

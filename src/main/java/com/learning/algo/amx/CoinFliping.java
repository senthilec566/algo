package com.learning.algo.amx;

class CoinFliping {
 public static int solution(int[] A) {
     // write your code in Java SE 8
     // recursive?
     if( A.length <= 1){
         return 0;
     }
     int reverseCount = 0;
     int compareElement = 0;
     int sequenceStart = A[0];
     int i = 0;
     while(i < A.length){
       int firstElement = A[i];
       // array has current and next index should be
       if(i == A.length-1)
         compareElement  = A[i-1];
       else
         compareElement = A[i+1];
       if(firstElement == compareElement){
         reverseCount++;
         if(firstElement == 1 ) sequenceStart = 0;
       }else if(sequenceStart != firstElement){
         sequenceStart= firstElement;
         reverseCount += 2;
       }
       i+=2;
     }
     return reverseCount;
 }
 
 public static void main(String[] args) {
   int[] in = {0,1,0,1,0};
  System.out.println(solution(in));
}
 
}


package com.learning.algo.random;

public class LongestBinaryGap {
  
  public static int longestGap(int n){
    final String binaryStr = Integer.toBinaryString(n);
    int longestGap = 0;
    int gap = 0;
    for(int i = 0; i <= binaryStr.length()-1; i++){
      char c = binaryStr.charAt(i);
      if( c == '1'){
        if(gap > 0  && gap > longestGap ){
          longestGap = gap;
        }
        gap = 0; // reset gap
      }else{
        gap++;
      }
    }
    return longestGap;
  }
  
  public static void main(String[] args) {
    System.out.println(longestGap(999999999));
  }
  
}

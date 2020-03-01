package com.learning.algo.vnage;

public class NonNegativeSiblings {

  public static void main(String[] args) {
    int N = 38293367;
    System.out.println(solution(N));
  }
  
  public static int solution(int N) {
    // write your code in Java SE 8
    final char[] charArr = String.valueOf(N).toCharArray();
    if(charArr.length <= 1){
      return N; // simply return N since its a single digit
    }
    int leftIndex = 0;
    int rightIndex = charArr.length -1;
    while(leftIndex < rightIndex ){
      if( Integer.valueOf(charArr[leftIndex]) < Integer.valueOf(charArr[rightIndex])){
        char temp = charArr[leftIndex];
        charArr[leftIndex] = charArr[rightIndex];
        charArr[rightIndex] = temp;
        leftIndex++;
      }else{
        rightIndex--;
      }
    }
    final String result = String.valueOf(charArr);
    return Integer.valueOf(result);
  }
    
}

package com.learning.algo.firecodeio;

import java.util.Objects;

public class Palindrome {

  public static void main(String[] args) {
    /*
        Anna
        Civic
        Kayak
        Level
        Madam
        Mom
        Noon
        Racecar
        Radar
        Redder
        Refer
        Repaper
        Rotator
        Rotor
        Sagas
        Solos
        Stats
        Tenet
        Wow
     */
    System.out.println(isStringPalindrome("Nolemon,nomelon"));
  }
  
  public static boolean isStringPalindrome(String str){
    if(Objects.isNull(str) || str.isEmpty()) return true;
    final char[] charArr = str.toCharArray();
    if(charArr.length <= 1) return true;
    int leftIndex = 0;
    int rightIndex = charArr.length -1 ;
    boolean isPalindrome = false;
    while ( leftIndex < rightIndex ){
      if(charArr[leftIndex++] == charArr[rightIndex--]){
        isPalindrome = true;
      }else{
        isPalindrome = false;
      }
    }
    return isPalindrome;
  }
}

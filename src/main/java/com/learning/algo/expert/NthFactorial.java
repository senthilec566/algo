package com.learning.algo.expert;

public class NthFactorial {

  public static int getNthFib(int n) {
    if(n==0) return 1;
        return (n * getNthFib(n-1));
  }
  public static void main(String[] args) {
    System.out.println(getNthFib(2));
  }
}

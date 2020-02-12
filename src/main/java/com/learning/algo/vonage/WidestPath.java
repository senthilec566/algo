package com.learning.algo.vonage;

public class WidestPath {

  public static void main(String[] args) {
    //int[] X = {1,8,7,3,4,1,8};
    //int[] Y = {6,4,1,8,5,1,7};
    //int[] X = {5,5,5,7,7,7};
    //int[] Y = {3,4,5,1,3,7};
    //int[] X = {6,10,1,4,3};
    //int[] Y = {2,5,3,1,6};
    int[] X = {4,1,5,4};
    int[] Y = {4,5,1,3};
    System.out.println(solution(X, Y));
   
  }
  
  public static int solution(int[] X, int[] Y) {
    // write your code in Java SE 8
    int widestPath = 0;
    if(Y.length <=1 ) return 1; // could be only one since single node in Y 
    for(int i = 0 ; i < X.length ; i++){
        int length = traverse(X,Y, X[i],0);
        if(length > 0 && length > widestPath){
          widestPath = length;
        }
    }
    return widestPath;
  }
  
  public static int traverse( int[] X, int[] Y, int fromNode , int length){
    for(int i = 0; i < X.length; i++) {
      System.out.println(X[i]  +"  "+Y[i]+" "+fromNode);
      if(X[i] == fromNode) {
          return traverse(X,Y, Y[i], ++length);
      }
    }
    System.out.println("traverse length : "+length);
    return length;
  }
}

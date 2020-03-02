package com.learning.algo.expert.easy;

import java.util.ArrayList;
import java.util.List;

public class Test {

  public static void main(String[] args) {
    List<Integer> result = new ArrayList<Integer>(2);
    result.add(0, 0);
    result.add(1, 0);
    
    List<Integer> a = new ArrayList<Integer>();
    List<Integer> b = new ArrayList<Integer>();
    a.add(5);
    a.add(6);
    a.add(7);
    b.add(3);
    b.add(6);
    b.add(10);
    System.out.println(compareTriplets(a, b));
  }
  static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    final List<Integer> result = new ArrayList<Integer>(2);
    result.add(0,0);
    result.add(1,0);
    for(int i =0; i < a.size(); i++){
        if(a.get(i) > b.get(i)){
            result.set(0, (result.get(0)+1));
        }else if( b.get(i) > a.get(i)){
            result.set(1, (result.get(1)+1));
        }
    }
    return result;
  }
}

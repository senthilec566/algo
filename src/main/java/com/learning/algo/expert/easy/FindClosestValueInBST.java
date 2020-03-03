package com.learning.algo.expert.easy;

public class FindClosestValueInBST {

  public static int findClosestValueInBst(BST tree, int target) {
    // Write your code here.
    System.out.println(tree.value);
    return -1;
  }
  
  
  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }
  }
  
  public static void main(String[] args) {
    BST bst = new BST(10);
    BST left = new BST(5);
    BST right = new BST(15);
    bst.left = left;
    bst.right = right;
    findClosestValueInBst(bst, 12);
    
  }
}
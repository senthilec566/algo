package com.learning.algo.expert;

public class BinarySearchTree {

  public BST root;
  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }
  }
  
  public void insert(int value){
    BST node = new BST(value);

    if ( root == null ) {
      root = node;
      return;
    }
    insertRec(root, node);

  }

  private void insertRec(BST latestRoot, BST node){

    if ( latestRoot.value > node.value){

      if ( latestRoot.left == null ){
        latestRoot.left = node;
        return;
      }
      else{
        insertRec(latestRoot.left, node);
      }
    }
    else{
      if (latestRoot.right == null){
        latestRoot.right = node;
        return;
      }
      else{
        insertRec(latestRoot.right, node);
      }
    }
  }
  
  public  int  findMax(){
    if(root.right == null){
      return root.value;
    }
    BST currentNode = root;
    while( currentNode.right != null ){
      currentNode = currentNode.right;
    }
    return currentNode.value;
  }
  
  public  int  findMin(){
    if(root.left == null){
      return root.value;
    }
    BST currentNode = root;
    while( currentNode.left != null ){
      currentNode = currentNode.left;
    }
    return currentNode.value;
  }
  
  public static void main(String[] args) {
    BinarySearchTree tree = new BinarySearchTree();
    tree.insert(10);
    tree.insert(7);
    tree.insert(20);
    tree.insert(8);
    System.out.println(tree.findMax());
    System.out.println(tree.findMin());
  }
}

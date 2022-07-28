package com.bridgelabz.BST;

public class BinarySearchTree<K extends Comparable> {
    MyBinaryNode<K> root;

    public void inset(K key){
        if (root == null){
            root=new MyBinaryNode(key);
            System.out.println(key+" assigned to root");
        } else {
            MyBinaryNode currentNode=root;

            while (true){
                if (currentNode.left==null && key.compareTo(currentNode.getKey()) <= 0) {
                    currentNode.left=new MyBinaryNode(key);
                    System.out.println(key+" assigned left to "+currentNode.getKey());
                    break;
                } else if (key.compareTo(currentNode.getKey()) <= 0) {
                    currentNode=currentNode.left;
                } else if (currentNode.right == null) {
                    currentNode.right=new MyBinaryNode(key);
                    System.out.println(key+" assigned right to "+currentNode.getKey());
                    break;
                } else {
                    currentNode=currentNode.right;
                }
            }
        }
    }
    public static void main(String[] args) {
        BinarySearchTree bst=new BinarySearchTree();
        bst.inset(56);
        bst.inset(30);
        bst.inset(70);
        bst.inset(22);
        bst.inset(60);
        bst.inset(95);
        bst.inset(40);
        bst.inset(11);
        bst.inset(3);
        bst.inset(16);
        bst.inset(65);
        bst.inset(63);
        bst.inset(67);

    }
}


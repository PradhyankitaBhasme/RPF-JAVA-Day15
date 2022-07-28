package com.bridgelabz.BST;

public class BinarySearchTree<K extends Comparable> {
    MyBinaryNode<K> root;

    public void inset(K key){
        MyBinaryNode myBinaryNode=new MyBinaryNode(key);
        if (root == null){
            root=myBinaryNode;
            System.out.println(myBinaryNode.getKey()+" assigned to root");
        } else {
            MyBinaryNode node=root;

            while (true){
                if (node.left==null && myBinaryNode.getKey().compareTo(node.getKey()) <= 0) {
                    node.left=myBinaryNode;
                    System.out.println(myBinaryNode.getKey()+" assigned left to "+node.getKey());
                    break;
                } else if (myBinaryNode.getKey().compareTo(node.getKey()) <= 0) {
                    node=node.left;
                } else if (node.right == null) {
                    node.right=myBinaryNode;
                    System.out.println(myBinaryNode.getKey()+" assigned right to "+node.getKey());
                    break;
                } else {
                    node=node.right;
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


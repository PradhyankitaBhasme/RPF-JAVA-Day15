package com.bridgelabz.BST;

public class BinarySearchTree<K> {
    MyBinaryNode root;

    public void inset(K key){
        MyBinaryNode node=new MyBinaryNode(key);
        if (root == null){
            root=node;
        } else if (root.left==null) {
            root.left=node;
        }else {
            root.right=node;
        }
    }
    public static void main(String[] args) {
        BinarySearchTree bst=new BinarySearchTree();
        bst.inset(56);
        bst.inset(30);
        bst.inset(70);

        System.out.println("root: "+bst.root.getKey());
        System.out.println("left: "+bst.root.left.getKey());
        System.out.println("right: "+bst.root.right.getKey());
    }
}


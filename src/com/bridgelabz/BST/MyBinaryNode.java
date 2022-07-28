package com.bridgelabz.BST;

public class MyBinaryNode<K> {
    private K key;
    MyBinaryNode left;
    MyBinaryNode right;
    MyBinaryNode p;

    public MyBinaryNode(K key) {
        this.key = key;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }
}

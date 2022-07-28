package com.bridgelabz;

public class LinkedList<K, V> {
    MyMapNode head;
    MyMapNode tail;

    public void append(MyMapNode<K, V> node){
        if (head == null){
            head= (MyMapNode) node;
        } else {
            tail.setNext(node);
        }
        tail = (MyMapNode) node;
    }
    public MyMapNode search(K key){
        if (head == null) {
            return null;
        }
        else {
            MyMapNode node=head;
            while (!node.getKey().equals(key)){
                if (node==tail && !node.getKey().equals(key)){
                    return null;
                }
                node=node.getNext();
            }
            return node;
        }

    }

    public void print(){
        if (head == null){
            System.out.println("null");
        }else {
            MyMapNode myMapNode=head;
            System.out.print("{ ");
            while (!(myMapNode == null)){
                System.out.print(myMapNode.getKey()+"="+myMapNode.getValue()+", ");
                myMapNode=myMapNode.getNext();
            }
            System.out.println("}");
        }
    }

//    public static void main(String[] args) {
//        LinkedList<MyMapNode, V> linkedList=new LinkedList();
//        MyMapNode<String, Integer> myMapNode=new MyMapNode<>("ABC",5);
//        MyMapNode<String, Integer> myMapNode2=new MyMapNode<>("ABCD",6);
//        linkedList.add(myMapNode);
//        linkedList.add(myMapNode2);
//        linkedList.print();
//    }

}

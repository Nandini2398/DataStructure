package com.bridgelabz.queues;

public class MyNode<K extends Comparable> implements Node<K> {
    private K key;
    private Node next;

    public MyNode(K key) {
        this.key =key;
        this.next=null;
    }
    @Override
    public K getKey() {
        return key;
    }
    @Override
    public void setKey() {
        this.key=key;
    }
    public Node<K> getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next =(MyNode<K>) next;
    }
}
package com.bridgelabz.stacks;

public interface Node<K extends Comparable> {
    K getKey();
    void setKey();
    Node getNext();
    void setNext(Node tempNode);
}

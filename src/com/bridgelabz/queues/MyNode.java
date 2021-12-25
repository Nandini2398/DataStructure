package com.bridgelabz.queues;

	public class MyNode<K extends Comparable> implements INode<K> {
        private K key;
        private INode next;

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
        public INode<K> getNext() {
            return next;
        }
        public void setNext(INode next) {
            this.next =(MyNode<K>) next;
        }
}
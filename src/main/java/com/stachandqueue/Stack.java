package com.stachandqueue;
public class Stack<K> {
    private final LinkedList<K> linkedListObj = new LinkedList<>();

    public void push(INode<K> node) {
        linkedListObj.add( node);
    }

    public INode<K> peak() {
        return linkedListObj.head;
    }

    public INode<K> pop() {
        return (INode<K>) linkedListObj.pop();
    }

    public void printStack() {
        linkedListObj.printNode();
    }
}
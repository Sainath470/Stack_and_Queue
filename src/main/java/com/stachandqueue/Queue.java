package com.stachandqueue;
public class Queue<K> {
    LinkedList<K> linkedList = new LinkedList<>();

    public void enqueue(INode<K> node) {
        linkedList.append(node);
    }

    public void dequeue() {
        linkedList.popLast();
    }

    public INode<K> latestKeyOfQueue() {
        return linkedList.head;
    }

    public INode<K> firstKeyOfQueue() {
        return linkedList.tail;
    }

    public void printQueue() {
        linkedList.printNode();
    }
}

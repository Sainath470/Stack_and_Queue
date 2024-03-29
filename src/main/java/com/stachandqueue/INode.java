package com.stachandqueue;

public interface INode<K> {
    K getKey();
    void setKey(K key);

    INode<K> getNextNode();
    void setNextNode(INode<K> next);
}

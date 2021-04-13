package com.stachandqueue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    @Test
    public void given3IntegersWhenAddedShouldBeLast(){
        Node<Integer> firstNode = new Node<>(70);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(56);

        Stack<Integer> stack = new Stack<>();

        stack.push(firstNode);
        stack.push(secondNode);
        stack.push(thirdNode);
        stack.printStack();

        INode<Integer> peak = stack.peak();
        Assertions.assertEquals(thirdNode, peak);
    }

    @Test
    public void Given3Integers_Into_Stack_WhenPop_ShouldRemove_Last(){
        Node<Integer> firstNode = new Node<>(70);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(56);

        Stack<Integer> stack = new Stack<>();

        stack.push(firstNode);
        stack.push(secondNode);
        stack.push(thirdNode);
        stack.pop();

        stack.printStack();
    }

}
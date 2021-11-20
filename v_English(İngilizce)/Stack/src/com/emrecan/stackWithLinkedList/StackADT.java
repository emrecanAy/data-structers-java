package com.emrecan.stackWithLinkedList;

/**
 * @author Emrecan
 * @created 20/11/2021 - 21:35
 */
public abstract class StackADT {

    public Node topNode = null;
    public abstract boolean isEmpty();
    public abstract void push(int newElement);
    public abstract int pop();
    public abstract int top();

}

package com.emrecan.stackWithArray;

/**
 * @author Emrecan
 * @created 20/11/2021 - 13:08
 */
public abstract class StackADT {

    public int MAX_SIZE = 100; // Max count of elements
    public int[] stack; // Stack array holding elements
    public int count; // instant elements counts
    public abstract boolean isEmpty();
    public abstract boolean isFull();
    public abstract int push(int newElement);
    public abstract int pop();
    public abstract int top();




}

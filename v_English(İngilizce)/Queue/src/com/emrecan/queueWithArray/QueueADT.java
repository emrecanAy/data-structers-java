package com.emrecan.queueWithArray;

import java.util.Queue;

/**
 * @author Emrecan
 * @created 21/11/2021 - 00:44
 */
public abstract class QueueADT {

    public int Q[] = new int[10];
    public int front=0;
    public int back=0;
    public int elementCount=0;
    public abstract boolean isEmpty();
    public abstract boolean isFull();
    public abstract int enqueue(int newElement);
    public abstract int dequeue();



}

package com.emrecan.queueWithLinkedList;

/**
 * @author Emrecan
 * @created 21/11/2021 - 02:13
 */
public abstract class QueueADT {

    public Node frontNode;
    public Node backNode;
    public abstract boolean isEmpty();
    public abstract void enqueue(int newElement);
    public abstract int dequeue();

}

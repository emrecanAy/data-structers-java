package com.emrecan.linkedList;

/**
 * @author Emrecan
 * @created 19/11/2021 - 20:43
 */
public abstract class LinkedListADT {

    public Node firstNode;
    public int size = 0;
    public abstract void addFirst(int data);
    public abstract void addLast(int data);
    public abstract void addToPosition(int position, int data);
    public abstract void removeFirst();
    public abstract void removeLast();
    public abstract void removeFromPosition(int position);
    public abstract Node getNodeFromPosition(int position);
    public abstract String printElements();

}

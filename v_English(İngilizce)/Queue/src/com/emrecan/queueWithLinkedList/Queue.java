package com.emrecan.queueWithLinkedList;

/**
 * @author Emrecan
 * @created 21/11/2021 - 02:13
 */
public class Queue extends QueueADT{


    /**
     * Checks if linkedlist empty
     * @return if is empty returns true, else false
     */
    @Override
    public boolean isEmpty() {
        return frontNode == null;
    }

    /**
     * Adds element to list
     * @param newElement
     */
    @Override
    public void enqueue(int newElement) {
        Node nodeToAdd = new Node(newElement);
        if(isEmpty()){
            frontNode = backNode = nodeToAdd;
        }else{
            backNode.next = nodeToAdd;
            backNode = nodeToAdd;
        }
    }

    /**
     * Removes first added element from list
     * @return returns first added element and removes else returns -1
     */
    @Override
    public int dequeue() {
        if (isEmpty()){
            System.out.println("StackUnderFlow");
            return -1;
        }
        Node nodeToRemove = frontNode;
        frontNode = frontNode.next;
        return nodeToRemove.data;
    }
}

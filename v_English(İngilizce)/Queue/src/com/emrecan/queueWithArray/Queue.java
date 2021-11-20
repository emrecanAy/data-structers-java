package com.emrecan.queueWithArray;

/**
 * @author Emrecan
 * @created 21/11/2021 - 00:44
 */
public class Queue extends QueueADT {

    /**
     * Checks if array is empty.
     * @return if array is empty returns true
     */
    @Override
    public boolean isEmpty() {
        return elementCount == 0;
    }

    /**
     * Checks if array is full.
     * @return if array is full returns true
     */
    @Override
    public boolean isFull() {
        return elementCount == Q.length;
    }

    /**
     * Adds element to array.
     * @param newElement
     * @return if adds returns 0, else returns -1
     */
    @Override
    public int enqueue(int newElement) {
        if(isFull()){
            System.out.println("StackOverFlow");
            return -1;
        }
        Q[back] = newElement;
        back++;
        if(back == Q.length){
            back = 0;
        }
        elementCount++;
        return 0;
    }

    /**
     * Removes first added element from array.
     * @return if removes returns first element, else returns -1
     */
    @Override
    public int dequeue() {
        if(isEmpty()){
            System.out.println("StackUnderFlow");
            return -1;
        }
        int idx = front;
        front++;
        if(front == Q.length){
            front = 0;
        }
        elementCount++;
        return Q[idx];
    }
}

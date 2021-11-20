package com.emrecan.stackWithArray;

/**
 * @author Emrecan
 * @created 20/11/2021 - 13:04
 */
public class Stack extends StackADT{

    public Stack(){
        stack = new int[MAX_SIZE];
        count = 0;
    }

    /**
     * Checks stack is empty or not.
     * @return if stack is empty returns true.
     */
    @Override
    public boolean isEmpty() {
        return count < 1;
    }

    /**
     * Checks stack is full or not.
     * @return if stack is full returns true.
     */
    @Override
    public boolean isFull() {
        return count == MAX_SIZE - 1;
    }

    /**
     * Adds new element to stack.
     * @param newElement
     * @return if stack is full returns -1. Else adds and returns 0.
     */
    @Override
    public int push(int newElement) {
        if(isFull()){
            System.out.println("StackOverFlow!");
            return -1;
        }
        stack[count] = newElement;
        count++;
        return 0;
    }

    /**
     * Removes last added element from stack.
     * @return if stack is empty returns -1. Else removes and returns last added element.
     */
    @Override
    public int pop() {
        if(isEmpty()){
            System.out.println("StachUnderFlow");
            return -1;
        }
        int idx = count - 1;
        count--;
        return stack[idx];
    }

    @Override
    public int top() {
        if(isEmpty()){
            System.out.println("StackUnderFlow");
            return -1;
        }
        return stack[count-1];
    }
}

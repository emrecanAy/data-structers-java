package com.emrecan.stackWithLinkedList;

/**
 * @author Emrecan
 * @created 20/11/2021 - 21:33
 */
public class Stack extends StackADT{

    /**
     * Checks stack is empty or not.
     * @return if stack is empty returns true.
     */
    @Override
    public boolean isEmpty() {
        if(topNode == null) return true;
        else return false;
    }

    /**
     * Adds new element to stack.
     * @param newElement
     * @return if stack is full returns -1. Else adds and returns 0.
     */
    @Override
    public void push(int newElement) {
        Node nodeToAdd = new Node(newElement);
        nodeToAdd.next = topNode;
        topNode = nodeToAdd;

    }

    /**
     * Removes last added element from stack.
     * @return if stack is empty returns -1. Else removes and returns last added element.
     */
    @Override
    public int pop() {
        if(isEmpty()){
            System.out.println("StackUnderFlow");
            return -1;
        }
        Node nodeToPop = topNode;
        topNode = topNode.next;
        return nodeToPop.data;
    }

    /**
     * Returns last added element from stack.
     * @return if stack is empty returns -1.
     */
    @Override
    public int top() {
        if(isEmpty()){
            System.out.println("StackUnderFlow");
            return -1;
        }
        return topNode.data;
    }
}

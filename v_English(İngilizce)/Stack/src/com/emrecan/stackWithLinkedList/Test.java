package com.emrecan.stackWithLinkedList;

/**
 * @author Emrecan
 * @created 20/11/2021 - 21:37
 */
public class Test {

    public static void main(String[] args) {

        Stack stack = new Stack();

        //is stack empty tests!
        System.out.println(stack.isEmpty());

        //pushing to stack tests!
        stack.push(5);
        stack.push(3);
        System.out.println(stack.pop());
        stack.push(2);
        stack.push(8);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(9);
        stack.push(1);
        System.out.println(stack.pop());
        stack.push(7);
        stack.push(6);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

}

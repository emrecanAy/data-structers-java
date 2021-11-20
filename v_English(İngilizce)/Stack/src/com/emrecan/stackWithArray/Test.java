package com.emrecan.stackWithArray;

/**
 * @author Emrecan
 * @created 20/11/2021 - 13:04
 */
public class Test {

    public static void main(String[] args) {

        Stack stack = new Stack();

        //is stack empty tests!
        System.out.println(stack.isEmpty());

        //is stack full tests!
        System.out.println(stack.isFull());

        //pushing to stack tests!
        stack.push(8);
        System.out.println("8 pushed!");
        stack.push(13);
        System.out.println("13 pushed!");
        stack.push(5);
        System.out.println("5 pushed!");
        stack.push(7);
        System.out.println("7 pushed!");
        stack.push(53);
        System.out.println("53 pushed!");


        //pop from stack tests!
        System.out.println("Element removed from top of stack : " + stack.pop());
        System.out.println("Element removed from top of stack : " + stack.pop());

        //get top element from stack tests!
        System.out.println("Element from top of stack : " + stack.top());





    }
}

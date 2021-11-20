package com.emrecan.linkedList;

/**
 * @author Emrecan
 * @created 19/11/2021 - 21:14
 */
public class Test {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        //adding first tests!
        linkedList.addFirst(5);
        linkedList.addFirst(8);
        linkedList.addFirst(3);
        System.out.println(linkedList.printElements());

        //adding last tests!
        linkedList.addLast(9);
        linkedList.addLast(7);
        linkedList.addLast(26);
        System.out.println(linkedList.printElements());

        //adding to position tests!
        linkedList.addToPosition(2, 13);
        System.out.println(linkedList.printElements());

        //removing first tests!
        linkedList.removeFirst();
        System.out.println(linkedList.printElements());

        //removing last tests!
        linkedList.removeLast();
        System.out.println(linkedList.printElements());

        //removing from position tests!
        linkedList.removeFromPosition(2);
        System.out.println(linkedList.printElements());

        //getting from position tests!
        System.out.println(linkedList.getNodeFromPosition(2).data);

    }


}

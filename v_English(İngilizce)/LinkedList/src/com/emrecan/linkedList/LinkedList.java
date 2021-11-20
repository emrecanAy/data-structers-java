package com.emrecan.linkedList;

/**
 * @author Emrecan
 * @created 19/11/2021 - 20:44
 */
public class LinkedList extends LinkedListADT{


    @Override
    public void addFirst(int data) {
        Node nodeToAdd = new Node(data);
        if (firstNode != null) {
            nodeToAdd.next = firstNode;
        }
        firstNode = nodeToAdd;
        size++;
    }

    @Override
    public void addLast(int data) {
        Node nodeToAdd = new Node(data);
        if(firstNode == null){
            firstNode = nodeToAdd;
        }else{
            Node travelerNode = firstNode;
            while (travelerNode != null){
                if(travelerNode.next != null){
                    travelerNode = travelerNode.next;
                }else break;
            }
            travelerNode.next = nodeToAdd;
            nodeToAdd.next = null;
        }
    }

    @Override
    public void addToPosition(int position, int data) {
        Node nodeToAdd = new Node(data);
        if(firstNode == null){
            firstNode = nodeToAdd;
        }else{
            Node travelerNode = firstNode;
            for(int i=0; i < position-1; i++){
                if(travelerNode != null){
                    if(travelerNode.next != null){
                        travelerNode = travelerNode.next;
                    }
                }
            }
            nodeToAdd.next = travelerNode.next;
            travelerNode.next = nodeToAdd;
        }
        size++;
    }

    @Override
    public void removeFirst() {
        if(firstNode != null){
            Node temporaryNode;
            temporaryNode = firstNode.next;
            firstNode = temporaryNode;
        }else{
            System.out.println("Empty linkedlist!");
        }
        size--;

    }

    @Override
    public void removeLast() {
        if(firstNode == null){
            System.out.println("Empty linkedlist!");
        }else if(firstNode.next == null){
            firstNode = null;
        }else{
            Node travelerNode = firstNode;
            Node penultimateNode = firstNode;

            while (travelerNode.next != null){
                penultimateNode = travelerNode;
                travelerNode = travelerNode.next;
            }
            penultimateNode.next = null;
        }
        size--;
    }

    @Override
    public void removeFromPosition(int position) {
        Node travelerNode = firstNode;
        Node nodeBeforePosition = firstNode;
        for (int i = 0; i < position; i++){
            if (travelerNode != null) {
                nodeBeforePosition = travelerNode;
                travelerNode = travelerNode.next;
            }
        }
        nodeBeforePosition.next = travelerNode.next;
        travelerNode.next = null;
        size--;

    }

    @Override
    public Node getNodeFromPosition(int position) {
        Node travelerNode = firstNode;
        for (int i = 0; i < position; i++){
            if(travelerNode != null){
                travelerNode = travelerNode.next;
            }
        }
        return travelerNode;
    }

    @Override
    public String printElements() {
        String nodeElements = "";
        Node travelerNode = firstNode;

        while (travelerNode != null){
            nodeElements += " " + travelerNode.data + " ";
            if(travelerNode.next != null){
                travelerNode = travelerNode.next;
            }else{
                break;
            }
        }
        return nodeElements;
    }
}

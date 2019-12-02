package com.company;

import java.sql.SQLOutput;

public class LinkedList {

    private Node first;
    private Node last;

    public LinkedList() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return  first == null;
    }

    public void insertNodes(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty()) {
            last = newNode;
        } else {
            first.previous = newNode;
        }
        newNode.next = first;
        this.first = newNode;
    }

    public void printNodesForward() {
        System.out.println(" Here is the linked list in the original order: ");
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

    public void printNodesBackward() {
        System.out.println(" Here is the linked list in reverse order: ");
        Node current = last;
        while (current != null) {
            current.displayNode();
            current = current.previous;
        }
        System.out.println();
    }
}

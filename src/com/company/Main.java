package com.company;

public class Main {

    public static void main(String[] args) {

        LinkedList myList = new LinkedList();

        myList.insertNodes(5);
        myList.insertNodes(4);
        myList.insertNodes(3);
        myList.insertNodes(2);
        myList.insertNodes(1);

        System.out.println(); myList.printNodesForward();
        System.out.println(); myList.printNodesBackward();

    }
}

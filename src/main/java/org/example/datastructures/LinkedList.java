package org.example.datastructures;

public class LinkedList {
    Node head;

    public void appendNode(int value) {
        Node newNode = new Node(value, null);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // need to handle null cases

    public boolean removeNode(Node itemToRemove) {

        if (head == null || itemToRemove == null) {
            return false;
        }

        if (head.equals(itemToRemove)) {
            head = head.next;
            return true;
        }

        Node current = head;

        while (current.next != null) {
            if (current.next.equals(itemToRemove)) {
                current.next = itemToRemove.next;
                return true;
            }
            current = current.next;
        }

      /*
        while (current.next != itemToRemove) {
            current = current.next;
        }

        current.next = itemToRemove.next;
    }

       */

        return false;
    }

}

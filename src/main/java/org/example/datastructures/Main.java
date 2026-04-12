package org.example.datastructures;

public class Main {
    public static void main(String[] args) {
        Node n2 = new Node(3, null);
        Node n1 = new Node(2, n2);
        Node head = new Node(1, n1);

        LinkedList l1 = new LinkedList();
        l1.appendNode(1);
        l1.appendNode(2);
        l1.appendNode(3);


        Node current = head;

        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
        String[] names = {"Rudo", "Enjin", "Zanka", "Riyo"};

        float x = 9;
        float y = 5;
        int z = (int) (x / y);
        System.out.println("This is z: "  + z);


    }
}

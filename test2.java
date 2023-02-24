class Node {
    int data;
    Node next;

    public void display() {

        System.out.print(this.data + "\t");

    }

}

class LinkedList {
    Node head;
    Node tail;

    public void insertAtBeginning(int value) {

        Node node1 = new Node();
        node1.data = value;
        node1.next = head;

        if (this.head == null) {

            this.head = this.tail = node1;
        } else {

            this.head = node1;
        }

    }

    // ---------------------------------------------------------------------------------

    public void insertAtLast(int value) {
        Node node2 = new Node();

        node2.data = value;
        node2.next = null;

        if (this.head == null) {

            this.head = this.tail = node2;
        } else {
            this.tail.next = node2;
            this.tail = node2;
        }

    }

    // -----------------------------------------------------------------------------

    public void insertAtBetween(int value, int pos) {

        Node node3 = new Node();
        node3.data = value;

        if (this.head == null) {
            this.head = this.tail = null;
        } else {

            Node temp = head;

            Node current = null;

            for (int i = 0; i < pos - 1; i++) {

                current = temp;
                temp = temp.next;
            }

            current.next = node3;
            node3.next = temp;

        }

    }

    public void visit() {

        for (Node current = head; current != null; current = current.next) {

            current.display();
        }

    }

}

public class test2 {

    public static void main(String args[]) {

        LinkedList L = new LinkedList();
        L.insertAtBeginning(12);
        L.insertAtBeginning(13);
        L.insertAtBeginning(42);
        L.insertAtBeginning(152);
        L.insertAtBeginning(112);
        L.insertAtLast(111);
        L.insertAtBetween(555, 3);
        L.visit();

    }

}

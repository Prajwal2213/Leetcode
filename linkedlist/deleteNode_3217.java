package linkedlist;

class Linkedlist {
    Node head;

    class Node {
        int data;
        Node next = null;

        Node(int data) {
            this.data = data;
        }
    }

    void insertAtbeginning(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;

    }

    void printLinkedlist() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class deleteNode_3217 {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();

        list.insertAtbeginning(30);
        list.insertAtbeginning(35);
        list.printLinkedlist();

    }
}
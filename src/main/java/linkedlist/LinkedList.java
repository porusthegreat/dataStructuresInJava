package linkedlist;

public class LinkedList {

    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }

        public static void main(String[] args) {
            LinkedList list = new LinkedList();

            head = new Node(1);
            Node second = new Node(2);
            Node third = new Node(3);
            Node fourth = new Node(4);
            Node fifth = new Node(5);
            Node sixth = new Node(6);

            head.next = second;
            second.next = third;
            third.next = fourth;
            fourth.next = fifth;
            fifth.next = sixth;

            list.printList();
            System.out.println("Reverse Order");
            list.printReverseList(head);
            //delete a Node

            int size = list.size();
            System.out.println("Size: " + size);
            System.out.println("Deleting node 3");


            list.deleteNodeWithIndex(4, list);
            //linked list after deleting node 3
            list.printList();
        }
    }

    private void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    private void printReverseList(Node head) {
        if (head == null)
            return;
        printReverseList(head.next);
        System.out.println(head.data);
    }

    private void deleteNodeWithIndex(int d, LinkedList linkedList) {

        if (head == null)
            return;

        if( d >= linkedList.size())
            return;

        Node temp = head;

        if (d == 0) {
            head = temp.next;
            return;
        }

        for (int i = 0; temp != null && i < d - 1; i++)
            temp = temp.next;

        if (temp == null && temp.next == null)
            return;

        temp.next = temp.next.next;

    }

    private int size(){
        Node temp = head;
        int i = 0;
        while (temp != null) {
            temp = temp.next;
            ++i;
        }
        return i;
    }
}

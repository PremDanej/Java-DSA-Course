package LinkedList;

/*
 * Insert Node at Last.
 */
public class InsertLast {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        Node head = n1;
        head = addLast(head, 60);

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    private static Node addLast(Node head, int i) {
        Node n = new Node(i);

        Node tail = head;
        while (tail.next != null) {
            tail = tail.next; // getting a tail
        }

        tail.next = n;
        return head;
    }
}

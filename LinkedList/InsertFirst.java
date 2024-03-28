package LinkedList;

/*
 * Insert Node at First.
 */
public class InsertFirst {

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

        Node headNode = n1;
        headNode = addFirst(headNode, 60);

        Node temp = headNode;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    private static Node addFirst(Node headNode, int i) {
        Node n = new Node(i);
        n.next = headNode;
        return n;
    }
}

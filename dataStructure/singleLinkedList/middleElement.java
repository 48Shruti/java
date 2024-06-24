package dataStructure.singleLinkedList;

public class middleElement {
    Node head = null;
    Node tail = null;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insert(String data) {
        Node new_Node = new Node(data);
        head = new_Node;
        new_Node = new_Node.next;

    }

    public void print() {
        if (head == null) {
            System.out.println("Linked list is empty");
        }
        Node curNode = head;
        while (curNode.next != null) {
            System.out.println(curNode.data + " ");
            curNode = curNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        middleElement m1 = new middleElement();
        m1.insert("2");
        m1.insert("is");
        m1.insert("a");
        m1.insert("two");
        m1.print();
    }
}

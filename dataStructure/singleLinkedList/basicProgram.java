package dataStructure.singleLinkedList;

public class basicProgram {

    Node head; // first node
    private int size;

    basicProgram() {
        this.size = 0;
    }

    class Node { // user defined data type
        String data;
        Node next;

        Node(String data) { // name of constructor and name of class should be same
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data) {
        Node newNodeFirst = new Node(data); // to userdefined data type need to create object
        if (head == null) {
            head = newNodeFirst;
            return;
        }
        newNodeFirst.next = head;
        head = newNodeFirst;
    }

    public void addSpecific(int pos, String data) {
        Node newNode = new Node(data);
        if (pos == 1) {
            newNode.next = head;
            head = newNode;
        }
        Node prev = head;
        for (int i = 1; i < pos - 1; i++) {
            prev = prev.next;
        }
        newNode.next = prev.next;
        prev.next = newNode;
        size++;

    }

    // public void addLast(String data) {
    // Node newNodeLast = new Node(data);
    // if (head == null) {
    // head = newNodeLast;
    // return;
    // }
    // Node currNode = head;
    // while (currNode.next != null) {
    // currNode = currNode.next;
    // }
    // currNode.next = newNodeLast;
    // }

    public void printList() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
            // System.out.print(currNode.data + "->");
        }
        System.out.println("NULL");
    }

    public void deleteFirst() {
        head = head.next;
        size--;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node lastNode = head.next;
        Node secondLast = head;
        size--;
        if (head.next == null) {
            head = null;
        }
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public void deleteSpecific(int pos) {

    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        basicProgram list = new basicProgram();
        // list.addFirst("is");
        // list.addFirst("Shruti");
        // list.printList();

        // list.addFirst("india");
        // list.printList();

        // list.addLast("sharma");
        // list.printList();

        // list.addLast(".");
        // list.printList();

        // list.deleteFirst();
        // list.printList();

        // list.deleteLast();
        // list.printList();

        // System.out.println(list.getSize());
        // list.deleteFirst();
        // list.printList();
        // System.out.println(list.getSize());
        // list.deleteFirst();
        // list.printList();
        // System.out.println(list.getSize());
        // list.deleteFirst();
        // list.printList();
        // System.out.println(list.getSize());

        // list.addSpecific(3, "how");
        // list.printList();
        // System.out.println(list.getSize());

    }
}

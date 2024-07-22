
import java.util.*;

public class collection {

    public void linkedList1() {
        LinkedList<String> linked = new LinkedList<String>();
        linked.addFirst("is");
        linked.addFirst("a");
        linked.addLast("shruti");
        linked.addLast("there");
        linked.addFirst("animal");
        System.out.println(linked);
        System.out.println(linked.size());
        System.out.println(linked.getLast());
        System.out.println(linked.indexOf("animal"));
    }

    public void arrayList1() {
        ArrayList<String> arrayL = new ArrayList<String>();
        arrayL.add("null");
        arrayL.add("a");
        arrayL.add("b");
        arrayL.add("abc");
        arrayL.remove(0);
        arrayL.add(0, "hello");
        System.out.println(arrayL.indexOf("abc"));
        System.out.println(arrayL);
    }

    public static void main(String[] args) {
        collection c1 = new collection();
        // c1.linkedList1();
        c1.arrayList1();
    }
}

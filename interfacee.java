interface hello {
    public void show();

    // public int add();

    public void display();
}

public class interfacee implements hello {
    public void show() {
        System.out.println("Show");
    }

    // public int add() {
    // int a = 10;
    // int b = 20;
    // int c = a + b;
    // return c;
    // }

    public void display() {
        System.out.println("Display");
    }

    public static void main(String[] args) {
        interfacee int1 = new interfacee();
        int1.show();
        int1.display();
        // int1.add();
    }
}

interface hello {
    public void show();

    public void display();
}

public class interfacee implements hello {
    public void show() {
        System.out.println("Show");
    }

    public void display() {
        System.out.println("Display");
    }

    public static void main(String[] args) {
        interfacee int1 = new interfacee();
        int1.show();
        int1.display();
    }
}

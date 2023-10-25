public class thiskey {
    int a = 10;
    int b = 23;

    public int hello(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        thiskey.hello(2, 3);
    }
}

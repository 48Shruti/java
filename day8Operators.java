public class day8Operators {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int div(int a, int b) {
        return a / b;
    }

    public static int modulus(int a, int b) {
        return a % b;
    }

    public static void postIncrement(int a, int b) {
        b = a++;
        System.out.println(b);
        System.out.println(a);
    }

    public static void preIncrement(int a, int b) {
        b = ++a;
        System.out.println(b);
        System.out.println(a);
    }

    public static void postDecrement(int a, int b) {
        b = a--;
        System.out.println(b);
        System.out.println(a);
    }

    public static void preDecrement(int a, int b) {
        b = --a;
        System.out.println(b);
        System.out.println(a);
    }

    public static void main(String[] args) {
        int x = 12;
        int y = 6;
        System.out.println(add(x, y));
        System.out.println(div(x, y));
        System.out.println(modulus(x, y));
        postDecrement(x, y);
        postIncrement(x, y);
        preDecrement(x, y);
        preIncrement(x, y);
    }
}

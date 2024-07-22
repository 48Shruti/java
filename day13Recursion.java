public class day13Recursion {
    public static void printNum(int n) {
        // 1. BASE CODE(condition)
        // 2. one step taken by upper function
        // 3. call function it self
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNum(n - 1);
    }

    public static void print1to5(int n) {
        if (n > 5) {
            return;
        }
        System.out.println(n);
        print1to5(n + 1);
    }

    public static void printSum(int n, int i, int sum) {
        if (i == n) {
            sum += i;

            System.out.println(sum);
            return;
        }
        sum += i;
        System.out.println(i);
        printSum(n, i + 1, sum);
    }

    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int fact = factorial(n - 1);
        int mult = n * fact;

        return mult;
    }

    public static void fiboRec(int n, int a, int b) {
        // int c = 0;
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        fiboRec(n - 1, b, c);
    }

    public static int factorialsim(int n) {
        // simple iteration method
        int mult = 1;
        for (int i = n; i >= 1; i--) {
            mult *= i;
        }
        return mult;
    }

    public static void fibosim(int a, int b, int n) {
        a = 0;
        b = 1;
        int c;
        int temp = 0;

        for (int i = 0; i < n; i++) {

            System.out.println(a);
            c = a + b;
            temp = b;
            b = c;
            a = temp;
        }

    }

    public static void main(String[] args) {
        // 5 to 1
        int n = 3;
        int i = 1;
        int sum = 0;

        // printSum(n, i, sum);
        // printNum(num);
        // print1to5(n);
        // System.out.println(factorial(n));
        // System.out.println(factorialsim(n));
        // fibosim(0, 1, 6);

        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        fiboRec(n - 2, a, b);
    }
}

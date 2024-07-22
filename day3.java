import java.util.Scanner;

public class day3 {

    public static int sum(int num1, int num2) {
        int sumation = num1 + num2;
        return sumation;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static void factorial(int num) {
        int number = 1;
        for (int i = num; i >= 1; i--) {
            number = number * i;
        }
        System.out.println(number);
    }

    public static void even(int a) {
        if (a % 2 == 0) {
            System.out.println(a + " is even");
        } else {
            System.out.println(a + " is odd ");
        }
    }

    public static void table(int b) {
        int b1 = 1;
        System.out.println("Table of " + b + " is ");
        for (int i = 1; i <= 10; i++) {
            b1 = b * i;
            System.out.println(b + " " + "*" + " " + i + " " + "= " + b1);
        }
    }

    public static void main(String[] args) {
        // for even numbers till n
        // int n = 30;
        // for (int i = 1; i <= n; i++) {
        // if (i % 2 == 0) {
        // System.out.println(i);
        // }
        // }

        // if user enter 1 then input of student marks out of 100 if enter 0 then stop
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter 1 or 0");
        // int number = sc.nextInt();
        // if (number == 1) {
        // Scanner sc1 = new Scanner(System.in);
        // System.out.println("Enter your marks out of 100");
        // int marks = sc1.nextInt();
        // if (marks >= 90 || marks >= 100) {
        // System.out.println("This is good");
        // } else if (marks >= 89 || marks >= 60) {
        // System.out.println("This is also good");
        // } else if (marks >= 0 && marks <= 59) {
        // System.out.println("This is good as well");
        // }
        // } else
        // System.out.println("Stop");

        // functions

        // sum of two numbers
        // int a = 2;
        // int b = 3;
        // int result = sum(a, b);
        // System.out.println(result);

        // multiply two numbers using function
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int num1 = sc.nextInt();
        // Scanner sc1 = new Scanner(System.in);
        // System.out.println("Enter b number");
        // int num2 = sc1.nextInt();
        // int result = multiply(num1, num2);
        // System.out.println(result);

        // factorial
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter n value");
        // int n = sc.nextInt();
        // factorial(n);

        // even or odd using functions
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number");
        // int num1 = sc.nextInt();
        // even(num1);

        // table
        Scanner scp = new Scanner(System.in);
        System.out.println("Enter number for table");
        int src = scp.nextInt();
        scp.close();
        table(src);
    }

}

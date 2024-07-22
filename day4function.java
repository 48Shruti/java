import java.util.Scanner;

public class day4function {
    public static void average(int a, int b, int c) {
        float average = (a + b + c) / 3;
        System.out.println("average is " + average);
    }

    public static void oddSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("sum " + sum);
    }

    public static void greater(int c, int d) {
        if (c > d) {
            System.out.println(c);
        } else {
            System.out.println(d);
        }
    }

    public static void circumfrance(int e) {
        double pie = 3.14;
        double circum = (2 * pie * e);
        System.out.println(circum);
    }

    public static void voteEligible(int f) {
        if (f > 18) {
            System.out.println("You are eligible for vote");
        } else {
            System.out.println("You are  not eligible for vote");
        }
    }

    public static void power(int g, int h) {
        int result = 1;
        for (int i = 0; i <= h; i++) {
            result = result * g;
            System.out.println(result);
        }
    }

    public static void main(String[] args) {

        // problem 1 to print average of three numbers
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter first number");
        int users1 = sc1.nextInt();
        sc1.close();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter second number");
        int user2 = sc2.nextInt();
        sc2.close();
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter third number");
        int user3 = sc3.nextInt();
        sc3.close();
        average(users1, user2, user3);

        // problem 2
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter value of n");
        // int number = sc.nextInt();
        // oddSum(number);

        // problem 3
        // Scanner sc1 = new Scanner(System.in);
        // System.out.println("Enter value of n");
        // int number1 = sc1.nextInt();
        // Scanner sc2 = new Scanner(System.in);
        // System.out.println("Enter value of n");
        // int number2 = sc2.nextInt();
        // greater(number1, number2);

        // problem 4
        // Scanner sc1 = new Scanner(System.in);
        // System.out.println("Enter value of r");
        // int number = sc1.nextInt();
        // circumfrance(number);

        // problem 5
        // Scanner sc1 = new Scanner(System.in);
        // System.out.println("Enter value of age");
        // int ageOfPerson = sc1.nextInt();
        // voteEligible(ageOfPerson);

        // problem 6
        // Scanner scr1 = new Scanner(System.in);
        // System.out.println("Enter value of x");
        // int x1 = scr1.nextInt();
        // Scanner scr2 = new Scanner(System.in);
        // System.out.println("Enter value of n ");
        // int n = scr2.nextInt();
        // power(x1, n);
    }

}

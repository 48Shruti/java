import java.util.Scanner;

public class day11swap {
    // swap two numbers
    public static void main(String[] args) {

        // swap two numbers

        int temp = 0;
        // Enter number 1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input");
        int num1 = sc.nextInt();
        // Enter number 2
        int num2 = sc.nextInt();
        temp = num1;
        num1 = num2;
        num2 = temp;
        // temp = num1;
        System.out.println("swap" + num1);
        System.out.println("swap" + num2);
        sc.close();

    }
}

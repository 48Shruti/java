package dailyQuestion;

import java.util.Scanner;

public class primeNumber {

    public static void main(String[] args) {
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        sc.close();

        // for non prime number
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("prime number");
        } else {
            System.out.println("not prime");
        }
    }
}

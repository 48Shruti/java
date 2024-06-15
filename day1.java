import java.util.Scanner;

public class day1 {
    public static void main(String[] args) {
        String a = "Yes";
        System.out.println("Its 15 jan");
        System.out.println("Today we are going to make 'S' alphabet");
        System.out.println("Are u ready ?");
        Scanner scan = new Scanner(System.in);
        String answer = scan.nextLine();
        scan.close();
        if (answer == a) {
            System.out.println("Welcome");
        } else {
            System.out.println(answer);
        }

        for (int i = 0; i <= 3; i++) {
            // for (int j = 0; j <= 4; j++) {
            // System.out.print("*");

            if (i == 0) {
                for (int j = 0; j <= 3; j++) {
                    System.out.print("*");
                }
            }
            // if (i == 1 && j == 0) {
            // System.out.print("*");
            // }

            // System.out.println("*");
        }
        // if (i == 0 && j == ) {
        // System.out.print("*");
        // }
    }
}

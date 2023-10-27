import java.util.Scanner;

public class loops {
    public static void main(String[] args) {

        // for loop
        // for (int i = 0; i < 10; i++) {
        // System.out.println(i + ":" + "hello");
        // }

        // while loop
        // int i = 0;
        // while (i < 11) {
        // System.out.println(i);
        // i++;
        // }

        // do while
        // int i = 0;
        // do {
        // System.out.println(i);
        // i++;
        // } while (i > 11);

        // print sum of first n natural numbers where n = 4
        // int temp = 0;
        // for (int i = 1; i <= 4; i++) {
        // temp = temp + i; // 0+1+2+3+4 = temp
        // }
        // System.out.print(temp);

        // print the number of table input by user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input");
        int input = sc.nextInt();
        int multi = 1;
        for (int i = 1; i <= 10; i++) {
            multi = input * i;
            System.out.println(multi);
        }

    }
}

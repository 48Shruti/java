package dailyQuestion;

import java.util.Scanner;

public class addTwoBinary {
    static String addBinary(String b1, String b2) {
        int a = Integer.parseInt(b1, 2);
        int b = Integer.parseInt(b2, 2);
        int sum = a + b;
        String result = Integer.toBinaryString(sum);
        System.out.println(result);
        // String s1 = Integer.toString(sum);
        // System.out.println(s1);
        return result;
    }

    public static void main(String[] args) {
        // scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st binary");
        String b1 = sc.nextLine();
        System.out.println("Enter @nd binary");
        String b2 = sc.nextLine();
        sc.close();
        addBinary(b1, b2);

    }
}

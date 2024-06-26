
package dailyQuestion;

import java.util.*;

public class evenOdd {
    // scanner for input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input");
        int inp = sc.nextInt();
        if (inp % 2 == 0) {
            System.out.println("input is even");
        } else {
            System.out.println("odd");
        }
        sc.close();
    }
}

package dailyQuestion;

import java.util.Scanner;

public class swapTwoNum {
    public void swap(int num1, int num2) {
        int temp = 0;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("output");
        System.out.println(num1);
        System.out.println(num2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter inp1");
        int int1 = sc.nextInt();
        System.out.println("Enter inp2");
        int int2 = sc.nextInt();
        swapTwoNum swap1 = new swapTwoNum();
        swap1.swap(int1, int2);
        sc.close();
    }
}

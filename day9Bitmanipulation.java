import java.util.Scanner;

public class day9Bitmanipulation {
    public static void main(String[] args) {

        // get bit using Bit mask and AND Gate
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter position");
        // int pos = sc.nextInt();
        // System.out.println("Enter number");
        // int n = sc.nextInt();
        // // Bit mask
        // int bit = 1 << pos;
        // //And gate
        // if ((bit & n) == 0) {
        // System.out.println("bit is 0");
        // } else {
        // System.out.println("Bit is one");
        // }
        // sc.close();

        // set bit using bit mask and OR gate
        // int pos = 1;
        // int n = 5;
        // int bitMask = 1 << pos;
        // int result = n | bitMask;
        // System.out.println(result);

        // clear bit using and with not gate
        // int pos = 2;
        // int n = 5;
        // int bitMask = 1 << pos;
        // int not = ~bitMask;
        // int result = n & not;
        // System.out.println(result);

        // update bit
        int pos = 1;
        int n = 5;
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        sc.close();
        int bitMask = 1 << pos;
        // if oper 1 that means update 1 with OR gate else update 0 with AND with NOT
        // gate
        if (oper == 1) {
            int result = n | bitMask;
            System.out.println(result);
        } else {
            int notBitMask = ~(bitMask);
            int result = n & notBitMask;
            System.out.println(result);
        }

    }
}

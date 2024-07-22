import java.util.Scanner;

public class day6String {
    public static void main(String[] args) {
        // scanner and string is non permittive data type in java
        // String name = "This is a india";
        // System.out.println(name);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name here");
        String name = scan.nextLine();
        scan.close();
        System.out.println("Welcome " + name);
        int size = name.length();
        System.out.println(size);

        for (int i = 0; i < size; i++) {
            System.out.println(name.charAt(i));
        }
    }
}

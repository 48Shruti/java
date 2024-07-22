import java.util.Scanner;

public class day5array {
    public static void main(String[] args) {

        // directly call
        // int[] marks = { 1, 2, 3, 4 };
        // for (int i = 0; i < 4; i++) {
        // System.out.println(marks[i]);
        // }

        // method 2
        // int[] marks = new int[4];
        // marks[0] = 79;
        // marks[1] = 80;
        // marks[2] = 50;
        // marks[3] = 60;
        // System.out.println(marks[1]);
        // for (int i = 0; i < 4; i++) {
        // System.out.println(marks[i]);
        // }

        // String[] name = new String[3];
        // name[0] = "shruti";
        // name[1] = "Vanshika";
        // name[2] = "Nikita";
        // for (int i = 0; i < 3; i++) {
        // System.out.println(name[i]);
        // }

        // input size from user
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of array");
        // int size = sc.nextInt();
        // int[] age = new int[size];
        // for (int i = 0; i < size; i++) {
        // Scanner sc1 = new Scanner(System.in);
        // System.out.println("Enter value of array");
        // int value = sc1.nextInt();
        // age[i] = value;
        // }
        // for (int i = 0; i < size; i++) {
        // System.out.println("Output " + age[i]);
        // }

        // find maximum and minimum number of array
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of array");
        // int size = sc.nextInt();
        // int[] number = new int[size];
        // for (int i = 0; i < size; i++) {
        // Scanner sc1 = new Scanner(System.in);
        // number[i] = sc1.nextInt();
        // }
        // int maximum = number[0];
        // int minimum = number[0];
        // for (int i = 0; i < number.length; i++) {
        // if (number[i] > maximum) {
        // maximum = number[i];
        // }
        // if (number[i] < minimum) {
        // minimum = number[i];
        // }
        // }
        // System.out.println("maximum number is" + maximum);
        // System.out.println("maximum number is" + minimum);

        // input from user check if it is sorted in ascending order
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter size of array");
        // int size = scanner.nextInt();
        // System.out.println("Enter elements of array");
        // int[] array = new int[size];
        // for (int i = 0; i < size; i++) {
        // Scanner scan = new Scanner(System.in);
        // array[i] = scan.nextInt();
        // }

        // boolean isAcending = true;
        // for (int i = 0; i < array.length - 1; i++) {
        // if (array[i] > array[i + 1]) {
        // isAcending = false;
        // }
        // }
        // if (isAcending) {
        // System.out.println("Acending");
        // } else {
        // System.out.println(" Not Ascending");
        // }
        // scanner.close();

        // 2D array for row 1 index is 0
        // Scanner scan1 = new Scanner(System.in);
        // System.out.println("Enter number of rows");
        // int row = scan1.nextInt();
        // System.out.println("Enter number of column");
        // int column = scan1.nextInt();
        // int[][] elements = new int[row][column];

        // for (int i = 0; i < row; i++) {
        // for (int j = 0; j < column; j++) {

        // elements[i][j] = scan1.nextInt();
        // }

        // }
        // System.out.println("Output");
        // for (int i = 0; i < row; i++) {
        // for (int j = 0; j < column; j++) {
        // System.out.print(elements[i][j] + " ");
        // }
        // System.out.println();
        // }
        // scan1.close();

        // Search x into 2D matrix
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter rows");
        // int row = sc.nextInt();
        // System.out.println("Enter column");
        // int column = sc.nextInt();
        // int[][] array = new int[row][column];
        // for (int i = 0; i < row; i++) {
        // for (int j = 0; j < column; j++) {
        // array[i][j] = sc.nextInt();
        // }
        // }
        // System.out.println("Enter value of x");
        // int x = sc.nextInt();
        // boolean isPresent = true;
        // for (int i = 0; i < row; i++) {
        // for (int j = 0; j < column; j++) {
        // if (array[i][j] == x) {
        // System.out.println("x is located" + i + j);
        // }
        // }
        // }

        // transpose of matrix
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row");
        int row = sc.nextInt();
        sc.close();
        System.out.println("Enter column");
        int column = sc.nextInt();
        int[][] array = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
        for (int j = 0; j < column; j++) {
            for (int i = 0; i < row; i++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}

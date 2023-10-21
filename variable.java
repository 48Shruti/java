import java.lang.reflect.Array;
import java.util.Scanner;

public class variable {
    public static void main(String[] args) {
        // permittive data type
        int a = 4;// size 4ṇ
        char c = 'a'; // size 2
        float f = 2.3838493f;// size 4
        double d = 4.393943944d;// size 8
        System.out.println(a);
        System.out.println(c);
        System.out.println(d);
        System.out.println(f);
        // non permittive data type
        String name = new String("Hello"); // print string
        System.out.println(name);
        int[] a1 = new int[3];// array of integer
        a1[1] = 3;
        System.out.println(a1[1]);
        // String array
        String[] animal = new String[4];
        animal[0] = "Dog";
        animal[1] = "Cat";
        animal[2] = "Wolf";
        animal[3] = "Lion";
        System.out.println(animal[0]);
        System.out.println(animal[1]);
        System.out.println(animal[2]);
        System.out.println(animal[3]);
        // constant
        final float pi = 3.14f;
        System.out.println(pi);
        // Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input");
        float input = sc.nextFloat();
        System.out.println("input = " + input);
        float area = (pi * input * input);
        System.out.println("area is " + area + "m");
        // find area of rectangle
        Scanner len = new Scanner(System.in);
        System.out.println("length " + len);
        float length = len.nextFloat();
        System.out.println(length);
        Scanner brth = new Scanner(System.in);
        System.out.println("breath " + brth);
        float breath = brth.nextFloat();
        System.out.println(breath);
        float perimeter = 2 * length * breath;
        System.out.println(perimeter);
    }
}

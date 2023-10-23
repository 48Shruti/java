import java.util.Scanner;
//Single inhertance
// class base {
//     String name = new String("Shruti");
// }

// public class inheritance extends base {
//     public static void main(String[] args) {
//         inheritance obj = new inheritance();
//         System.out.println(obj.name);
//     }
// }

//Multilevel inheritance
// class A {
//     String name = new String("Abc");
//     String degree = new String("B.A");
//     int roll = 35;
// }

// class B extends A {
//     float marks = 34.3f;
//     double percent = 45d;
// }

// class inheritance extends B {
//     public static void main(String[] args) {
//         inheritance obj = new inheritance();
//         System.out.println(obj.name);
//         System.out.println(obj.marks);
//         System.out.println(obj.percent);
//     }
// }

//hirarcial inheritance
class A {
    String name = new String("Abc");
    String degree = new String("B.A");
    int roll = 35;
}

class B extends A {
    public static void main(String[] args) {
        B obj1 = new B();
        System.out.println(obj1.name);
    }
}

class inheritance extends A {
    public static void main(String[] args) {
        inheritance obj2 = new inheritance();
        System.out.println(obj2.roll);
    }
}

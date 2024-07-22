
// class pen {
//     int price = 10;
//     String brand1 = "OX";
//     String type = "ball point";

//     public void print() {
//         System.out.println(this.brand1 + "print");
//         System.out.println(this.price);
//         System.out.println(this.type);
//     }

// }

// class pencilBox extends pen {
//     int numberPencil = 4;
//     String brand2 = "Natraj";
// }

// // hierical
// // Single
// // Multilevel
// public class day10OOPS extends pen {
//     int rollNo = 5;
//     String name = "Shruti";

//    
//     public static void main(String[] args) {
//         // declare of object using class name
//        // day10OOPS o2 = new day10OOPS(48, "sharma"); // constructor

//         // System.out.println(o2.rollNo); // proof object operate both data members and
//         // member functions
//         // System.out.println(o2.name);
//         // System.out.println(o2.brand1);
//         // o2.print();
//         // System.out.println(o2.brand2);
//         // System.out.println(o2.price);

//     }
// }

// constructors

class day10OOPS {
    // rules of constructor
    // construction have same name as class name
    // it donot have return type
    // it used once at one type object creation

    // 1. Non parameterized constructor
    // day10OOPS() {
    // System.out.println("Hello this is a non parametrized constructor");
    // }

    // 2. parameterized constructor
    String name;
    int rollNo;

    public void print() {
        System.out.println(name);
        System.out.println(rollNo);
    }

    day10OOPS(int rollNo, String name) {
        this.name = name;
        this.rollNo = rollNo;
        print();
    }

    public static void main(String[] args) {
        // day10OOPS o1 = new day10OOPS(); // non parametrized constructor

        // parametrized constructor
        // day10OOPS o1 = new day10OOPS(48, "Shruti");

    }
}
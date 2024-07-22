package OOPS;

import java.util.*;

public class userDataType1 {
    public static class Student {
        int age; // it has common attribute for userDataType
        String name;
    }
    // create user data type only it doesnot allocate memory , it only create data
    // type

    // create a function in which passing class using reference
    public static void changes(Student x) {
        x.age = 8;
    }

    public static void main(String[] args) {
        // example of inbuild class
        // Scanner sc = new Scanner(System.in);
        // int x = sc.nextInt();
        // System.out.println("x" + x);
        Student s1 = new Student(); // userData type have multiple objects
        // object basically alloacted the memory allocation
        System.out.println(s1.age = 30);
        changes(s1);
        System.out.println(s1.age);
        Student s2 = new Student();
        s2.name = "shruti";
        System.out.println(s2.name);
    }
}

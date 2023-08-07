package Oops;

//! public class Student1 {
class Student1 {
    static String SchoolName = "abc school";
    int marks;
    int age;
    String name;

    void printInfo() {

        System.out.println(marks);
        System.out.println(age);
        System.out.println(name);
    }

    static void callStaticFxn() {
        System.out.println(SchoolName);
    }

}

public class OopsPractice {

    // ! public class Student2{

    // }

    public static void main(String[] args) {

        Student1 s1 = new Student1();
        // ! Student2 s2 = new Student2();
        s1.age = 18;
        s1.marks = 95;
        s1.name = "xyz";
        // Student1.SchoolName = "abcd school"; // This is the correct way to change the
        // static property
        // s1.SchoolName = "abcde school"; // it can be change by object also

        // s1.printInfo();
        // System.out.println(Student1.SchoolName);

        Student1.callStaticFxn();

    }

}

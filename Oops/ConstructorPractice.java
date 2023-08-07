package Oops;

class Teacher {

    int id;
    int classes; // upto how many classes teacher will teach
    int age;
    String name;
    String subject;

    Teacher() {
        System.out.println("this is Parent class's default constructor");
        this.classes = 4;

    }

    Teacher(String name, String Subject) { // ! Function signature cant be same - string, string
        System.out.println("Parent class's String, String Constructor");
        this.name = name;
        this.subject = Subject;
    }

    Teacher(int id, int classes, int age, String name, String Subject) { // * Function Sign is - int, int, int, string,

        this.id = id;
        this.classes = classes;
        this.age = age;
        this.name = name;
        this.subject = Subject;
    }

    Teacher(Teacher t) { // * Copy constuctor
        this.id = t.id;
        this.name = t.name;
        this.subject = t.subject;
    }
}

class STeacher extends Teacher {

    int salary;
    String authority;

    STeacher() {
        this.salary = 50000;
        this.authority = "Can Suspend a Student";

    }

    STeacher(int salary, String authority) {
        this.salary = salary;
        this.authority = authority;
    }

    STeacher(String name, String subject) {
        super(name, subject);

    }
}

public class ConstructorPractice {
    public static void main(String[] args) {
        Teacher pri = new Teacher();
        pri.id = 1;
        pri.classes = 5;
        pri.age = 22;
        pri.subject = "Englsih";
        pri.name = "Amit";
        // Teacher t1 = new Teacher("Nikit", "Science");
        // Teacher t2 = new Teacher(pri);
        // System.out.println(t2.name);
        // System.out.println(t1.classes);
        // STeacher t3 = new STeacher();
        // System.out.println(t3.classes);
        // STeacher t4 = new STeacher(60000, "Can as for PTM anytime");
        // System.out.println(t4.classes);
        STeacher t5 = new STeacher("Sujata", "hindi");
        System.out.println(t5.name);
    }

}

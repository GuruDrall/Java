class School {

    String Studentname;
    int SchoolNo = 12;
    String Schoolname;
    int fees;
    int marks;
    String section;

    School() {

    }

    School(int a, int b, String c) { // School(int ,int)

        this.fees = a;
        this.marks = b; // to point something.
        this.section = c;
    }

    School(String a) {

        this.section = a;

    }

    void Schoolprintinfo() {

        System.out.println("hi this is our school info");

        System.out.println(Schoolname);

        System.out.println(Studentname);

        System.out.println(SchoolNo);

    }

    // School(){

    // // fees = 15000;
    // // marks = 100;

    // }

    void printinfo() {
        System.out.println(fees);
        System.out.println(marks);
        System.out.println(section);
    }

}

class branch extends School {

    String teachername;
    String subject;
    String cityofschool;

    branch() {

    }

    branch(String a, String b, String c) {

        this.teachername = a;
        this.subject = b;
        this.cityofschool = c;

    }

    void printinfo() {

        System.out.println(teachername);
        System.out.println(Schoolname);
        System.out.println(Studentname);
        System.out.println(subject);
        System.out.println(cityofschool);
        System.out.println(SchoolNo);

    }

}

public class Inheritance2 {

    public static void main(String[] args) {

        School obj = new School();

        obj.Schoolname = "ABC school";
        obj.Studentname = "Ariz Ali";

        obj.Schoolprintinfo();

        School obj1 = new School(1500, 100, "D");

        obj1.printinfo();

        branch b = new branch("kajal", "Java", "noida");
        b.Schoolname = "ABC school";
        b.Studentname = "Gurdeep";

        b.printinfo();

    }
}
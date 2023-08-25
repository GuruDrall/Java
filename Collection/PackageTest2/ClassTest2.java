package PackageTest2;

import PackageTest1.ClassTest1;

class AccModifierChild extends ClassTest1 {

    void setD(int x) {
        this.d = x;
    }

    void printinfo() {
        System.out.println(b + " " + d);
    }

    // void printInfo() {
    // System.out.println(a + " " + c); //! error because of a is default
    // //! and c is private, cant access in subclass.
    // }

}

public class ClassTest2 {
    public static void main(String[] args) {
        AccModifierChild test = new AccModifierChild();
        test.isDefault();
        test.isPublic();
        test.isPrivate();
        test.setD(50);
        test.isProtected();

    }

}

package PackageTest1;

public class ClassTest1 {
    // public class AccModifier {
    int a;
    public int b;
    private int c;
    protected int d;

    // AccModifier() {
    public ClassTest1() {
        a = 1;
        b = 2;
        c = 3;
        d = 4;
    }

    // * Functions with Access Modifiers */

    public void isDefault() {
        System.out.println(a + " is a default type instance variable");
    }

    public void isPublic() {
        System.out.println(b + " is a public type instance variable");
    }

    public void isPrivate() {
        System.out.println(c + " is a private type instance variable");
    }

    public void isProtected() {
        System.out.println(d + " is a protected type instance variable");
    }

    // }

}

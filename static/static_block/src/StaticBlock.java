public class StaticBlock {
    static int a;

    // static blocks can be used to initialize fields
    // static blocks are called when classes are loaded
    static {
        System.out.println("Static block no.1 - initialize static variable a.");
        a = 10;
        System.out.println("Static block no.1 -> value of a is: " + a);
    }

    static {
        System.out.println("Static block no.2 - initialize static variable a.");
        a = 20;
        System.out.println("Static block no.2 -> value of a is: " + a);
    }
}

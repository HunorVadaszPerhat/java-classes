import package_1.Demo1;

public class Main {
    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        demo1.display();

        // DIFFERENT PACKAGE - NON-SUBCLASS
        // Demo1 is non-sublcass in different package
        // demo1.a -> default member cannot be accessed outside of package as non-subclass
        // demo1.b -> public member can be accessed outside of package as non-subclass
        // demo1.c -> protected member cannot be accessed outside of package as non-subclass
        // demo1.d -> private member cannot be accessed outside of package as non-subclass
        System.out.println(demo1.a + demo1.b + demo1.c + demo1.d);

    }
}
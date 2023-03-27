package package_1;

public class Demo2 {
    Demo1 demo1 = new Demo1();

    // SAME PACKAGE - NON-SUBCLASS
    // Demo1 is non-subclass in same package
    // demo1.a -> default member can be accessed inside of same package as non-subclass
    // demo1.b -> public member can be accessed inside of same package as non-subclass
    // demo1.c -> protected member can be accessed inside of same package as non-subclass
    // demo1.d -> private member cannot be accessed inside of same package as non-subclass
    public void display() {
        System.out.println(demo1.a + demo1.b + demo1.c + demo1.d);
    };
}

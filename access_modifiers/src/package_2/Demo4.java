package package_2;

import package_1.Demo1;

public class Demo4 extends Demo1 {

    // DIFFERENT PACKAGE - SUBCLASS
    // Demo1 is subclass in same package
    // a -> default member cannot be accessed inside of same package as sub-class
    // b -> public member can be accessed inside of same package as sub-class
    // c -> protected member can be accessed inside of same package as sub-class
    // d -> private member cannot be accessed inside of same package as sub-class
    public void display() {
        System.out.println(a + b + c + d);
    }
}

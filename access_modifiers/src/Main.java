import package_1.Demo1;
/*
* Sources:
* https://dxc.udemy.com/course/java-se-programming/learn/lecture/18027383#overview
* https://dxc.udemy.com/course/java-se-programming/learn/lecture/18585551#overview
* */
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
        //System.out.println(demo1.a + demo1.b + demo1.c + demo1.d);

    }
}
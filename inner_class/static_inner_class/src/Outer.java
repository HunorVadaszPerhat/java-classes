public class Outer {
    static int x = 10;
    int y = 20;

    // You cannot use the static keyword with a class unless it is an inner class
    static class Inner {
        void display(){
            System.out.println("From Outer class, x is: " + x);

            // Non-static field 'y' cannot be referenced from a static context
            // System.out.println("From Outer class, y is: " + y);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();

        // Accessing fields and methods of Outer class
        System.out.println("Field from Outer class: " + outer.x);
        outer.outerDisplay();

        System.out.println();

        // Accessing fields and methods of nested Inner class
        Outer.Inner oi = new Outer().new Inner();
        System.out.println("Field from nested Inner class: " + oi.y);
        oi.innerDisplay();
    }
}
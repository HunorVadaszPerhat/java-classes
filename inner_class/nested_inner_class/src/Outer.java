public class Outer {

    int x = 10;

    // Nested Inner class
    class Inner {
        int y = 20;

        // Inner class method has access to fields from both Outer and Inner class
        void innerDisplay(){
            System.out.println("From outer class: " + x);
            System.out.println("From inner class: " + y);
        }
    }

    // Outer class can instantiate nested Inner class and use its fields and methods
    void outerDisplay(){
        Inner inner = new Inner();
        inner.innerDisplay();
        System.out.println("From inner class: " + inner.y);
    }
}

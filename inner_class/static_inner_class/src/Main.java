public class Main {
    public static void main(String[] args) {
        // In nested inner classes it is necessary to write new Outer.new Inner()
        // Meaning, it is necessary to create objects both for Outer and Inner classes
        // With static inner classes it is only necessary to create object of Inner class
        Outer.Inner oi = new Outer.Inner();
        oi.display();
    }
}
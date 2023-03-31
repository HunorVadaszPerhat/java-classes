public class Main {
    public static void main(String[] args) {
        Sub sub = new Sub();

        // accessing method of sub-class
        sub.method2();

        // accessing method of super-class via inheritance
        sub.method1();
    }
}
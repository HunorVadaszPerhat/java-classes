public class Outer {
    public void meth(){
        // abtsract classes cannot be instantiated
        // BUT method of abstract class is overriden
        // SO compiler will create an anonymous class
        // THe anonymous class is instantiated to an object and my will be the reference
        My my = new My() {
            @Override
            void display() {
                System.out.println("From Overriden abstract class");
            }
        };
        my.display();
    }
}

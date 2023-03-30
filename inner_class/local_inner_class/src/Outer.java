import org.w3c.dom.ls.LSOutput;

public class Outer {
    void display(){
        class Inner {
            void innerDisplay(){
                System.out.println("From Inner class");
            }
        }
        Inner inner = new Inner();
        inner.innerDisplay();
    }
}

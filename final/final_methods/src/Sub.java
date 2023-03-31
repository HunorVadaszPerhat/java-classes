public class Sub extends Super {
    // final methods CANNOT BE OVERRIDEN by sub-classes
    // void method1(){}; -> 'method1()' cannot override 'method1()' in 'Super'; overridden method is final

    void method2(){
        System.out.println("Sub class : non-final method2");
    }
}

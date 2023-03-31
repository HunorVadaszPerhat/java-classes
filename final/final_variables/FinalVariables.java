public class FinalVariables {

    // final variable can be directly initialized
    final int MIN = 10;
    final int MAX; // Variable 'MAX' might not have been initialized
    final int NORMAL; // Variable 'NORMAL' might not have been initialized

    // final variable can be initialized in constructor
    public FinalVariables(int MAX, int NORMAL) {
        this.MAX = MAX;
        this.NORMAL = NORMAL;
    }


}

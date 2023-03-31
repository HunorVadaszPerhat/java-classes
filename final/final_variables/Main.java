public class Main {
    public static void main(String[] args) {
        // initializing final variables via constructor
        FinalVariables finalVariables = new FinalVariables(20, 30);

        // accessing final variables
        System.out.println(finalVariables.MIN);
        System.out.println(finalVariables.MAX);
        System.out.println(finalVariables.NORMAL);
    }
}
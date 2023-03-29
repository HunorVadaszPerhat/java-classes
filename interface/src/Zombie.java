public class Zombie implements Human{


    @Override
    public void display() {
        System.out.println("display() from Zombie class");
    }

    @Override
    public void displayDefault() {
        System.out.println("displayDefault() from Zombie class");
    }
}

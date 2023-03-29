public class Main {
    public static void main(String[] args) {
        Zombie zombie = new Zombie();

        // FIELDS
        System.out.println(Zombie.a);

        // METHODS
        zombie.display();
        zombie.displayDefault();
        Human.displayStatic();
    }
}
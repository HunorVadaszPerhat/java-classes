public class Main {
    public static void main(String[] args) {
        // Zombie zombie = new Zombie(); -> Expected 8 arguments but found 0

        Zombie zombie = new Zombie(
                10, 20, 30, 40,
                50, 60, 70, 80);

        // NON-FINAL AND NON-STATIC
        System.out.println("NON-FINAL AND NON-STATIC");
        System.out.println("zombie.a: " + zombie.a);
        // System.out.println(zombie.b); -> 'b' has private access in 'Human
        System.out.println("zombie.c: " + zombie.c);
        System.out.println("zombie.d: " + zombie.d);
        System.out.println();

        // FINAL
        System.out.println("FINAL");
        System.out.println("zombie.e: " + zombie.e);
        // System.out.println(zombie.f); -> 'f' has private access in 'Human'
        System.out.println("zombie.g: " + zombie.g);
        System.out.println("zombie.h: " + zombie.h);
        System.out.println();

        // STATIC
        System.out.println("STATIC");
        System.out.println("Zombie.i: " + Zombie.i);
        // System.out.println(Zombie.j); -> 'j' has private access in 'Human'
        System.out.println("Zombie.k: " + Zombie.k);
        System.out.println("Zombie.l: " + Zombie.l);
        System.out.println();

        // STATIC + FINAL
        System.out.println("STATIC + FINAL");
        System.out.println("Zombie.m: " + Zombie.m);
        // System.out.println(Zombie.n); -> 'n' has private access in 'Human'
        System.out.println("Zombie.m: " + Zombie.o);
        System.out.println("Zombie.m: " + Zombie.p);
        System.out.println();


        // ABSTRACT METHODS
        System.out.println("ABSTRACT METHODS");
        zombie.defaultDisplayAbstract();
        zombie.publicDisplayAbstract();
        // zombie.privateDisplayAbstract(); -> 'privateDisplayAbstract()' has private access in 'Human'
        zombie.protectedDisplayAbstract();
        System.out.println();

        // NON-ABSTRACT METHODS
        System.out.println("NON-ABSTRACT METHODS");
        zombie.defaultDisplayNonAbstract();
        zombie.publicDisplayNonAbstract();
        // zombie.privateDisplayNonAbstract(); -> 'privateDisplayNonAbstract()' has private access in 'Human'
        zombie.protectedDisplayNonAbstract();
    }
}
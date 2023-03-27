public class Zombie extends Human{


    @Override
    void defaultDisplayAbstract() {
        System.out.println("Hello World defaultDisplayAbstract from Zombie class");
    }

    @Override
    public void publicDisplayAbstract() {
        System.out.println("Hello World publicDisplayAbstract from Zombie class");
    }

    @Override
    protected void protectedDisplayAbstract() {
        System.out.println("Hello World protectedDisplayAbstract from Zombie class");
    }

    public Zombie(int a, int b, int c, int d, int i, int j, int k, int l) {
        super(a, b, c, d, i, j, k, l);
    }
}

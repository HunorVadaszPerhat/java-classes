abstract class Human {

    /*
    * METHODS:
    * - can be both abstract and non-abstract
    * - non-abstract methods can have all access modifiers (default, public, private, protected)
    * - abstract methods can have all access modifiers (default, protected, public) EXCEPT private
    * */

    // DEFAULT + NON-ABSTRACT
    void defaultDisplayNonAbstract(){
        System.out.println("Hello World from defaultDisplayNonAbstract");
    }

    // PUBLIC + NON-ABSTRACT
    public void publicDisplayNonAbstract(){
        System.out.println("Hello World publicDisplayNonAbstract");
    }

    // PRIVATE + NON-ABSTRACT
    private void privateDisplayNonAbstract(){
        System.out.println("Hello World from privateDisplayNonAbstract");
    }

    // PROTECTED + NON-ABSTRACT
    protected void protectedDisplayNonAbstract(){
        System.out.println("Hello World from protectedDisplayNonAbstract");
    }

    // DEFAULT + ABSTRACT
    abstract void defaultDisplayAbstract();

    // PUBLIC + ABSTRACT
    abstract public void publicDisplayAbstract();

    // PRIVATE + ABSTRACT
    // Illegal combination of modifiers: 'abstract' and 'private'
    //abstract private void privateDisplayAbstract();

    // PROTECTED + ABSTRACT
    abstract protected void protectedDisplayAbstract();


    /*
    * FIELDS:
    *  - all access modifiers are allowed (default, public, private, protected)
    * - fields can be static and non-static
    * - fields can be final and non-final
    * */
    int a;
    private int b;
    public int c;
    protected int d;

    final int e = 10;
    private final int f = 20;
    public final int g = 30;
    protected final int h = 40;

    static int i = 10;
    private static int j = 20;
    public static int k = 30;
    protected static int l = 40;

    static final int m = 10;
    private static final int n = 20;
    public static final int o = 30;
    protected static final int p = 40;

    // Constructor ONLY takes fields that are non-static and non-final
    // since final and static fields CANNOT BE CHANGED
    public Human(
            // NON-STATIC AND NON-FINAL
            int a, int b, int c, int d,
            // STATIC
            int i, int j, int k, int l
            // FINAL -> Cannot assign a value to final variable
            // STATIC + FINAL -> Cannot assign a value to final variable
    ) {
        // NON-STATIC AND NON-FINAL
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;

        // FINAL
        // this.e = e; -> Cannot assign a value to final variable 'e'
        // this.f = f; -> Cannot assign a value to final variable 'f'
        // this.g = g; -> Cannot assign a value to final variable 'g'
        // this.h = h; -> Cannot assign a value to final variable 'h'

        // STATIC
        Human.i = i;
        Human.j = j;
        Human.k = k;
        Human.l = l;

        // STATIC + FINAL
        // this.m = m; -> Cannot assign a value to final variable 'm'
        // this.n = n; -> Cannot assign a value to final variable 'n'
        // this.o = o; -> Cannot assign a value to final variable 'o'
        // this.p = p; -> Cannot assign a value to final variable 'p'
    }
}

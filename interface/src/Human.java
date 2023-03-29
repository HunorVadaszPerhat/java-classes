public interface Human {
    // ACCESS MODIFIERS
    int a = 10;

    // -> Modifier 'private' not allowed her
    // private int b = 20;

    // -> Modifier 'protected' not allowed here
    // protected int c = 30;

    // -> Modifier 'public' is redundant for interface members
    public int d = 40;

    // STATIC
    // -> Modifier 'static' is redundant for interface fields
    static int e = 10;

    // -> Modifier 'static' is redundant for interface fields
    // -> Modifier 'private' not allowed here
    // static private int f = 20;

    // -> Modifier 'static' is redundant for interface fields
    // Modifier 'protected' not allowed here
    // static protected int g = 30;

    // -> Modifier 'static' is redundant for interface fields
    // -> Modifier 'public' is redundant for interface members
    static public int h = 40;

    // FINAL
    // -> Modifier 'final' is redundant for interface fields
    final int i = 10;

    // -> Modifier 'final' is redundant for interface fields;
    // -> Modifier 'private' not allowed here
    // final private  int j = 20;

    // > Modifier 'final' is redundant for interface fields;
    // -> Modifier 'protected' not allowed here
    // final protected int k = 30;

    // -> Modifier 'final' is redundant for interface fields
    // -> Modifier 'public' is redundant for interface members
    final public int l = 40;

    // -> Modifier 'static' is redundant for interface fields
    // -> Modifier 'final' is redundant for interface fields
    static final int m = 10;

    // -> Modifier 'private' not allowed here
    // -> Modifier 'static' is redundant for interface fields
    // -> Modifier 'final' is redundant for interface fields
    // private static final int n = 20;

    // -> Modifier 'public' is redundant for interface members
    // Modifier 'static' is redundant for interface fields
    // Modifier 'final' is redundant for interface fields
    public static final int o = 30;

    // -> Modifier 'protected' not allowed here
    // -> Modifier 'static' is redundant for interface fields
    // -> Modifier 'final' is redundant for interface fields
    // protected static final int p = 40;

    // CONSTRUCTORS ARE NOT ALLOWED
    // public Human(){} -> Not allowed in interface


    // DEFAULT + NON-ABSTRACT
    // -> Interface abstract methods cannot have body
    // void defaultDisplayNonAbstract(){System.out.println("Hello World from defaultDisplayNonAbstract");}

    // PUBLIC + NON-ABSTRACT
    // -> Interface abstract methods cannot have body
    // public void publicDisplayNonAbstract(){System.out.println("Hello World publicDisplayNonAbstract");}

    // PRIVATE + NON-ABSTRACT
    // -> Interface abstract methods cannot have body
    // private void privateDisplayNonAbstract(){System.out.println("Hello World from privateDisplayNonAbstract");}

    // PROTECTED + NON-ABSTRACT
    // -> Modifier 'protected' not allowed here
    // -> Interface abstract methods cannot have body
     // protected void protectedDisplayNonAbstract(){System.out.println("Hello World from protectedDisplayNonAbstract");}

    // DEFAULT + ABSTRACT
    // -> Modifier 'abstract' is redundant for interface methods
    abstract void defaultDisplayAbstract();

    // PUBLIC + ABSTRACT
    // -> Modifier 'abstract' is redundant for interface methods
    // -> Modifier 'public' is redundant for interface members
    abstract public void publicDisplayAbstract();

    // PRIVATE + ABSTRACT
    // -> Illegal combination of modifiers: 'abstract' and 'private'
    //abstract private void privateDisplayAbstract();

    // PROTECTED + ABSTRACT
    // -> Modifier 'abstract' is redundant for interface methods
    // -> Modifier 'protected' not allowed here
    // abstract protected void protectedDisplayAbstract();

    // Default methods: allow us to add new methods to an interface that are automatically available in the implementations
    // Source: https://www.baeldung.com/java-static-default-methods
    // DEFAULT METHODS
    default void displayDefault(){
        System.out.println("default void displayDefault()");
    };

    // -> Modifier 'public' is redundant for interface members
    public default void displayPublicDefault(){
        System.out.println("public default void displayPublicDefault()");
    };

    // -> Illegal combination of modifiers: 'default' and 'private'
    // private default void displayPrivateDefault(){};

    // -> Modifier 'protected' not allowed here
    // protected default void displayProtectedDefault(){};


    // STATIC METHODS
    static void displayStatic(){
        System.out.println("default void displayDefault()");
    };

    // -> Modifier 'public' is redundant for interface members
    public static void displayPublicStatic(){
        System.out.println("public default void displayPublicDefault()");
    };

    // OK - BUT WHAT TO USE IT FOR?!
    private static void displayPrivateStatic(){};

    // -> Modifier 'protected' not allowed here
    // protected static void displayProtectedStatic(){};
}

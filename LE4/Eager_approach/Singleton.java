public class Singleton {
    private static final Singleton INSTANCE = new Singleton(); 

    private Singleton() {
        System.out.println("Instance Created");
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }
}
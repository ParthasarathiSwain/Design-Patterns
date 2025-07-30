//Singleton using Inner Static Class

public class SingletonBest {

    // Private constructor prevents instantiation
    private SingletonBest() {
        System.out.println("Singleton Instance Created");
    }

    // Inner static class responsible for holding the Singleton instance
    private static class SingletonHelper {
        private static final SingletonBest INSTANCE = new SingletonBest();
    }

    // Global access point
    public static SingletonBest getInstance() {
        return SingletonHelper.INSTANCE;
    }
}

public class TestSingletonBest {
    public static void main(String[] args) {
        Runnable task = () -> {
            SingletonBest instance = SingletonBest.getInstance();
            System.out.println(Thread.currentThread().getName() + ": " + instance.hashCode());
        };

        Thread t1 = new Thread(task, "Thread-A");
        Thread t2 = new Thread(task, "Thread-B");
        Thread t3 = new Thread(task, "Thread-C");

        t1.start();
        t2.start();
        t3.start();
    }
}

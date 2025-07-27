package DesignPattern;
public class SingletonThreadSafeTest {
    public static void main(String[] args) {
        // Step 1: Create multiple threads to simulate concurrent access
        Runnable task = () -> {
            // Get the Singleton instance
            SingletonThreadSafe singleton = SingletonThreadSafe.getInstance();
            singleton.showMessage();
            // Print the instance to check if it's the same across threads
            System.out.println("Instance: " + singleton);

        };
        // Step 2: Create and start multiple threads
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);
        thread1.start();
        thread2.start();
        thread3.start();
        try {
            // Wait for all threads to finish
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
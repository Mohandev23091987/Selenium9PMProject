package DesignPattern;

public class SingletonTest {
    public static void main(String[] args) {
        // Step 4: Access the Singleton instance using getInstance()
        Singleton singleton1 = Singleton.getInstance(); // First call creates the instance
        singleton1.displayMessage(); // Calling a method to test the instance

        Singleton singleton2 = Singleton.getInstance(); // Second call returns the same instance
        singleton2.displayMessage(); // Calling a method to test the instance

        // Check if both instances are the same
        System.out.println("Are both instances the same? " + (singleton1 == singleton2));

        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());

    }
}

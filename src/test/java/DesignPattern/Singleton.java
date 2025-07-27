package DesignPattern;

public class Singleton {
    // Step 1: Private static instance of the class (only one instance will be created)
    private static Singleton instance;

    // Step 2: Private constructor to prevent direct instantiation
    private Singleton() {
        // Initialization logic here (if any)
        System.out.println("Singleton instance created!");
    }

    // Step 3: Public static method to get the instance of the class
    public static Singleton getInstance() {
        if (instance == null) {
            // If the instance doesn't exist, create it
            instance = new Singleton();
        }
        return instance; // Return the existing instance
    }

    // Method to demonstrate Singleton functionality
    public void displayMessage() {
        System.out.println("Hello from the Singleton class!");
    }
}
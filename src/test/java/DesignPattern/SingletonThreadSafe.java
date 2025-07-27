package DesignPattern;
public class SingletonThreadSafe {
    // Step 1: Declare the static instance variable and mark it as volatile
    private static volatile SingletonThreadSafe instance;


    // Step 2: Private constructor to prevent instantiation from outside
    private SingletonThreadSafe() {
        // Private constructor to prevent direct instantiation
    }

    // Step 3: Public static method to get the instance of the class
    public static SingletonThreadSafe getInstance() {
        if(instance==null){
            synchronized (SingletonThreadSafe.class){
                if(instance==null){
                    instance = new SingletonThreadSafe();
                }
            }
        }
        return instance;
    }


    // Method to demonstrate Singleton functionality
    public void showMessage() {
        System.out.println("Hello from Singleton class!");
    }
}
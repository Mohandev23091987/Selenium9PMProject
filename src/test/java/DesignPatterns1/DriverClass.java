package DesignPatterns1;

public class DriverClass {

    public static void main(String[] args) {

       Singleton obj1 = Singleton.getObj();
       obj1.displayMessage();


        Singleton obj2 = Singleton.getObj();
        obj2.displayMessage();


        System.out.println("are both instances are same ?"+ (obj1 == obj2));

    }
}

package DesignPatterns1;

public class Singleton {

    //1) make your instance or object as private static
    private static Singleton obj;


    //2)Create private constructor
    private Singleton(){

    }

    //3)create public static method => inside that object creation => this method is going to return the obj

    public static Singleton getObj(){
        if(obj == null){
            //if object doesn't exist or not created, then create it
            obj= new Singleton();
        }
        return obj;
    }

    public void displayMessage(){
        System.out.println("Hello this is normal class now ");
    }

    public void callMessage(){
        System.out.println("Hello this is normal class now ");
    }
}

package LambdaExpressions;

public class MainClass {

    public static void main(String[] args) {
      //anonymous class
//        Animal animal = new Animal(){
//           @Override
//            public void show(String animal, int speed){
//                System.out.println(animal + "'s speed is "+speed);
//            }
//
//        };
//
//        animal.show("Cheetah",120);
//    }

        //lambda expression

//        Animal animalobj = (String animal, int speed) ->{
//            System.out.println(animal + "'s speed is "+speed);
//        };

        Animal animalobj = (animal, speed) -> System.out.println(animal + "'s speed is "+speed);


        animalobj.show("Cheetah",120);

    }
}

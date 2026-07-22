/**
 * oops1
 */class Animal {
        public void AnimalSound(){
            System.out.println("This animal makes sound");
        }
       }

       class Dog extends Animal {
        public void AnimalSound(){
            System.err.println("The Dogs Sounds like bow bow");
        }
       }

       class Pig extends Animal{
        public void AnimalSound(){
            System.out.println("The Pig sounds like wee wee");
        }
       }

   public class oop{
        public static void main(String[] args) {
    Animal myAnimal = new Animal(); 
    Pig myPig = new Pig();  
    Dog myDog = new Dog();
    myAnimal.AnimalSound();
    myPig.AnimalSound();
    myDog.AnimalSound();
        }

    }   
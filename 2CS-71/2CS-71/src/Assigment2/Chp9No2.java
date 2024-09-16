package Assigment2;

//Abstract base class
abstract class Animal {
 // Abstract method
 abstract void sound();
}

//Dog subclass
class Dog extends Animal {
 // Implementing the abstract method
 @Override
 void sound() {
     System.out.println("The dog barks");
 }
}

//Cat subclass
class Cat extends Animal {
 // Implementing the abstract method
 @Override
 void sound() {
     System.out.println("The cat meows");
 }
}

//Test the classes
public class Chp9No2 {
 public static void main(String[] args) {
     // Create instances of Dog and Cat
     Animal myDog = new Dog();
     Animal myCat = new Cat();
     
     // Invoke the sound() method
     myDog.sound();  // Output: The dog barks
     myCat.sound();  // Output: The cat meows
 }
}


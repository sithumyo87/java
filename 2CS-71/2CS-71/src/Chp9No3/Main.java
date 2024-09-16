package Chp9No3;

public class Main {
    public static void main(String[] args) {
        AnimalList animalList = new AnimalList();

        Animal dog = new Animal("Dog");
        Animal cat = new Animal("Cat");
        Animal bird = new Animal("Bird");

        // Add animals to the list
        animalList.addAnimal(dog);
        animalList.addAnimal(cat);
        animalList.addAnimal(bird);

        // Get an animal by index
        System.out.println(animalList.getAnimalAt(1)); // Output: Animal: Cat

        // Remove an animal by object
        animalList.removeAnimal(cat);

        // Get the size of the list
        System.out.println("Size of animal list: " + animalList.size()); // Output: 2
    }
}

package Chp9No3;

import java.util.Vector;

public class AnimalList {
    private Vector<Animal> animals;

    public AnimalList() {
        animals = new Vector<>();
    }

    // Method to add an Animal to the list
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    // Method to remove an Animal from the list by object reference
    public boolean removeAnimal(Animal animal) {
        return animals.remove(animal);
    }

    // Method to remove an Animal from the list by index
    public Animal removeAnimalAt(int index) {
        if (index >= 0 && index < animals.size()) {
            return animals.remove(index);
        } else {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + animals.size());
        }
    }

    // Method to get the Animal at a specific index
    public Animal getAnimalAt(int index) {
        if (index >= 0 && index < animals.size()) {
            return animals.get(index);
        } else {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + animals.size());
        }
    }

    // Method to get the size of the Animal list
    public int size() {
        return animals.size();
    }
}

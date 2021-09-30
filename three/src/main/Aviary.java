package main;

import animals.Animal;

import java.util.HashMap;
import java.util.Map;

public class Aviary<T extends Animal> {
    private Map<String, T> animals = new HashMap<>();
    private AviarySize aviarySize = AviarySize.EXTRA_SMALL;

    public T add(T animal) {
        if (animal.getAviarySize().value > this.aviarySize.value) {
            System.out.println("Животное " + animal.getName() + " слишком большое для вольера!!!");
        } else {
            animals.put(animal.getName(), animal);
            System.out.println("Животное " + animal.getName() + " успешно добавлено в вольер");
        }
        return animal;
    }

    public T delete(T animal) {
        this.animals.remove(animal.getName(), animal);
        return animal;
    }

    public T getAnimal(String animalName) {
        return animals.get(animalName);
    }

    public void printAnimals() {
        for (T animal : animals.values()) {
            System.out.println(animal);
        }
        System.out.println();
    }

    public boolean setAviarySize(AviarySize aviarySize) {
        if (animals.isEmpty() || (aviarySize.value <= this.aviarySize.value)) {
            this.aviarySize = aviarySize;
            return true;
        }
        return false;
    }

    public enum AviarySize {
        EXTRA_SMALL(100),
        SMALL(200),
        MEDIUM(300),
        LARGE(400);

        private int value;

        AviarySize(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}

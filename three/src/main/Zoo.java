package main;

import animals.*;
import food.*;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom", 68);
        Duck duck = new Duck("Emmy", 89);
        Duck duck2 = new Duck("Alfie", 49);
        Duck duck3 = new Duck("Charlie", 81);
        Duck duck4 = new Duck("Daisy", 38);
        Fish fish = new Fish("Felix", 58);
        Rabbit rabbit = new Rabbit("Rex", 76);
        Wolf wolf = new Wolf("Alex", 100);
        Cow cow = new Cow("Marta", 99);

        Aviary<Carnivorous> carnivores = new Aviary<>();
        carnivores.setAviarySize(Aviary.AviarySize.LARGE);
        carnivores.add(wolf);
        carnivores.add(cat);
        carnivores.add(fish);

        System.out.println("Животные в вольере для плотоядных:");
        carnivores.printAnimals();

        Aviary<Herbivore> herbivores = new Aviary<>();
        herbivores.setAviarySize(Aviary.AviarySize.MEDIUM);
        herbivores.add(cow);
        herbivores.add(rabbit);
        herbivores.add(duck);
        herbivores.add(duck2);
        herbivores.add(duck3);
        herbivores.add(duck4);
        System.out.println();

        System.out.println("Животные в вольере для травоядных:");
        herbivores.printAnimals();

        ArrayList<Food> feed = new ArrayList<>();
        Carrot carrot = new Carrot();
        Dandelion dandelion = new Dandelion();
        Hay hay = new Hay();
        FishMeat fishMeat = new FishMeat();
        HareMeat hareMeat = new HareMeat();
        Gammarus gammarus = new Gammarus();
        feed.add(carrot);
        feed.add(dandelion);
        feed.add(hay);
        feed.add(fishMeat);
        feed.add(hareMeat);
        feed.add(gammarus);

        Worker worker = new Worker();
        worker.feed(rabbit, fishMeat);
        worker.feed(rabbit, hay);
        worker.feed(cow, gammarus);
        worker.feed(cat, fishMeat);
        System.out.println();

        Carnivorous cat2 = carnivores.getAnimal("Cat-Tom");
        System.out.println(cat);
        System.out.println(cat2);
        cat.run();//когда животное совершает какое-то действие, его уровень сытости уменьшается

        System.out.println();
        System.out.println("После изменения:");
        System.out.println(cat2);
        System.out.println(cat);

        System.out.println();

        carnivores.delete(cat);
        System.out.println("Животные в вольере для плотоядных:");
        carnivores.printAnimals();
    }
}

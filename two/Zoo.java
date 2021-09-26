package homework.two;

import homework.two.animals.*;
import homework.two.behavior.Swim;
import homework.two.behavior.Voice;
import homework.two.food.*;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        Cat cat = new Cat();
        Duck duck = new Duck();
        Fish fish = new Fish();
        Rabbit rabbit = new Rabbit();
        Wolf wolf = new Wolf();
        Cow cow = new Cow();
        animals.add(cat);
        animals.add(duck);
        animals.add(rabbit);
        animals.add(wolf);
        animals.add(cow);
        animals.add(fish);

        ArrayList<Swim> pond = new ArrayList<>();
        pond.add(duck);
        pond.add(fish);
        pond.add(cat);

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

        for (Animal animal : animals) {
            for (Food food : feed) {
                System.out.println("Кормим животное " + animal.getClass().getSimpleName() +
                        " кормом " + food.getClass().getSimpleName());
                worker.feed(animal, food);
            }
        }

        System.out.println();
        for (Swim animal : pond) {
            System.out.println("Животное " + animal.getClass().getSimpleName() +
                    " начало плыть");
            animal.swim();
        }

        ArrayList<Voice> notSilence = new ArrayList<>();
        notSilence.add(cat);
        notSilence.add(duck);
        notSilence.add(wolf);
        notSilence.add(cow);

        System.out.println();
        for (Voice animal : notSilence) {
            System.out.println("Животное " + animal.getClass().getSimpleName() +
                    " издало звук: " + worker.getVoice(animal));
        }

    }
}

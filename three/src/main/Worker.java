package main;

import animals.Animal;
import behavior.Voice;
import food.Food;
import food.WrongFoodException;

/**
 * Класс, реализующий работника
 *
 * @version 1.0
 * @autor Pohilenko Valeria
 */
public class Worker {
    public void feed(Animal animal, Food food){
        try {
            animal.eat(food);
        } catch (WrongFoodException wrongFoodException) {
            //wrongFoodException.printStackTrace();
            System.out.println(wrongFoodException.getMessage());
        }

    }
    public <T extends Voice> String getVoice(T animal){
        return animal.voice();
    }
}
